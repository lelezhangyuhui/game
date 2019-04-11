/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Advice
 * Author:   高小兑
 * Date:     2019/4/11 10:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bdqn.game.pojo;

import javax.persistence.*;
import java.util.Objects;

/*存放会员的投诉建议信息*/
@Entity
public class Advice {

    private long adviceId;// 投诉建议id
    private Long userId; //用户id
    private String content; //投诉或建议内容

    private UserInfo userInfo;//多对一，多个建议对一个用户对象

    @ManyToOne
    @JoinColumn(name="id")
   public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    @Id
    @Column(name = "ADVICE_ID", nullable = false, precision = 0)
    public long getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(long adviceId) {
        this.adviceId = adviceId;
    }

    @Basic
    @Column(name = "USER_ID", nullable = true, precision = 0)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "CONTENT", nullable = true, length = 100)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}

