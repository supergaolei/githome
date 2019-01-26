package com.wky.dao.entity;

import java.util.Date;

public class InsuranceType {
    /**
     * 主键 自增 pk_id
     */
    private Integer pkId;

    /**
     * 险种代码 code
     */
    private String code;

    /**
     * 险种名称 name
     */
    private String name;

    /**
     * 是否删除 0：正常 1：删除 is_delete
     */
    private Integer isDelete;

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
     * 险种代码
     * @author Administrator
     * @return code 险种代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 险种代码
     * @author Administrator
     * @param code 险种代码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 险种名称
     * @author Administrator
     * @return name 险种名称
     */
    public String getName() {
        return name;
    }

    /**
     * 险种名称
     * @author Administrator
     * @param name 险种名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}