package com.wky.dao.entity;

import java.util.Date;

public class Advertisement {
    /**
     * 主键 pk_id
     */
    private Integer pkId;

    /**
     * 标题 title
     */
    private String title;

    /**
     * logo图片地址 logo
     */
    private String logo;

    /**
     * 链接地址 或 链接对象主键 link
     */
    private String link;

    /**
     * 广告分类 0: 开机广告 1: 引导页 2：首页广告 3：推广广告 4: 战略合作伙伴 type
     */
    private Integer type;

    /**
     * 是否删除 0：正常 1：删除 is_delete
     */
    private Integer isDelete;

    /**
     * 排序时间 sort_time
     */
    private Date sortTime;

    /**
     * 创建时间 create_time
     */
    private Date createTime;

    /**
     * 修改时间 update_time
     */
    private Date updateTime;

    /**
     * 主键
     * @author Administrator
     * @return pk_id 主键
     */
    public Integer getPkId() {
        return pkId;
    }

    /**
     * 主键
     * @author Administrator
     * @param pkId 主键
     */
    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    /**
     * 标题
     * @author Administrator
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @author Administrator
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * logo图片地址
     * @author Administrator
     * @return logo logo图片地址
     */
    public String getLogo() {
        return logo;
    }

    /**
     * logo图片地址
     * @author Administrator
     * @param logo logo图片地址
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * 链接地址 或 链接对象主键
     * @author Administrator
     * @return link 链接地址 或 链接对象主键
     */
    public String getLink() {
        return link;
    }

    /**
     * 链接地址 或 链接对象主键
     * @author Administrator
     * @param link 链接地址 或 链接对象主键
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * 广告分类 0: 开机广告 1: 引导页 2：首页广告 3：推广广告 4: 战略合作伙伴
     * @author Administrator
     * @return type 广告分类 0: 开机广告 1: 引导页 2：首页广告 3：推广广告 4: 战略合作伙伴
     */
    public Integer getType() {
        return type;
    }

    /**
     * 广告分类 0: 开机广告 1: 引导页 2：首页广告 3：推广广告 4: 战略合作伙伴
     * @author Administrator
     * @param type 广告分类 0: 开机广告 1: 引导页 2：首页广告 3：推广广告 4: 战略合作伙伴
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 是否删除 0：正常 1：删除
     * @author Administrator
     * @return is_delete 是否删除 0：正常 1：删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除 0：正常 1：删除
     * @author Administrator
     * @param isDelete 是否删除 0：正常 1：删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 排序时间
     * @author Administrator
     * @return sort_time 排序时间
     */
    public Date getSortTime() {
        return sortTime;
    }

    /**
     * 排序时间
     * @author Administrator
     * @param sortTime 排序时间
     */
    public void setSortTime(Date sortTime) {
        this.sortTime = sortTime;
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
     * 修改时间
     * @author Administrator
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @author Administrator
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        sb.append(", logo=").append(logo);
        sb.append(", link=").append(link);
        sb.append(", type=").append(type);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", sortTime=").append(sortTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}