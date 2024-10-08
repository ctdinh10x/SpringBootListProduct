package com.samsung.basicsecurity.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    private String password;
    private String confirmpassword;

    private String fullname;
    private String phone;
    private String email;
    @Column(columnDefinition = "BIT 0")
    private Boolean status;
    @OneToMany(mappedBy = "user")
    private Set<Orders> orders;
}
