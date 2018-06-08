//package com.example.springbootdemo.mongodata;
//
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.data.mongodb.core.index.IndexDirection;
//import org.springframework.data.mongodb.core.index.Indexed;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import javax.persistence.Id;
//
//@Document(collection="Genres")
//@Getter @Setter
//public class Genre {
//
//    @Id
//    private int id;
//    private String genre;
//    @Indexed(direction = IndexDirection.ASCENDING)
//    private int rating;
//
//    public Genre() {
//    }
//
//    public Genre(int id, String genre, int rating) {
//        this.id = id;
//        this.genre = genre;
//        this.rating = rating;
//    }
//}
