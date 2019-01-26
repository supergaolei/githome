package com.wky.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
    /**
     * 主键 自增 pk_id
     */
    private Integer pkId;

    /**
     * 用户ID user_id
     */
    private Integer userId;

    /**
     * 记录种类 1：自反积分 2：推广基金 kind
     */
    private Integer kind;

    /**
     * 方式 1：收入 2：支出 way
     */
    private Integer way;

    /**
     * 金额 money
     */
    private BigDecimal money;

    /**
     * 自身返利 余额 rebate_balance
     */
    private BigDecimal rebateBalance;

    /**
     * 推广分销 余额 spread_balance
     */
    private BigDecimal spreadBalance;

    /**
     * 订单编号 order_no
     */
    private String orderNo;

    /**
     * 账单分类 1: 提现 2：自反奖励 2：推广奖励 type
     */
    private Integer type;

    /**
     * 否删除 0：正常 1：删除 is_delete
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
     * 记录种类 1：自反积分 2：推广基金
     * @author Administrator
     * @return kind 记录种类 1：自反积分 2：推广基金
     */
    public Integer getKind() {
        return kind;
    }

    /**
     * 记录种类 1：自反积分 2：推广基金
     * @author Administrator
     * @param kind 记录种类 1：自反积分 2：推广基金
     */
    public void setKind(Integer kind) {
        this.kind = kind;
    }

    /**
     * 方式 1：收入 2：支出
     * @author Administrator
     * @return way 方式 1：收入 2：支出
     */
    public Integer getWay() {
        return way;
    }

    /**
     * 方式 1：收入 2：支出
     * @author Administrator
     * @param way 方式 1：收入 2：支出
     */
    public void setWay(Integer way) {
        this.way = way;
    }

    /**
     * 金额
     * @author Administrator
     * @return money 金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 金额
     * @author Administrator
     * @param money 金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 自身返利 余额
     * @author Administrator
     * @return rebate_balance 自身返利 余额
     */
    public BigDecimal getRebateBalance() {
        return rebateBalance;
    }

    /**
     * 自身返利 余额
     * @author Administrator
     * @param rebateBalance 自身返利 余额
     */
    public void setRebateBalance(BigDecimal rebateBalance) {
        this.rebateBalance = rebateBalance;
    }

    /**
     * 推广分销 余额
     * @author Administrator
     * @return spread_balance 推广分销 余额
     */
    public BigDecimal getSpreadBalance() {
        return spreadBalance;
    }

    /**
     * 推广分销 余额
     * @author Administrator
     * @param spreadBalance 推广分销 余额
     */
    public void setSpreadBalance(BigDecimal spreadBalance) {
        this.spreadBalance = spreadBalance;
    }

    /**
     * 订单编号
     * @author Administrator
     * @return order_no 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 订单编号
     * @author Administrator
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 账单分类 1: 提现 2：自反奖励 2：推广奖励
     * @author Administrator
     * @return type 账单分类 1: 提现 2：自反奖励 2：推广奖励
     */
    public Integer getType() {
        return type;
    }

    /**
     * 账单分类 1: 提现 2：自反奖励 2：推广奖励
     * @author Administrator
     * @param type 账单分类 1: 提现 2：自反奖励 2：推广奖励
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 否删除 0：正常 1：删除
     * @author Administrator
     * @return is_delete 否删除 0：正常 1：删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 否删除 0：正常 1：删除
     * @author Administrator
     * @param isDelete 否删除 0：正常 1：删除
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
        sb.append(", userId=").append(userId);
        sb.append(", kind=").append(kind);
        sb.append(", way=").append(way);
        sb.append(", money=").append(money);
        sb.append(", rebateBalance=").append(rebateBalance);
        sb.append(", spreadBalance=").append(spreadBalance);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", type=").append(type);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}