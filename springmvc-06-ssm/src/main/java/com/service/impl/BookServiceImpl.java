package com.service.impl;

import com.dao.BookDao;
import com.domain.Book;
import com.domain.Code;
import com.exception.BusinessException;
import com.exception.SystemException;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        Integer i = bookDao.save(book);
        if (i != null && i>0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Book book) {
        Integer i = bookDao.update(book);
        if (i != null && i !=0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(Integer id) {
        Integer i = bookDao.deleteById(id);
        if (i != null && i !=0) {
            return true;
        }
        return false;
    }

    @Override
    public Book getBookById(Integer id) {
        if (id<0){
            throw new BusinessException("非法数据",Code.BUS_ERR);
        }
        try {
            return bookDao.getBookById(id);
        }catch (Exception e) {
            throw new SystemException("非法数据",e,Code.RUN_ERR);
        }
    }

    @Override
    public List<Book> getAllBook() {
        return bookDao.getAllBook();
    }
}
