package uz.pdp.SpringBootDemoApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    private JdbcTemplate jdbcTemplate;

    @Value("${welcome.message}")
    private String message;

    public HomeController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/home")
    public String homePage(Model model){
        String sql = "select * from book";
        List<Book> books = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Book.class));
        model.addAttribute("books", books);
        return "home";
    }

    @GetMapping("/book/create")
    public String bookCreatePage(){
        return "book_create";
    }


    @PostMapping("/book/create")
    public String bookCreate(@ModelAttribute BookDTO dto){
        String sql = "insert into book (name, author) values(?, ?)";
        jdbcTemplate.update(sql, dto.getName(), dto.getAuthor());
        return "redirect:/home";
    }
}
