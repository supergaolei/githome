package com.wky.dao.entity;

import java.util.Date;

public class HotCity {
    /**
     * 热门城市 主键 pk_id
     */
    private Integer pkId;

    /**
     * 车辆归属地 code
     */
    private String code;

    /**
     * 城市名称 city
     */
    private String city;

    /**
     * 城市名称 拼音 city_py
     */
    private String cityPy;

    /**
     * 城市行政编码 city_code
     */
    private String cityCode;

    /**
     * 是否删除 0：正常 1：删除 is_delete
     */
    private Integer isDelete;

    /**
     * 创建时间 create_time
     */
    private Date createTime;

    /**
     * 更新时间 update_time
     */
    private Date updateTime;

    /**
     * 热门城市 主键
     * @author Administrator
     * @return pk_id 热门城市 主键
     */
    public Integer getPkId() {
        return pkId;
    }

    /**
     * 热门城市 主键
     * @author Administrator
     * @param pkId 热门城市 主键
     */
    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    /**
     * 车辆归属地
     * @author Administrator
     * @return code 车辆归属地
     */
    public String getCode() {
        return code;
    }

    /**
     * 车辆归属地
     * @author Administrator
     * @param code 车辆归属地
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 城市名称
     * @author Administrator
     * @return city 城市名称
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市名称
     * @author Administrator
     * @param city 城市名称
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 城市名称 拼音
     * @author Administrator
     * @return city_py 城市名称 拼音
     */
    public String getCityPy() {
        return cityPy;
    }

    /**
     * 城市名称 拼音
     * @author Administrator
     * @param cityPy 城市名称 拼音
     */
    public void setCityPy(String cityPy) {
        this.cityPy = cityPy == null ? null : cityPy.trim();
    }

    /**
     * 城市行政编码
     * @author Administrator
     * @return city_code 城市行政编码
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 城市行政编码
     * @author Administrator
     * @param cityCode 城市行政编码
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
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
     * 更新时间
     * @author Administrator
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @author Administrator
     * @param updateTime 更新时间
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
        sb.append(", code=").append(code);
        sb.append(", city=").append(city);
        sb.append(", cityPy=").append(cityPy);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}