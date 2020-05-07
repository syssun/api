package com.sys.api.test;
import com.sys.api.modules.envapi.dao.VaddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestC {
    @Autowired
    private TestDao testDao;
    @Autowired
    private VaddressMapper vaddressMapper ;

    @GetMapping("/test")
    @ResponseBody
    public List getInfO(){
        return testDao.getInfo();
    }

    @GetMapping("/cc")
    @ResponseBody
    public List hello(){
        return vaddressMapper.selectAll();
    }

    @GetMapping("/login")
    public String login(){
        return "html/login";
    }
}
