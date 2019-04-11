/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ShopHistory
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

/*购物记录*/
@Entity
@Table(name = "SHOP_HISTORY", schema = "SCOTT", catalog = "")
public class ShopHistory {

    private int shopHistoryId;// 记录id
    private Integer userId;// 用户id
    private Integer cardId;//卡片id
    private Time shopTime;//购买时间

    @Id
    @Column(name = "SHOP_HISTORY_ID", nullable = false, precision = 0)
    public int getShopHistoryId() {
        return shopHistoryId;
    }

    public void setShopHistoryId(int shopHistoryId) {
        this.shopHistoryId = shopHistoryId;
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
    @Column(name = "CARD_ID", nullable = true, precision = 0)
    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    @Basic
    @Column(name = "SHOP_TIME", nullable = true)
    public Time getShopTime() {
        return shopTime;
    }

    public void setShopTime(Time shopTime) {
        this.shopTime = shopTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopHistory that = (ShopHistory) o;
        return shopHistoryId == that.shopHistoryId &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(cardId, that.cardId) &&
                Objects.equals(shopTime, that.shopTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopHistoryId, userId, cardId, shopTime);
    }
}

