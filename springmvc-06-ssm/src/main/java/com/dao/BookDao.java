package com.dao;

import com.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {
    @Insert("insert into tbl_book (type,name,description) values (#{type}, #{name}, #{description})")
    Integer save(Book book);
    @Update("update tbl_book set type=#{type}, name = #{name}, description = #{description} where id=#{id}")
    Integer update(Book book);
    @Delete("delete from tbl_book where id=#{id}")
    Integer deleteById(Integer id);
    @Select("select * from tbl_book where id=#{id}")
    Book getBookById(Integer id);
    @Select("select * from tbl_book")
    List<Book> getAllBook();
}
