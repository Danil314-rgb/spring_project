package ru.job4j.accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    /*@GetMapping("/accident")
    public String index(Model model) {
        List<String> users = List.of("Tom", "Bob", "Lol");
        model.addAttribute("users", users);
        return "index";
    }*/
}
