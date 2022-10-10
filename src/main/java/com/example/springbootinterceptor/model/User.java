package com.example.springbootinterceptor.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "user", schema = "public")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {
    private static final long serialVersionUID = 3366873941736001522L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;
}
