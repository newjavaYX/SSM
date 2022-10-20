package com.service;

import com.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookService {
    /**
     * 新增保存
     * @param book
     */
    boolean save(Book book);

    /**
     * 更新
     * @param book
     */
    boolean update(Book book);

    /**
     * 按id删除
     * @param id
     */
    boolean deleteById(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    Book getBookById(Integer id);

    /**
     * 查询全部
     * @return
     */
    List<Book> getAllBook();
}
