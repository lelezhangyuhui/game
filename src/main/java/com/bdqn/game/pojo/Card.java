/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Card
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
import java.sql.Time;
import java.util.Objects;

/* 具体卡片信息*/
@Entity
public class Card {

    private int cardId;//卡片ID
    private Integer cardTypeId;//卡片类型id
    private Long cardNo;//卡片序号
    private String cardPassword;//卡片密码
    private String cardDesc;//卡片描述
    private Time cardTime;//卡片时间
    private String cardState;//卡片售出状态

    @Id
    @Column(name = "CARD_ID", nullable = false, precision = 0)
    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    @Basic
    @Column(name = "CARD_TYPE_ID", nullable = true, precision = 0)
    public Integer getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(Integer cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    @Basic
    @Column(name = "CARD_NO", nullable = true, precision = 0)
    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }

    @Basic
    @Column(name = "CARD_PASSWORD", nullable = true, length = 20)
    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    @Basic
    @Column(name = "CARD_DESC", nullable = true, length = 100)
    public String getCardDesc() {
        return cardDesc;
    }

    public void setCardDesc(String cardDesc) {
        this.cardDesc = cardDesc;
    }

    @Basic
    @Column(name = "CARD_TIME", nullable = true)
    public Time getCardTime() {
        return cardTime;
    }

    public void setCardTime(Time cardTime) {
        this.cardTime = cardTime;
    }

    @Basic
    @Column(name = "CARD_STATE", nullable = true, length = 10)
    public String getCardState() {
        return cardState;
    }

    public void setCardState(String cardState) {
        this.cardState = cardState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardId == card.cardId &&
                Objects.equals(cardTypeId, card.cardTypeId) &&
                Objects.equals(cardNo, card.cardNo) &&
                Objects.equals(cardPassword, card.cardPassword) &&
                Objects.equals(cardDesc, card.cardDesc) &&
                Objects.equals(cardTime, card.cardTime) &&
                Objects.equals(cardState, card.cardState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, cardTypeId, cardNo, cardPassword, cardDesc, cardTime, cardState);
    }
}

