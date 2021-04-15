package com.naxiang.findcode.controller;

import com.naxiang.findcode.service.MasterService;
import com.naxiang.findcode.vo.MasterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private MasterService masterService;

    @RequestMapping("/")
    public Object index() {
        List<MasterVO> masters = masterService.getMasterByCode("CODE_TYPES");
        ModelAndView model = new ModelAndView("index");
        model.addObject("selectList",masters);
        return model;
    }

}
