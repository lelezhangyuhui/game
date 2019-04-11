/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RoleInfo
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

/*存放角色基本信息表*/
@Entity
@Table(name = "ROLE_INFO", schema = "SCOTT", catalog = "")
public class RoleInfo {

    private long roleId;//角色Id
    private String roleName;//角色名称

    @Id
    @Column(name = "ROLE_ID", nullable = false, precision = 0)
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "ROLE_NAME", nullable = true, length = 50)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleInfo roleInfo = (RoleInfo) o;
        return roleId == roleInfo.roleId &&
                Objects.equals(roleName, roleInfo.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName);
    }
}

