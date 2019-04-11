/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PostHistory
 * Author:   高小兑
 * Date:     2019/4/11 9:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bdqn.game.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

/*
汇款记录*/
@Entity
@Table(name = "POST_HISTORY", schema = "SCOTT", catalog = "")
public class PostHistory {

    private int postHistoryId;// 汇款历史记录id
    private Integer userId;//用户id
    private String bank;//汇款银行
    private Long money;// 汇款金额
    private Time postTime;// 汇款时间
    private String postDesc;//备注
    private Integer approveState;//审核状态

    @Id
    @Column(name = "POST_HISTORY_ID", nullable = false, precision = 0)
    public int getPostHistoryId() {
        return postHistoryId;
    }

    public void setPostHistoryId(int postHistoryId) {
        this.postHistoryId = postHistoryId;
    }

    @Basic
    @Column(name = "USER_ID", nullable = true, precision = 0)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "BANK", nullable = true, length = 100)
    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Basic
    @Column(name = "MONEY", nullable = true, precision = 2)
    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    @Basic
    @Column(name = "POST_TIME", nullable = true)
    public Time getPostTime() {
        return postTime;
    }

    public void setPostTime(Time postTime) {
        this.postTime = postTime;
    }

    @Basic
    @Column(name = "POST_DESC", nullable = true, length = 100)
    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    @Basic
    @Column(name = "APPROVE_STATE", nullable = true, precision = 0)
    public Integer getApproveState() {
        return approveState;
    }

    public void setApproveState(Integer approveState) {
        this.approveState = approveState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostHistory that = (PostHistory) o;
        return postHistoryId == that.postHistoryId &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(bank, that.bank) &&
                Objects.equals(money, that.money) &&
                Objects.equals(postTime, that.postTime) &&
                Objects.equals(postDesc, that.postDesc) &&
                Objects.equals(approveState, that.approveState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postHistoryId, userId, bank, money, postTime, postDesc, approveState);
    }
}

