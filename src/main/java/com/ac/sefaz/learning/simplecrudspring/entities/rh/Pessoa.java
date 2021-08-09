package com.ac.sefaz.learning.simplecrudspring.entities.rh;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;


@Getter
@Setter
@EqualsAndHashCode
@Entity
@NoArgsConstructor


public class Pessoa {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;

    @DateTimeFormat(fallbackPatterns = "yyyy-MM-dd")
    private LocalDate dataNascimento;


    private String cpf;


    private String email;

    private String telefone;




}
