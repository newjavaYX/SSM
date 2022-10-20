package com.controller;

import com.domain.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService service;
    @PostMapping
    public boolean save(@RequestBody Book book) {
        return service.save(book);
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        return service.update(book);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id) {
        return service.deleteById(id);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return service.getBookById(id);
    }

    @GetMapping
    public List<Book> getAllBook() {
        return service.getAllBook();
    }
}
