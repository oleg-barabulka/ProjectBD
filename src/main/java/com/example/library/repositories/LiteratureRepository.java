package com.example.library.repositories;

import com.example.library.models.Literature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LiteratureRepository extends JpaRepository<Literature, Long> {
    List<Literature> findAllByTitle(String title);

}
