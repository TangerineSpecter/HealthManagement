package com.tangerineSpecter.healthManagement.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.sql.Date;

/**
 * 生理指标类
 */
public class UserIndex {

    //指标ID
    private Long id;
    //用户ID
    @JsonInclude(Include.NON_DEFAULT)
    private Long userId;
    // 生理指标类型，包括（体重、血压、血糖、血脂、心率等）
    @JsonInclude(Include.NON_DEFAULT)
    private int indexType;
    // 生理指标值
    private int indexContent;
    // 用户上传日期
    private Date collectDate;

    // 构造函数
    public UserIndex() {
        super();
    }

    // 构造函数
    public UserIndex(Long userId, int indexType, int indexContent, Date collectDate) {
        super();
        this.userId = userId;
        this.indexType = indexType;
        this.indexContent = indexContent;
        this.collectDate = collectDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getIndexType() {
        return indexType;
    }

    public void setIndexType(int indexType) {
        this.indexType = indexType;
    }

    public int getIndexContent() {
        return indexContent;
    }

    public void setIndexContent(int indexContent) {
        this.indexContent = indexContent;
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    @Override
    public String toString() {
        return "UserIndex{" +
                "id=" + id +
                ", userId=" + userId +
                ", indexType=" + indexType +
                ", indexContent=" + indexContent +
                ", collectDate=" + collectDate +
                '}';
    }
}
