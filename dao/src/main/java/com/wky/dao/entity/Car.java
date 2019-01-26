package com.wky.dao.entity;

import java.util.Date;

public class Car {
    /**
     * 主键自增 pk_id
     */
    private Integer pkId;

    /**
     * 车牌号 plate_number
     */
    private String plateNumber;

    /**
     * 车主姓名 master_name
     */
    private String masterName;

    /**
     * 车主身份证 master_card
     */
    private String masterCard;

    /**
     * 车架号 vin_no
     */
    private String vinNo;

    /**
     * 发动机号 engineNo
     */
    private String engineno;

    /**
     * 车辆初始登记日期 first_register_date
     */
    private Date firstRegisterDate;

    /**
     * 车辆座位数 seat
     */
    private Integer seat;

    /**
     * 车型编码 car_model_card
     */
    private String carModelCard;

    /**
     * 品牌型号 brand_model
     */
    private String brandModel;

    /**
     * 是否过户 0：正常 1：过户 is_transfer
     */
    private Integer isTransfer;

    /**
     * 过户日期 transfer_time
     */
    private Date transferTime;

    /**
     * 商业险起报日期 commercial_insurance_date
     */
    private Date commercialInsuranceDate;

    /**
     * 交强险起报日期 compulsory_insurance_date
     */
    private Date compulsoryInsuranceDate;

    /**
     * 是否删除 0：正常 1：删除 is_delete
     */
    private Integer isDelete;

    /**
     * 创建时间 create_time
     */
    private Date createTime;

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
     * 车牌号
     * @author Administrator
     * @return plate_number 车牌号
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * 车牌号
     * @author Administrator
     * @param plateNumber 车牌号
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }

    /**
     * 车主姓名
     * @author Administrator
     * @return master_name 车主姓名
     */
    public String getMasterName() {
        return masterName;
    }

    /**
     * 车主姓名
     * @author Administrator
     * @param masterName 车主姓名
     */
    public void setMasterName(String masterName) {
        this.masterName = masterName == null ? null : masterName.trim();
    }

    /**
     * 车主身份证
     * @author Administrator
     * @return master_card 车主身份证
     */
    public String getMasterCard() {
        return masterCard;
    }

    /**
     * 车主身份证
     * @author Administrator
     * @param masterCard 车主身份证
     */
    public void setMasterCard(String masterCard) {
        this.masterCard = masterCard == null ? null : masterCard.trim();
    }

    /**
     * 车架号
     * @author Administrator
     * @return vin_no 车架号
     */
    public String getVinNo() {
        return vinNo;
    }

    /**
     * 车架号
     * @author Administrator
     * @param vinNo 车架号
     */
    public void setVinNo(String vinNo) {
        this.vinNo = vinNo == null ? null : vinNo.trim();
    }

    /**
     * 发动机号
     * @author Administrator
     * @return engineNo 发动机号
     */
    public String getEngineno() {
        return engineno;
    }

    /**
     * 发动机号
     * @author Administrator
     * @param engineno 发动机号
     */
    public void setEngineno(String engineno) {
        this.engineno = engineno == null ? null : engineno.trim();
    }

    /**
     * 车辆初始登记日期
     * @author Administrator
     * @return first_register_date 车辆初始登记日期
     */
    public Date getFirstRegisterDate() {
        return firstRegisterDate;
    }

    /**
     * 车辆初始登记日期
     * @author Administrator
     * @param firstRegisterDate 车辆初始登记日期
     */
    public void setFirstRegisterDate(Date firstRegisterDate) {
        this.firstRegisterDate = firstRegisterDate;
    }

    /**
     * 车辆座位数
     * @author Administrator
     * @return seat 车辆座位数
     */
    public Integer getSeat() {
        return seat;
    }

    /**
     * 车辆座位数
     * @author Administrator
     * @param seat 车辆座位数
     */
    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    /**
     * 车型编码
     * @author Administrator
     * @return car_model_card 车型编码
     */
    public String getCarModelCard() {
        return carModelCard;
    }

    /**
     * 车型编码
     * @author Administrator
     * @param carModelCard 车型编码
     */
    public void setCarModelCard(String carModelCard) {
        this.carModelCard = carModelCard == null ? null : carModelCard.trim();
    }

    /**
     * 品牌型号
     * @author Administrator
     * @return brand_model 品牌型号
     */
    public String getBrandModel() {
        return brandModel;
    }

    /**
     * 品牌型号
     * @author Administrator
     * @param brandModel 品牌型号
     */
    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel == null ? null : brandModel.trim();
    }

    /**
     * 是否过户 0：正常 1：过户
     * @author Administrator
     * @return is_transfer 是否过户 0：正常 1：过户
     */
    public Integer getIsTransfer() {
        return isTransfer;
    }

    /**
     * 是否过户 0：正常 1：过户
     * @author Administrator
     * @param isTransfer 是否过户 0：正常 1：过户
     */
    public void setIsTransfer(Integer isTransfer) {
        this.isTransfer = isTransfer;
    }

    /**
     * 过户日期
     * @author Administrator
     * @return transfer_time 过户日期
     */
    public Date getTransferTime() {
        return transferTime;
    }

    /**
     * 过户日期
     * @author Administrator
     * @param transferTime 过户日期
     */
    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }

    /**
     * 商业险起报日期
     * @author Administrator
     * @return commercial_insurance_date 商业险起报日期
     */
    public Date getCommercialInsuranceDate() {
        return commercialInsuranceDate;
    }

    /**
     * 商业险起报日期
     * @author Administrator
     * @param commercialInsuranceDate 商业险起报日期
     */
    public void setCommercialInsuranceDate(Date commercialInsuranceDate) {
        this.commercialInsuranceDate = commercialInsuranceDate;
    }

    /**
     * 交强险起报日期
     * @author Administrator
     * @return compulsory_insurance_date 交强险起报日期
     */
    public Date getCompulsoryInsuranceDate() {
        return compulsoryInsuranceDate;
    }

    /**
     * 交强险起报日期
     * @author Administrator
     * @param compulsoryInsuranceDate 交强险起报日期
     */
    public void setCompulsoryInsuranceDate(Date compulsoryInsuranceDate) {
        this.compulsoryInsuranceDate = compulsoryInsuranceDate;
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
        sb.append(", plateNumber=").append(plateNumber);
        sb.append(", masterName=").append(masterName);
        sb.append(", masterCard=").append(masterCard);
        sb.append(", vinNo=").append(vinNo);
        sb.append(", engineno=").append(engineno);
        sb.append(", firstRegisterDate=").append(firstRegisterDate);
        sb.append(", seat=").append(seat);
        sb.append(", carModelCard=").append(carModelCard);
        sb.append(", brandModel=").append(brandModel);
        sb.append(", isTransfer=").append(isTransfer);
        sb.append(", transferTime=").append(transferTime);
        sb.append(", commercialInsuranceDate=").append(commercialInsuranceDate);
        sb.append(", compulsoryInsuranceDate=").append(compulsoryInsuranceDate);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}