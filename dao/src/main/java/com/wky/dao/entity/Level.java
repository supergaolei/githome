package com.wky.dao.entity;

import java.util.Date;

public class Level {
    /**
     * 主键 自增 pk_id
     */
    private Integer pkId;

    /**
     * 等级 （0：默认 v,1: v金色，2：v1  0.5%，3：v2 1%，4：v3 2%) level
     */
    private Integer level;

    /**
     * 数量 amount
     */
    private Integer amount;

    /**
     * 描述 desc
     */
    private String desc;

    /**
     * 利率 rate
     */
    private Double rate;

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
     * 等级 （0：默认 v,1: v金色，2：v1  0.5%，3：v2 1%，4：v3 2%)
     * @author Administrator
     * @return level 等级 （0：默认 v,1: v金色，2：v1  0.5%，3：v2 1%，4：v3 2%)
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 等级 （0：默认 v,1: v金色，2：v1  0.5%，3：v2 1%，4：v3 2%)
     * @author Administrator
     * @param level 等级 （0：默认 v,1: v金色，2：v1  0.5%，3：v2 1%，4：v3 2%)
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 数量
     * @author Administrator
     * @return amount 数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 数量
     * @author Administrator
     * @param amount 数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
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
     * 利率
     * @author Administrator
     * @return rate 利率
     */
    public Double getRate() {
        return rate;
    }

    /**
     * 利率
     * @author Administrator
     * @param rate 利率
     */
    public void setRate(Double rate) {
        this.rate = rate;
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
        sb.append(", level=").append(level);
        sb.append(", amount=").append(amount);
        sb.append(", desc=").append(desc);
        sb.append(", rate=").append(rate);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}