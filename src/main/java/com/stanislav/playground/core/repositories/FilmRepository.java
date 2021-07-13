package com.stanislav.playground.core.repositories;

import com.stanislav.playground.core.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FilmRepository extends JpaRepository<Film, Long> {
    Optional<Film> findByName(String name);
}
