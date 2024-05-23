package com.example.date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@RestController

public class MyController {
    @GetMapping("/")
    public String gettodaydate(){
        LocalDate now = LocalDate.now();
        DateTimeFormatter df =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String str =now.format(df);
        return str;
    }
    
}
