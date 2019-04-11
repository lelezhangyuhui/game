/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserState
 * Author:   高小兑
 * Date:     2019/4/11 9:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bdqn.game.pojo;

import javax.persistence.*;
import java.util.Objects;

/*设置用户是否被屏蔽的状态*/
@Entity
@Table(name = "USER_STATE", schema = "SCOTT", catalog = "")
public class UserState {

    private int userStateId;//1：正常状态；0：被屏蔽
    private String userStateName;//用户状态名称

    @Id
    @Column(name = "USER_STATE_ID", nullable = false, precision = 0)
    public int getUserStateId() {
        return userStateId;
    }

    public void setUserStateId(int userStateId) {
        this.userStateId = userStateId;
    }

    @Basic
    @Column(name = "USER_STATE_NAME", nullable = true, length = 50)
    public String getUserStateName() {
        return userStateName;
    }

    public void setUserStateName(String userStateName) {
        this.userStateName = userStateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserState userState = (UserState) o;
        return userStateId == userState.userStateId &&
                Objects.equals(userStateName, userState.userStateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userStateId, userStateName);
    }
}

