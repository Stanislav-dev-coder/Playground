package com.stanislav.playground.rest;

import com.stanislav.playground.core.models.Film;
import com.stanislav.playground.core.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
Запрос на все фильмы - complete
Запрос на добавление фильма - POST - complete
Запрос на удаление фильма - DELETE - complete
Запрос на изменение фильма - PUT
Запрос на один фильм - GET - complete
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

    @GetMapping("/{name}")
    public ResponseEntity<Optional<Film>> findByName(@PathVariable(name = "name") String name){
        var result = filmService.findByName(name);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/add")
    public ResponseEntity<Film> addFilm(@RequestBody Film film){
        Film filmSave = filmService.saveFilm(film);
        return ResponseEntity.ok(filmSave);
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<Optional<Boolean>> delFilm(@PathVariable(name = "id") Long Id){
        Optional<Boolean> result = filmService.delFilm(Id);
        return ResponseEntity.ok(result);
    }

//    @PutMapping
//    public  ResponseEntity<Film> editFilm(){
//
//    }
}
