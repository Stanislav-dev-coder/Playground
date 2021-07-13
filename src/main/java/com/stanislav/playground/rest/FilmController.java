package com.stanislav.playground.rest;

import com.stanislav.playground.core.models.Film;
import com.stanislav.playground.core.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
Запрос на все фильмы - выполнено
Запрос на добавление фильма - POST
Запрос на удаление фильма - DELETE
Запрос на изменение фильма - PUT
Запрос на один фильм - GET
 */

@RestController
@RequestMapping(value = "/films")
public class FilmController {

    FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Film>> findAllFilms(){
        var result = filmService.findAllFilms();
        return ResponseEntity.ok(result);
    }
}
