/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SysFun
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

/*存放菜单功能的基本信息*/
@Entity
@Table(name = "SYS_FUN", schema = "SCOTT", catalog = "")
public class SysFun {

    private int nodeId;//菜单节点
    private String displayName;//菜单名称
    private String nodeUrl;//菜单链接地址
    private Long displayOrder;//菜单显示顺序
    private Integer parentNodeId;//父节点id

    @Id
    @Column(name = "NODE_ID", nullable = false, precision = 0)
    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    @Basic
    @Column(name = "DISPLAY_NAME", nullable = true, length = 100)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Basic
    @Column(name = "NODE_URL", nullable = true, length = 100)
    public String getNodeUrl() {
        return nodeUrl;
    }

    public void setNodeUrl(String nodeUrl) {
        this.nodeUrl = nodeUrl;
    }

    @Basic
    @Column(name = "DISPLAY_ORDER", nullable = true, precision = 0)
    public Long getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Long displayOrder) {
        this.displayOrder = displayOrder;
    }

    @Basic
    @Column(name = "PARENT_NODE_ID", nullable = true, precision = 0)
    public Integer getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Integer parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysFun sysFun = (SysFun) o;
        return nodeId == sysFun.nodeId &&
                Objects.equals(displayName, sysFun.displayName) &&
                Objects.equals(nodeUrl, sysFun.nodeUrl) &&
                Objects.equals(displayOrder, sysFun.displayOrder) &&
                Objects.equals(parentNodeId, sysFun.parentNodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, displayName, nodeUrl, displayOrder, parentNodeId);
    }
}

