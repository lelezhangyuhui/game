/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ShoppingCard
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

/*购物车*/
@Entity
@Table(name = "SHOPPING_CARD", schema = "SCOTT", catalog = "")
public class ShoppingCard {

    private int shoppingId;//购物车项id
    private Integer userId;// 用户id
    private Integer cardTypeId;//卡片类型id
    private Long num;//购买数量
    private Integer tempRelativeCardId;//相关卡片标识id

    @Id
    @Column(name = "SHOPPING_ID", nullable = false, precision = 0)
    public int getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(int shoppingId) {
        this.shoppingId = shoppingId;
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
    @Column(name = "CARD_TYPE_ID", nullable = true, precision = 0)
    public Integer getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(Integer cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    @Basic
    @Column(name = "NUM", nullable = true, precision = 0)
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    @Basic
    @Column(name = "TEMP_RELATIVE_CARD_ID", nullable = true, precision = 0)
    public Integer getTempRelativeCardId() {
        return tempRelativeCardId;
    }

    public void setTempRelativeCardId(Integer tempRelativeCardId) {
        this.tempRelativeCardId = tempRelativeCardId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCard that = (ShoppingCard) o;
        return shoppingId == that.shoppingId &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(cardTypeId, that.cardTypeId) &&
                Objects.equals(num, that.num) &&
                Objects.equals(tempRelativeCardId, that.tempRelativeCardId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shoppingId, userId, cardTypeId, num, tempRelativeCardId);
    }
}

