package com.samsung.basicsecurity.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "products")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String picture;
    private long price;
    private String description;
    @ManyToOne
    @JoinColumn(name = "catalog_Id")  // tên cột khóa ngoại trong bảng Product
    private Catalogs catalog;
}
