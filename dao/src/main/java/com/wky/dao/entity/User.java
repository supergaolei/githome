package com.wky.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    /**
     * 主键自增 pk_id
     */
    private Integer pkId;

    /**
     * 账户（手机号） account
     */
    private String account;

    /**
     * 密码 password
     */
    private String password;

    /**
     * 支付密码 pay_password
     */
    private String payPassword;

    /**
     * 盐值 salt
     */
    private String salt;

    /**
     * 微信 open_id open_id
     */
    private String openId;

    /**
     * 昵称 nickname
     */
    private String nickname;

    /**
     * 性别 0：保密 1：男 2：女 sex
     */
    private Integer sex;

    /**
     * 头像 avatar
     */
    private String avatar;

    /**
     * 会员等级（0：默认v,1:v金色，2：v1  0.5%，3：v2 1%，4：v3 2%) level
     */
    private Integer level;

    /**
     * 自身返利 余额 rebate_balance
     */
    private BigDecimal rebateBalance;

    /**
     * 推广分销 余额 spread_balance
     */
    private BigDecimal spreadBalance;

    /**
     * 队长 leader_phone
     */
    private String leaderPhone;

    /**
     * 自身总消费金额 total_money
     */
    private BigDecimal totalMoney;

    /**
     * 直接下级总消费金额 sub_total_money
     */
    private BigDecimal subTotalMoney;

    /**
     * 邀请码 invite_code
     */
    private String inviteCode;

    /**
     * 微信登录 是否验证手机 0: 未验证 1 ：已验证 is_mobile
     */
    private Integer isMobile;

    /**
     * 状态 0：正常 1：禁用 status
     */
    private Integer status;

    /**
     * 是否删除 is_delete
     */
    private Integer isDelete;

    /**
     * 创建时间 create_time
     */
    private Date createTime;

    /**
     * 修改时间 update_time
     */
    private Date updateTime;

    /**
     * 主键自增
     * @author Administrator
     * @return pk_id 主键自增
     */
    public Integer getPkId() {
        return pkId;
    }

    /**
     * 主键自增
     * @author Administrator
     * @param pkId 主键自增
     */
    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    /**
     * 账户（手机号）
     * @author Administrator
     * @return account 账户（手机号）
     */
    public String getAccount() {
        return account;
    }

    /**
     * 账户（手机号）
     * @author Administrator
     * @param account 账户（手机号）
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 密码
     * @author Administrator
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @author Administrator
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 支付密码
     * @author Administrator
     * @return pay_password 支付密码
     */
    public String getPayPassword() {
        return payPassword;
    }

    /**
     * 支付密码
     * @author Administrator
     * @param payPassword 支付密码
     */
    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    /**
     * 盐值
     * @author Administrator
     * @return salt 盐值
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 盐值
     * @author Administrator
     * @param salt 盐值
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 微信 open_id
     * @author Administrator
     * @return open_id 微信 open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 微信 open_id
     * @author Administrator
     * @param openId 微信 open_id
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 昵称
     * @author Administrator
     * @return nickname 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 昵称
     * @author Administrator
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 性别 0：保密 1：男 2：女
     * @author Administrator
     * @return sex 性别 0：保密 1：男 2：女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 性别 0：保密 1：男 2：女
     * @author Administrator
     * @param sex 性别 0：保密 1：男 2：女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 头像
     * @author Administrator
     * @return avatar 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 头像
     * @author Administrator
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 会员等级（0：默认v,1:v金色，2：v1  0.5%，3：v2 1%，4：v3 2%)
     * @author Administrator
     * @return level 会员等级（0：默认v,1:v金色，2：v1  0.5%，3：v2 1%，4：v3 2%)
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 会员等级（0：默认v,1:v金色，2：v1  0.5%，3：v2 1%，4：v3 2%)
     * @author Administrator
     * @param level 会员等级（0：默认v,1:v金色，2：v1  0.5%，3：v2 1%，4：v3 2%)
     */
    public void setLevel(Integer level) {
        this.level = level;
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
     * 队长
     * @author Administrator
     * @return leader_phone 队长
     */
    public String getLeaderPhone() {
        return leaderPhone;
    }

    /**
     * 队长
     * @author Administrator
     * @param leaderPhone 队长
     */
    public void setLeaderPhone(String leaderPhone) {
        this.leaderPhone = leaderPhone == null ? null : leaderPhone.trim();
    }

    /**
     * 自身总消费金额
     * @author Administrator
     * @return total_money 自身总消费金额
     */
    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    /**
     * 自身总消费金额
     * @author Administrator
     * @param totalMoney 自身总消费金额
     */
    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * 直接下级总消费金额
     * @author Administrator
     * @return sub_total_money 直接下级总消费金额
     */
    public BigDecimal getSubTotalMoney() {
        return subTotalMoney;
    }

    /**
     * 直接下级总消费金额
     * @author Administrator
     * @param subTotalMoney 直接下级总消费金额
     */
    public void setSubTotalMoney(BigDecimal subTotalMoney) {
        this.subTotalMoney = subTotalMoney;
    }

    /**
     * 邀请码
     * @author Administrator
     * @return invite_code 邀请码
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * 邀请码
     * @author Administrator
     * @param inviteCode 邀请码
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    /**
     * 微信登录 是否验证手机 0: 未验证 1 ：已验证
     * @author Administrator
     * @return is_mobile 微信登录 是否验证手机 0: 未验证 1 ：已验证
     */
    public Integer getIsMobile() {
        return isMobile;
    }

    /**
     * 微信登录 是否验证手机 0: 未验证 1 ：已验证
     * @author Administrator
     * @param isMobile 微信登录 是否验证手机 0: 未验证 1 ：已验证
     */
    public void setIsMobile(Integer isMobile) {
        this.isMobile = isMobile;
    }

    /**
     * 状态 0：正常 1：禁用
     * @author Administrator
     * @return status 状态 0：正常 1：禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态 0：正常 1：禁用
     * @author Administrator
     * @param status 状态 0：正常 1：禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 是否删除
     * @author Administrator
     * @return is_delete 是否删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除
     * @author Administrator
     * @param isDelete 是否删除
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
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", payPassword=").append(payPassword);
        sb.append(", salt=").append(salt);
        sb.append(", openId=").append(openId);
        sb.append(", nickname=").append(nickname);
        sb.append(", sex=").append(sex);
        sb.append(", avatar=").append(avatar);
        sb.append(", level=").append(level);
        sb.append(", rebateBalance=").append(rebateBalance);
        sb.append(", spreadBalance=").append(spreadBalance);
        sb.append(", leaderPhone=").append(leaderPhone);
        sb.append(", totalMoney=").append(totalMoney);
        sb.append(", subTotalMoney=").append(subTotalMoney);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append(", isMobile=").append(isMobile);
        sb.append(", status=").append(status);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}