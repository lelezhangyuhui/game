/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: News
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

/*存放系统公告*/
@Entity
public class News {

    private int newsId;//公告id
    private String title;//公告标题
    private String content;//公告内容
    private Time newsTime;//发布公告时间
    private Integer newsState;//消息发布状态1：已发布；0：未发布

    @Id
    @Column(name = "NEWS_ID", nullable = false, precision = 0)
    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    @Basic
    @Column(name = "TITLE", nullable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "CONTENT", nullable = true, length = 100)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "NEWS_TIME", nullable = true)
    public Time getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Time newsTime) {
        this.newsTime = newsTime;
    }

    @Basic
    @Column(name = "NEWS_STATE", nullable = true, precision = 0)
    public Integer getNewsState() {
        return newsState;
    }

    public void setNewsState(Integer newsState) {
        this.newsState = newsState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return newsId == news.newsId &&
                Objects.equals(title, news.title) &&
                Objects.equals(content, news.content) &&
                Objects.equals(newsTime, news.newsTime) &&
                Objects.equals(newsState, news.newsState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, title, content, newsTime, newsState);
    }
}

