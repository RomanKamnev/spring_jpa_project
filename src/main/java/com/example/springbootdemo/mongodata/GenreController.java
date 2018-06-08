//package com.example.springbootdemo.mongodata;
//
//
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/genres")
//public class GenreController {
//
//    private GenreRepository genreRepository;
//
//    public GenreController(GenreRepository genreRepository) {
//        this.genreRepository = genreRepository;
//    }
//
//    @GetMapping("/all")
//    public List<Genre> getAll(){
//
//        List<Genre> genres = this.genreRepository.findAll();
//
//        return genres;
//    }
//
//    @PostMapping("/save")
//    public void update(@RequestBody Genre genre) {
//        this.genreRepository.save(genre);
//    }
//}
