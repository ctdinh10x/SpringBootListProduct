package com.samsung.basicsecurity.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "catalogs")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Catalogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "bit default 0")
    private Boolean status;
}
