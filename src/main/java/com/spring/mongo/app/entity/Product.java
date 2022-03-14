package com.spring.mongo.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Product {
    @Id
    private String id;
    private Long quantity;
    private Map<String, String> features;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String category;

}
