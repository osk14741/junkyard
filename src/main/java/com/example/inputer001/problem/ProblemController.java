package com.example.inputer001.problem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class ProblemController {
    @RequestMapping("/problem")
    public String problem() {
        return "problem";
    }

    @PostMapping("/problem_result")
    public String problem_result(HttpServletRequest req) {
        String test2 = req.getParameter("data");

        log.info(test2);

        return "redirect:problem";
    }
}
