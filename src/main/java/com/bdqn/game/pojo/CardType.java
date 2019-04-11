/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CardType
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
卡片类型信息表*/
@Entity
@Table(name = "CARD_TYPE", schema = "SCOTT", catalog = "")
public class CardType {

    private int cardTypeId;//卡片类型Id
    private String cardTypeName;//卡片类型名称
    private Long cardPrice;//卡片价格
    private String cardPicPath;//图片url路径
    private String cardLocPath;//服务器存储路径

    @Id
    @Column(name = "CARD_TYPE_ID", nullable = false, precision = 0)
    public int getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(int cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    @Basic
    @Column(name = "CARD_TYPE_NAME", nullable = true, length = 50)
    public String getCardTypeName() {
        return cardTypeName;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }

    @Basic
    @Column(name = "CARD_PRICE", nullable = true, precision = 2)
    public Long getCardPrice() {
        return cardPrice;
    }

    public void setCardPrice(Long cardPrice) {
        this.cardPrice = cardPrice;
    }

    @Basic
    @Column(name = "CARD_PIC_PATH", nullable = true, length = 50)
    public String getCardPicPath() {
        return cardPicPath;
    }

    public void setCardPicPath(String cardPicPath) {
        this.cardPicPath = cardPicPath;
    }

    @Basic
    @Column(name = "CARD_LOC_PATH", nullable = true, length = 50)
    public String getCardLocPath() {
        return cardLocPath;
    }

    public void setCardLocPath(String cardLocPath) {
        this.cardLocPath = cardLocPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardType cardType = (CardType) o;
        return cardTypeId == cardType.cardTypeId &&
                Objects.equals(cardTypeName, cardType.cardTypeName) &&
                Objects.equals(cardPrice, cardType.cardPrice) &&
                Objects.equals(cardPicPath, cardType.cardPicPath) &&
                Objects.equals(cardLocPath, cardType.cardLocPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardTypeId, cardTypeName, cardPrice, cardPicPath, cardLocPath);
    }
}

