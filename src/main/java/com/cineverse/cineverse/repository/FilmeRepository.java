package com.cineverse.cineverse.repository;

import com.cineverse.cineverse.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
