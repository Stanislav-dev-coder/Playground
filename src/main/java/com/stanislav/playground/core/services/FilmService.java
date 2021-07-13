package com.stanislav.playground.core.services;

import com.stanislav.playground.core.models.Film;
import com.stanislav.playground.core.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> findAllFilms(){
        var result = filmRepository.findAll();
        return result;
    }

}
