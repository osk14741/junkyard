package com.example.inputer001.problem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProblemController {
    @RequestMapping("/problem")
    public String problem() {
        return "problem";
    }
}
