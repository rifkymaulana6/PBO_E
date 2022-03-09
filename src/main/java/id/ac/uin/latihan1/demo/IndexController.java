package id.ac.uin.latihan1.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("api")

public class IndexController {
    @GetMapping("hello")
    public String index(@RequestParam String name){
        return "Selamat Belajar Spring Boot!" + name + " " + LocalDateTime.now();
    }
}
