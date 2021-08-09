package com.ac.sefaz.learning.simplecrudspring.repository;


import com.ac.sefaz.learning.simplecrudspring.entities.rh.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {



}
