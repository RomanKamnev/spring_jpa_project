package com.example.springbootdemo.hibernatedata.service;

import com.example.springbootdemo.hibernatedata.dao.AuthorDao;
import com.example.springbootdemo.hibernatedata.entity.Author;
import com.example.springbootdemo.hibernatedata.repository.AuthorRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class authorService implements AuthorDao {

    AuthorRepository authorRepository;


    @Override
    public List<Author> getAll() {
        return null;
    }

    @Override
    public List<Author> search(String... searchString) {
        return authorRepository.findByFioContainingIgnoreCaseOrderByFio(searchString[0]);
    }

    @Override
    public Author get(long id) {
        return null;
    }

    @Override
    public Author save(Author obj) {
        return authorRepository.save(obj);
    }

    @Override
    public void delete(Author object) {
        authorRepository.delete(object);
    }

    @Override
    public List<Author> getAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Author> getAll(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection) {
        return null;
    }

    @Override
    public Page<Author> search(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection, String... searchString) {
        return authorRepository.findByFioContainingIgnoreCaseOrderByFio(searchString[0], new PageRequest(pageNumber, pageSize, new Sort(sortDirection, sortField)));
    }
}
