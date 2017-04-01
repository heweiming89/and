package org.together.and.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.together.and.service.MenuService;
import org.together.and.web.constant.WebConstants;
import org.together.and.web.util.VerifyCodeUtils;
import org.together.and.web.vo.MenuVo;

@Controller
public class ApplicationController {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    @Autowired
    private MenuService menuService;

    @GetMapping(value = "/login")
    public ModelAndView login() {
        String viewName = "login";
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

    @GetMapping(value = "/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType(MimeTypeUtils.IMAGE_JPEG_VALUE);
        //生成随机字串  
        String verifyCode = VerifyCodeUtils.generateVerifyCode(RandomUtils.nextInt(4, 6));

        //存入会话session  
        HttpSession session = request.getSession(true);
        session.setAttribute(WebConstants.VERIFIY_CODE, verifyCode.toLowerCase());
        //生成图片  
        int w = 110, h = 41;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }

    @GetMapping(value = "/index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        if (logger.isDebugEnabled()) {
            logger.debug("index() - start"); //$NON-NLS-1$
        }
        String viewName = "index";
        ModelAndView mav = new ModelAndView(viewName);
        HttpSession session = request.getSession(true);
        Object attribute = session.getAttribute("menuList");
        //        if (session.getAttribute("menuList") == null) {
        List<MenuVo> menuList = menuService.findMenuByRole(null);
        session.setAttribute("menuList", menuList);
        //        }
        if (logger.isDebugEnabled()) {
            logger.debug("index() - end"); //$NON-NLS-1$
		}
		return mav;
    }

}
