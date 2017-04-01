package org.together.and.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/system/login-log")
public class LoginLogController {

    @GetMapping(value = "")
    public ModelAndView index() {
        String viewName = "pages/system/login-log/index";
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
}
