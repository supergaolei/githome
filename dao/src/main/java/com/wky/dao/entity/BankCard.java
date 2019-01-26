package com.wky.dao.entity;

import java.util.Date;

public class BankCard {
    /**
     * 主键 自增 pk_id
     */
    private Integer pkId;

    /**
     * 用户ID user_id
     */
    private Integer userId;

    /**
     * 持卡人姓名 master_name
     */
    private String masterName;

    /**
     * 银行名称 bank_name
     */
    private String bankName;

    /**
     * 银行卡号 card
     */
    private String card;

    /**
     * 是否删除 0：正常 1：删除 is_delete
     */
    private Integer isDelete;

    /**
     * 是否默认 0：否 1：是 is_default
     */
    private Integer isDefault;

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
     * 用户ID
     * @author Administrator
     * @return user_id 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @author Administrator
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 持卡人姓名
     * @author Administrator
     * @return master_name 持卡人姓名
     */
    public String getMasterName() {
        return masterName;
    }

    /**
     * 持卡人姓名
     * @author Administrator
     * @param masterName 持卡人姓名
     */
    public void setMasterName(String masterName) {
        this.masterName = masterName == null ? null : masterName.trim();
    }

    /**
     * 银行名称
     * @author Administrator
     * @return bank_name 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 银行名称
     * @author Administrator
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 银行卡号
     * @author Administrator
     * @return card 银行卡号
     */
    public String getCard() {
        return card;
    }

    /**
     * 银行卡号
     * @author Administrator
     * @param card 银行卡号
     */
    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
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
     * 是否默认 0：否 1：是
     * @author Administrator
     * @return is_default 是否默认 0：否 1：是
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 是否默认 0：否 1：是
     * @author Administrator
     * @param isDefault 是否默认 0：否 1：是
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
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
        sb.append(", userId=").append(userId);
        sb.append(", masterName=").append(masterName);
        sb.append(", bankName=").append(bankName);
        sb.append(", card=").append(card);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}