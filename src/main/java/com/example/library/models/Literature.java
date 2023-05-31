package com.example.library.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@Table(name = "literature", schema = "public")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Literature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "literature_id")
    private Long literatureId;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "year_of_publishing")
    private Long yearOfPublishing;

    @Column(name = "edition")
    private String edition;

    @Column(name = "availability")
    private String availability;

    @Column(name = "date_of_admission")
    private LocalDateTime dateOfAdmission;

    @Column(name = "point_of_issue_id")
    private Long pointOfIssueId;
}


