package com.wky.dao.entity;

import java.util.Date;

public class Question {
    /**
     * 主键 自增 pk_id
     */
    private Integer pkId;

    /**
     * 问题标题 title
     */
    private String title;

    /**
     * 问题内容 content
     */
    private String content;

    /**
     * 是否启用 0：正常 1：禁用 is_enabled
     */
    private Integer isEnabled;

    /**
     * 创建时间 create_time
     */
    private Date createTime;

    /**
     * 主键 自增
     * @author Administrator
     * @return pk_id 主键 自增
     */
    public Integer getPkId() {
        return pkId;
    }

    /**
     * 主键 自增
     * @author Administrator
     * @param pkId 主键 自增
     */
    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    /**
     * 问题标题
     * @author Administrator
     * @return title 问题标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 问题标题
     * @author Administrator
     * @param title 问题标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 问题内容
     * @author Administrator
     * @return content 问题内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 问题内容
     * @author Administrator
     * @param content 问题内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 是否启用 0：正常 1：禁用
     * @author Administrator
     * @return is_enabled 是否启用 0：正常 1：禁用
     */
    public Integer getIsEnabled() {
        return isEnabled;
    }

    /**
     * 是否启用 0：正常 1：禁用
     * @author Administrator
     * @param isEnabled 是否启用 0：正常 1：禁用
     */
    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * 创建时间
     * @author Administrator
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @author Administrator
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkId=").append(pkId);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}