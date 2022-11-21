package com.example.spring_boot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "books")
public class Book {
    private String id;
    private String name;
    private String authorName;git init
    git add

}
