/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RoleRight
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

/*
放角色的权限*/
@Entity
@Table(name = "ROLE_RIGHT", schema = "SCOTT", catalog = "")
public class RoleRight {

    private int roleRightId;//角色权限id
    private int roleId;// 角色id
    private int nodeId;// 菜单节点id

    @Id
    @Column(name = "ROLE_RIGHT_ID", nullable = false, precision = 0)
    public int getRoleRightId() {
        return roleRightId;
    }

    public void setRoleRightId(int roleRightId) {
        this.roleRightId = roleRightId;
    }

    @Basic
    @Column(name = "ROLE_ID", nullable = false, precision = 0)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "NODE_ID", nullable = false, precision = 0)
    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleRight roleRight = (RoleRight) o;
        return roleRightId == roleRight.roleRightId &&
                roleId == roleRight.roleId &&
                nodeId == roleRight.nodeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleRightId, roleId, nodeId);
    }
}

