package main.command;

import lombok.extern.log4j.Log4j;
import main.mvc.InitController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Log4j
@Controller
@RequestMapping("/home.do")
public class HomeController implements InitController {
    private static ModelAndView FORM_VIEW = new ModelAndView("home");

    @Override
    public void init(String method) {
    }

    @Override
    public ModelAndView NullPointerException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        return FORM_VIEW;
    }

    @GetMapping
    public ModelAndView processGet(HttpServletRequest req, HttpServletResponse res) {
        init("GET");
        return FORM_VIEW;
    }

    @PostMapping
    public ModelAndView processPost(HttpServletRequest req, HttpServletResponse res) {
        init("POST");
        return FORM_VIEW;
    }
}
