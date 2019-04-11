package com.bdqn.game;

import com.bdqn.game.pojo.Advice;
import com.bdqn.game.service.AdviceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GameApplicationTests {

    @Autowired
    AdviceService adviceService;
    @Test
    public void test(){
        List<Advice> list = adviceService.selAll();
        for (Advice advice : list) {
            int a=new Long(advice.getUserId()).intValue();
            System.out.println(a);
        }
    }
}
