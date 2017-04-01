package org.together.and.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/system/operation-log")
public class OperationLogController {

    @GetMapping(value = "")
    public ModelAndView index() {
        String viewName = "pages/system/operation-log/index";
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }
}
