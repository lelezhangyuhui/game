/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AdviceController
 * Author:   高小兑
 * Date:     2019/4/10 16:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bdqn.game.controller;

import com.bdqn.game.pojo.Advice;
import com.bdqn.game.service.AdviceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 高小兑
 * @create 2019/4/10
 * @since 1.0.0
 */
@Controller
public class AdviceController {

    @Resource(name="adviceService")
    AdviceService adviceService;

    @RequestMapping("/index")
    public String sel(Model model){
        List<Advice> list = adviceService.selAll();
        model.addAttribute("list",list);
        return "index";
    }
}

