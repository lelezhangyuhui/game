/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Approvestate
 * Author:   高小兑
 * Date:     2019/4/11 10:44
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

/*用户汇款审核状态表*/
@Entity
public class Approvestate {

    private long approveStateid;//审核状态id
    private String approvesTateName;//审核状态名称

    @Id
    @Column(name = "APPROVE_STATEID", nullable = false, precision = 0)
    public long getApproveStateid() {
        return approveStateid;
    }

    public void setApproveStateid(long approveStateid) {
        this.approveStateid = approveStateid;
    }

    @Basic
    @Column(name = "APPROVES_TATE_NAME", nullable = true, length = 20)
    public String getApprovesTateName() {
        return approvesTateName;
    }

    public void setApprovesTateName(String approvesTateName) {
        this.approvesTateName = approvesTateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Approvestate that = (Approvestate) o;
        return approveStateid == that.approveStateid &&
                Objects.equals(approvesTateName, that.approvesTateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approveStateid, approvesTateName);
    }
}

