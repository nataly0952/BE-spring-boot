package com.example.demopublication.repository;

import com.example.demopublication.model.PublicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PublicationRepository extends JpaRepository<PublicationEntity, Integer> {
    PublicationEntity findByTitle(String title);
    List<PublicationEntity> findByAuthor(String author);
    List<PublicationEntity> findByDate(LocalDate date);
    List<PublicationEntity> findByCategory(String category);
}
