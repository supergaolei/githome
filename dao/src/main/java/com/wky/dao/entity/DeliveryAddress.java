package com.wky.dao.entity;

import java.util.Date;

public class DeliveryAddress {
    /**
     * 主键 自增 pk_id
     */
    private Integer pkId;

    /**
     * 用户ID user_id
     */
    private Integer userId;

    /**
     * 收货地址类型： 1：用户添加 2：订单收货 type
     */
    private Integer type;

    /**
     * 收件人 name
     */
    private String name;

    /**
     * 省级 行政编码 province
     */
    private String province;

    /**
     * 市级 行政编码 city
     */
    private String city;

    /**
     * 区级 行政编码 district
     */
    private String district;

    /**
     * 详细收货地址 address
     */
    private String address;

    /**
     * 邮政编码 zipcode
     */
    private String zipcode;

    /**
     * 手机号 phone
     */
    private String phone;

    /**
     * 是否默认地址 is_default
     */
    private Integer isDefault;

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
     * 收货地址类型： 1：用户添加 2：订单收货
     * @author Administrator
     * @return type 收货地址类型： 1：用户添加 2：订单收货
     */
    public Integer getType() {
        return type;
    }

    /**
     * 收货地址类型： 1：用户添加 2：订单收货
     * @author Administrator
     * @param type 收货地址类型： 1：用户添加 2：订单收货
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 收件人
     * @author Administrator
     * @return name 收件人
     */
    public String getName() {
        return name;
    }

    /**
     * 收件人
     * @author Administrator
     * @param name 收件人
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 省级 行政编码
     * @author Administrator
     * @return province 省级 行政编码
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省级 行政编码
     * @author Administrator
     * @param province 省级 行政编码
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 市级 行政编码
     * @author Administrator
     * @return city 市级 行政编码
     */
    public String getCity() {
        return city;
    }

    /**
     * 市级 行政编码
     * @author Administrator
     * @param city 市级 行政编码
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 区级 行政编码
     * @author Administrator
     * @return district 区级 行政编码
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 区级 行政编码
     * @author Administrator
     * @param district 区级 行政编码
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * 详细收货地址
     * @author Administrator
     * @return address 详细收货地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 详细收货地址
     * @author Administrator
     * @param address 详细收货地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 邮政编码
     * @author Administrator
     * @return zipcode 邮政编码
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 邮政编码
     * @author Administrator
     * @param zipcode 邮政编码
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    /**
     * 手机号
     * @author Administrator
     * @return phone 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @author Administrator
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 是否默认地址
     * @author Administrator
     * @return is_default 是否默认地址
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 是否默认地址
     * @author Administrator
     * @param isDefault 是否默认地址
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
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
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", address=").append(address);
        sb.append(", zipcode=").append(zipcode);
        sb.append(", phone=").append(phone);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}