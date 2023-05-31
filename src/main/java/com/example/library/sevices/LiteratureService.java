package com.example.library.sevices;

import com.example.library.models.Literature;
import com.example.library.repositories.LiteratureRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class LiteratureService {
    private final LiteratureRepository literatureRepository;


    public List<Literature> listLiterature(String title){
        if (title != null){
            return literatureRepository.findAllByTitle(title);
        }
        return literatureRepository.findAll();
    }

    public void saveLiterature(Literature literature){
        log.info("Saving new {}", literature);
        literatureRepository.save(literature);
    }

    public void deleteLiterature(Long id){
        literatureRepository.deleteById(id);
    }

    public Literature getLiteratureById(Long id) {
        return literatureRepository.findById(id).orElse(null);
    }

    public void updateBybId(Long id, Literature literature) {
        Optional<Literature> oldOp = literatureRepository.findById(id);
        var old = oldOp.get();
        if (!literature.getTitle().equals("")){
            old.setTitle(literature.getTitle());
        }
        if (!literature.getAuthor().equals("")){
            old.setAuthor(literature.getAuthor());
        }
        if (literature.getYearOfPublishing() != null){
            old.setYearOfPublishing(literature.getYearOfPublishing());
        }
        if (!literature.getEdition().equals("")){
            old.setEdition(literature.getEdition());
        }
        if (!literature.getAvailability().equals("")){
            old.setAvailability(literature.getAvailability());
        }
        if (literature.getDateOfAdmission() != null){
            old.setDateOfAdmission(literature.getDateOfAdmission());
        }
        if (literature.getPointOfIssueId() != null){
            old.setPointOfIssueId(literature.getPointOfIssueId());
        }
        literatureRepository.save(old);
    }
}
