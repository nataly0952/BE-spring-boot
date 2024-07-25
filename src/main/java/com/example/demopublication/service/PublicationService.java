package com.example.demopublication.service;

import com.example.demopublication.model.PublicationEntity;
import com.example.demopublication.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PublicationService {
    private final PublicationRepository publicationRepository;

    @Autowired
    public PublicationService(PublicationRepository publicationRepository) {
        this.publicationRepository = publicationRepository;
    }

    public List<PublicationEntity> getAllPublications() {
        return publicationRepository.findAll();
    }

    public PublicationEntity getPublicationByTitle(String title) {
        return publicationRepository.findByTitle(title);
    }

    public List<PublicationEntity> getPublicationsByAuthor(String author) {
        return publicationRepository.findByAuthor(author);
    }

    public List<PublicationEntity> getPublicationsByDate(LocalDate date) {
        return publicationRepository.findByDate(date);
    }

    public List<PublicationEntity> getPublicationsByCategory(String category) {
        return publicationRepository.findByCategory(category);
    }
    public List<PublicationEntity> searchPublications(String query) {
        return publicationRepository.findByTitleContainingIgnoreCaseOrAboutContainingIgnoreCaseOrCategoryContainingIgnoreCase(query, query, query);
    }
}
