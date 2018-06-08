//package com.example.springbootdemo.mongodata;
//
//import lombok.extern.apachecommons.CommonsLog;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DbSeeder implements CommandLineRunner {
//
//    private GenreRepository genreRepository;
//
//    public DbSeeder(GenreRepository genreRepository) {
//        this.genreRepository = genreRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Genre romance = new Genre(1, "Romance", 100);
//        Genre triller = new Genre(2, "Triller", 85);
//
//        genreRepository.deleteAll();
//        genreRepository.save(romance);
//        genreRepository.save(triller);
//    }
//
//
//}
