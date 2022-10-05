package com.example.inputer001.problem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/problem/ajax")
    @ResponseBody
    public String problem_ajax() throws InterruptedException {
        double count = 0;
        count = Math.random()* 1000;

        Thread.sleep((int) count);
        log.info(Thread.currentThread().toString());

        return "return value";
    }

    @GetMapping("/problem/ajax2")
    @ResponseBody
    public String problem_ajax2(){
        for(int i = 0; i < 10000; i++){
            System.out.println(i);
        }
        return "return value2";
    }
}
