/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TempRelativeCard
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

/*根据用户选的卡片，给出相关的卡片*/
@Entity
@Table(name = "TEMP_RELATIVE_CARD", schema = "SCOTT", catalog = "")
public class TempRelativeCard {

    private Integer userId;//用户id
    private Integer cardtypeid;//卡片类型id
    private int tempRelativeCardId;//相关卡片标识id

    @Basic
    @Column(name = "USER_ID", nullable = true, precision = 0)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "CARDTYPEID", nullable = true, precision = 0)
    public Integer getCardtypeid() {
        return cardtypeid;
    }

    public void setCardtypeid(Integer cardtypeid) {
        this.cardtypeid = cardtypeid;
    }

    @Id
    @Column(name = "TEMP_RELATIVE_CARD_ID", nullable = false, precision = 0)
    public int getTempRelativeCardId() {
        return tempRelativeCardId;
    }

    public void setTempRelativeCardId(int tempRelativeCardId) {
        this.tempRelativeCardId = tempRelativeCardId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TempRelativeCard that = (TempRelativeCard) o;
        return tempRelativeCardId == that.tempRelativeCardId &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(cardtypeid, that.cardtypeid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, cardtypeid, tempRelativeCardId);
    }
}

