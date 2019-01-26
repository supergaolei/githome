package com.wky.dao.entity;

import java.util.Date;

public class TeamRecord {
    /**
     * 主键 自增 pk_id
     */
    private Integer pkId;

    /**
     * 用户ID user_id
     */
    private Integer userId;

    /**
     * 我的团队车辆数量 count
     */
    private Integer count;

    /**
     * 贡献金额 money
     */
    private Long money;

    /**
     * 贡献用户ID contribution_user_id
     */
    private Integer contributionUserId;

    /**
     * 贡献等级 1：直接下级 2：二级贡献 level
     */
    private Integer level;

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
     * 我的团队车辆数量
     * @author Administrator
     * @return count 我的团队车辆数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 我的团队车辆数量
     * @author Administrator
     * @param count 我的团队车辆数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 贡献金额
     * @author Administrator
     * @return money 贡献金额
     */
    public Long getMoney() {
        return money;
    }

    /**
     * 贡献金额
     * @author Administrator
     * @param money 贡献金额
     */
    public void setMoney(Long money) {
        this.money = money;
    }

    /**
     * 贡献用户ID
     * @author Administrator
     * @return contribution_user_id 贡献用户ID
     */
    public Integer getContributionUserId() {
        return contributionUserId;
    }

    /**
     * 贡献用户ID
     * @author Administrator
     * @param contributionUserId 贡献用户ID
     */
    public void setContributionUserId(Integer contributionUserId) {
        this.contributionUserId = contributionUserId;
    }

    /**
     * 贡献等级 1：直接下级 2：二级贡献
     * @author Administrator
     * @return level 贡献等级 1：直接下级 2：二级贡献
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 贡献等级 1：直接下级 2：二级贡献
     * @author Administrator
     * @param level 贡献等级 1：直接下级 2：二级贡献
     */
    public void setLevel(Integer level) {
        this.level = level;
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
        sb.append(", count=").append(count);
        sb.append(", money=").append(money);
        sb.append(", contributionUserId=").append(contributionUserId);
        sb.append(", level=").append(level);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}