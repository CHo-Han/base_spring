package main.mvc;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface InitController {
    public void init(String method);

    @ExceptionHandler(NullPointerException.class)
    public ModelAndView NullPointerException(Exception e, HttpServletRequest request, HttpServletResponse response);
}
