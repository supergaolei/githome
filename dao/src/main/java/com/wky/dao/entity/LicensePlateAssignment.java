package com.wky.dao.entity;

public class LicensePlateAssignment {
    /**
     * 车牌归属地 主键 pk_id
     */
    private Integer pkId;

    /**
     * 车牌归属地 code
     */
    private String code;

    /**
     * 城市名称 拼音前缀 prefix
     */
    private String prefix;

    /**
     * 城市名称 汉字 city
     */
    private String city;

    /**
     * 城市名称 拼音 city_py
     */
    private String cityPy;

    /**
     * 城市行政编码 市级（地市级） city_code
     */
    private String cityCode;

    /**
     * 所属省份 province
     */
    private String province;

    /**
     * 所属省份 行政编码 province_code
     */
    private String provinceCode;

    /**
     * 省份简称 province_abbreviate
     */
    private String provinceAbbreviate;

    /**
     * 车牌归属地 主键
     * @author Administrator
     * @return pk_id 车牌归属地 主键
     */
    public Integer getPkId() {
        return pkId;
    }

    /**
     * 车牌归属地 主键
     * @author Administrator
     * @param pkId 车牌归属地 主键
     */
    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    /**
     * 车牌归属地
     * @author Administrator
     * @return code 车牌归属地
     */
    public String getCode() {
        return code;
    }

    /**
     * 车牌归属地
     * @author Administrator
     * @param code 车牌归属地
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 城市名称 拼音前缀
     * @author Administrator
     * @return prefix 城市名称 拼音前缀
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * 城市名称 拼音前缀
     * @author Administrator
     * @param prefix 城市名称 拼音前缀
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    /**
     * 城市名称 汉字
     * @author Administrator
     * @return city 城市名称 汉字
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市名称 汉字
     * @author Administrator
     * @param city 城市名称 汉字
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
     * 城市行政编码 市级（地市级）
     * @author Administrator
     * @return city_code 城市行政编码 市级（地市级）
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 城市行政编码 市级（地市级）
     * @author Administrator
     * @param cityCode 城市行政编码 市级（地市级）
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * 所属省份
     * @author Administrator
     * @return province 所属省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 所属省份
     * @author Administrator
     * @param province 所属省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 所属省份 行政编码
     * @author Administrator
     * @return province_code 所属省份 行政编码
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 所属省份 行政编码
     * @author Administrator
     * @param provinceCode 所属省份 行政编码
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * 省份简称
     * @author Administrator
     * @return province_abbreviate 省份简称
     */
    public String getProvinceAbbreviate() {
        return provinceAbbreviate;
    }

    /**
     * 省份简称
     * @author Administrator
     * @param provinceAbbreviate 省份简称
     */
    public void setProvinceAbbreviate(String provinceAbbreviate) {
        this.provinceAbbreviate = provinceAbbreviate == null ? null : provinceAbbreviate.trim();
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
        sb.append(", prefix=").append(prefix);
        sb.append(", city=").append(city);
        sb.append(", cityPy=").append(cityPy);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", province=").append(province);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", provinceAbbreviate=").append(provinceAbbreviate);
        sb.append("]");
        return sb.toString();
    }
}