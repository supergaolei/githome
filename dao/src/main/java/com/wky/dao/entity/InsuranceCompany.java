package com.wky.dao.entity;

import java.util.Date;

public class InsuranceCompany {
    /**
     * 主键 自增 pk_id
     */
    private Integer pkId;

    /**
     * 保险公司名称 name
     */
    private String name;

    /**
     * 描述 desc
     */
    private String desc;

    /**
     * 公司logo URL地址 logo
     */
    private String logo;

    /**
     * 返利率 rebate_rate
     */
    private Double rebateRate;

    /**
     * 排序时间 sort_time
     */
    private Date sortTime;

    /**
     * 是否使用 0：正常 1：禁用 is_show
     */
    private Integer isShow;

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
     * 保险公司名称
     * @author Administrator
     * @return name 保险公司名称
     */
    public String getName() {
        return name;
    }

    /**
     * 保险公司名称
     * @author Administrator
     * @param name 保险公司名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 描述
     * @author Administrator
     * @return desc 描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 描述
     * @author Administrator
     * @param desc 描述
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * 公司logo URL地址
     * @author Administrator
     * @return logo 公司logo URL地址
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 公司logo URL地址
     * @author Administrator
     * @param logo 公司logo URL地址
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * 返利率
     * @author Administrator
     * @return rebate_rate 返利率
     */
    public Double getRebateRate() {
        return rebateRate;
    }

    /**
     * 返利率
     * @author Administrator
     * @param rebateRate 返利率
     */
    public void setRebateRate(Double rebateRate) {
        this.rebateRate = rebateRate;
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
     * 是否使用 0：正常 1：禁用
     * @author Administrator
     * @return is_show 是否使用 0：正常 1：禁用
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 是否使用 0：正常 1：禁用
     * @author Administrator
     * @param isShow 是否使用 0：正常 1：禁用
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
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
        sb.append(", name=").append(name);
        sb.append(", desc=").append(desc);
        sb.append(", logo=").append(logo);
        sb.append(", rebateRate=").append(rebateRate);
        sb.append(", sortTime=").append(sortTime);
        sb.append(", isShow=").append(isShow);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}