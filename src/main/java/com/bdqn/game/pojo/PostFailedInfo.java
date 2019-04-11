/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PostFailedInfo
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

/*存放汇款失败的话，系统发送的信息*/
@Entity
@Table(name = "POST_FAILED_INFO", schema = "SCOTT", catalog = "")
public class PostFailedInfo {

    private int postId;/*汇款失败信息id*/
    private Integer userId;/*用户id*/
    private Integer postHistoryId;/*汇款历史记录id*/
    private Integer readState;/*消息阅读状态0：未读；1：已读*/

    @Id
    @Column(name = "POST_ID", nullable = false, precision = 0)
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
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
    @Column(name = "POST_HISTORY_ID", nullable = true, precision = 0)
    public Integer getPostHistoryId() {
        return postHistoryId;
    }

    public void setPostHistoryId(Integer postHistoryId) {
        this.postHistoryId = postHistoryId;
    }

    @Basic
    @Column(name = "READ_STATE", nullable = true, precision = 0)
    public Integer getReadState() {
        return readState;
    }

    public void setReadState(Integer readState) {
        this.readState = readState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostFailedInfo that = (PostFailedInfo) o;
        return postId == that.postId &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(postHistoryId, that.postHistoryId) &&
                Objects.equals(readState, that.readState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, userId, postHistoryId, readState);
    }
}

