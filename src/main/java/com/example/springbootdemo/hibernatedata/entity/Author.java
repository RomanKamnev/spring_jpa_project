package com.example.springbootdemo.hibernatedata.entity;




import lombok.*;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(catalog = "spring_library")
@Getter @Setter
public class Author {

    @Id
    private int id;

    private String fio;

    private Date birthday;

    public Author() {
    }

    public Author(int id, String fio, Date birthday) {
        this.id = id;
        this.fio = fio;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + fio + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
