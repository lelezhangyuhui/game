/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Vip
 * Author:   高小兑
 * Date:     2019/4/11 9:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bdqn.game.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/*vip等级表*/
@Entity
public class Vip {

    private int vipId;//等级编号
    private String vipName;//等级名称
    private Long vipDis;//会员折扣

    @Id
    @Column(name = "VIP_ID", nullable = false, precision = 0)
    public int getVipId() {
        return vipId;
    }

    public void setVipId(int vipId) {
        this.vipId = vipId;
    }

    @Basic
    @Column(name = "VIP_NAME", nullable = true, length = 30)
    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    @Basic
    @Column(name = "VIP_DIS", nullable = true, precision = 2)
    public Long getVipDis() {
        return vipDis;
    }

    public void setVipDis(Long vipDis) {
        this.vipDis = vipDis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vip vip = (Vip) o;
        return vipId == vip.vipId &&
                Objects.equals(vipName, vip.vipName) &&
                Objects.equals(vipDis, vip.vipDis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vipId, vipName, vipDis);
    }
}

