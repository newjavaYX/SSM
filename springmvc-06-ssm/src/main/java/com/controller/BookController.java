package com.controller;

import com.domain.Book;
import com.domain.Code;
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
    public Result save(@RequestBody Book book) {
        boolean flag = service.save(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = service.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        boolean flag = service.deleteById(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getBookById(@PathVariable Integer id) {
        Book book = service.getBookById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_REE;
        String msg =  book != null ? "": "数据查询失败";
        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAllBook() {
        List<Book> bookList = service.getAllBook();
        Integer code = bookList != null ? Code.GET_OK : Code.GET_REE;
        String msg =  bookList != null ? "": "数据查询失败";
        return new Result(code,bookList,msg);
    }
}
