/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AdviceServiceImpl
 * Author:   高小兑
 * Date:     2019/4/10 9:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bdqn.game.service.Impl;

import com.bdqn.game.dao.AdviceMapper;
import com.bdqn.game.pojo.Advice;
import com.bdqn.game.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 高小兑
 * @create 2019/4/10
 * @since 1.0.0
 */
@Service("adviceService")
public class AdviceServiceImpl implements AdviceService {

    @Autowired
    AdviceMapper adviceMapper;

    @Override
    public List<Advice> selAll() {
        return adviceMapper.findAll();
    }
}

