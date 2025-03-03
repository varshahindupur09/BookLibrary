package com.poc.bookingapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "book_t")
@Data
public class Book implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    private String bookName;
    private Double price;
    private String description;
    private LocalDate publicationDate;
    private String author;
}
