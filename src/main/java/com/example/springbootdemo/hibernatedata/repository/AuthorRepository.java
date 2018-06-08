package com.example.springbootdemo.hibernatedata.repository;

import com.example.springbootdemo.hibernatedata.entity.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {// JpaRepository - содержит CRUD функционал + постраничность

        // на основании имени метода будет построен Hibernate запрос
        List<Author> findByFioContainingIgnoreCaseOrderByFio(String fio);

        // Page cодержит результаты выполнения запроса и служебные данные для постраничности
        Page<Author> findByFioContainingIgnoreCaseOrderByFio(String fio, Pageable pageable);// Pageable - параметры для постраничности



}
