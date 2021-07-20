package com.stanislav.playground.core.services;

import com.stanislav.playground.core.models.Film;
import com.stanislav.playground.core.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

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

    public Optional<Film> findByName(String name){
        var result = filmRepository.findByName(name);
        return result;
    }

    public Film saveFilm(Film film){
        Film newEntity = new Film();
        newEntity.setName(film.getName());
        newEntity.setGenre(film.getGenre());
        newEntity.setYear(film.getYear());
        newEntity.setDirector(film.getDirector());
        newEntity.setIMDB(film.getIMDB());
        return filmRepository.save(newEntity);
    }

    public Optional<Boolean> delFilm(Long Id){
        Optional<Film> result = filmRepository.findById(Id);
        return result
                .map(film -> {
                    filmRepository.deleteById(Id);
                    return true;
                });
    }

    public Optional<Film> editFilm(Long Id, Film film){
        Optional<Film> result = filmRepository.findById(Id);
        return result
                .map(entity -> {
                    entity.setName(film.getName());
                    entity.setGenre(film.getGenre());
                    entity.setYear(film.getYear());
                    entity.setDirector(film.getDirector());
                    entity.setIMDB((film.getIMDB()));
                    return filmRepository.save(entity);
                });
    }

}
