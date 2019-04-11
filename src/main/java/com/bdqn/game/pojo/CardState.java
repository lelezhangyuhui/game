/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CardState
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
卡片售出状态*/
@Entity
@Table(name = "CARD_STATE", schema = "SCOTT", catalog = "")
public class CardState {

    private long cardStateId;//卡片状态id 1：售出；0：未售出
    private String cardStateName;//卡片状态名称

    @Id
    @Column(name = "CARD_STATE_ID", nullable = false, precision = 0)
    public long getCardStateId() {
        return cardStateId;
    }

    public void setCardStateId(long cardStateId) {
        this.cardStateId = cardStateId;
    }

    @Basic
    @Column(name = "CARD_STATE_NAME", nullable = true, length = 20)
    public String getCardStateName() {
        return cardStateName;
    }

    public void setCardStateName(String cardStateName) {
        this.cardStateName = cardStateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardState cardState = (CardState) o;
        return cardStateId == cardState.cardStateId &&
                Objects.equals(cardStateName, cardState.cardStateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardStateId, cardStateName);
    }
}

