package com.example.demopublication.controller;

import com.example.demopublication.model.PublicationEntity;
import com.example.demopublication.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/publications")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PublicationController {
    private static final Logger logger = Logger.getLogger(PublicationController.class.getName());
    private final PublicationService publicationService;

    @Autowired
    public PublicationController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }

    @GetMapping
    public List<PublicationEntity> getAllPublications() {
        logger.info("Received request to get all publications");
        return publicationService.getAllPublications();
    }

    @GetMapping("/title/{title}")
    public PublicationEntity getPublicationByTitle(
            @PathVariable String title) {
        return publicationService.getPublicationByTitle(title);
    }

    @GetMapping("/author/{author}")
    public List<PublicationEntity> getPublicationsByAuthor(
            @PathVariable String author) {
        return publicationService.getPublicationsByAuthor(author);
    }

    @GetMapping("/category/{category}")
    public List<PublicationEntity> getPublicationsByCategory(
            @PathVariable String category) {
        return publicationService.getPublicationsByCategory(category);
    }

    @GetMapping("/date/{date}")
    public List<PublicationEntity> getPublicationsByDate(
            @PathVariable LocalDate date) {
        return publicationService.getPublicationsByDate(date);
    }
    @GetMapping("/search")
    public List<PublicationEntity> searchPublications(@RequestParam String query) {
        logger.info("Received search request with query: " + query);
        return publicationService.searchPublications(query);
    }

}
