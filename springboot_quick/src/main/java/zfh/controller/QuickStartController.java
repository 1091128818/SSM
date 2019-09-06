package zfh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: 大哥的叔
 * @Date: 2019/8/23 05:45
 * @Description:
 */
@Controller
public class QuickStartController {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return  "SpringBoot访问成功";
    }
}
