package com.wky.dao.entity;

import java.util.Date;

public class Label {
    /**
     * 主键 自增 pk_id
     */
    private Integer pkId;

    /**
     * 保险公司ID company_id
     */
    private Integer companyId;

    /**
     * 标签名称 name
     */
    private String name;

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
     * 保险公司ID
     * @author Administrator
     * @return company_id 保险公司ID
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 保险公司ID
     * @author Administrator
     * @param companyId 保险公司ID
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 标签名称
     * @author Administrator
     * @return name 标签名称
     */
    public String getName() {
        return name;
    }

    /**
     * 标签名称
     * @author Administrator
     * @param name 标签名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
        sb.append(", companyId=").append(companyId);
        sb.append(", name=").append(name);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}