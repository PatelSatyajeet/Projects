package com.brontoo.blog.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_name",nullable=false,length=100)
    private String name;
    @Column(name = "user_email",nullable=false,length=100)
    private String email;
    @Column(name = "user_password",nullable=false,length=100)
    private String password;
    @Column(name = "user_about",nullable=false,length=100)
    private String about;
}
