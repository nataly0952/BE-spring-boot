package com.example.demopublication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "publication")
public class PublicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "title", nullable = false)
    String title;

    @Column(name = "author", nullable = false)
    String author;

    @Column(name = "date", nullable = false)
    LocalDate date;

    @Column(name = "category", nullable = false)
    String category;

    @Column(name = "about", nullable = false)
    String about;

    @Column(name = "link", nullable = false)
    String link;

    public PublicationEntity() {
    }

    public PublicationEntity(Integer id, String title, String author, LocalDate date, String category, String about, String link) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.date = date;
        this.category = category;
        this.about = about;
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAbout() { return about;     }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
