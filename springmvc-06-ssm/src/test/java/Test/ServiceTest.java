package Test;

import com.config.SpringConfig;
import com.domain.Book;
import com.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ServiceTest {
    @Autowired
    private BookService service;
    @Test
    public void getBookByIdTest(){
        Book bookById = service.getBookById(1);
        System.out.println(bookById);
    }
}
