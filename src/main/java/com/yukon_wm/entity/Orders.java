package com.yukon_wm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2022-05-17 20:03:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders implements Serializable {
    private static final long serialVersionUID = 923323761061739806L;
    /**
     * 乐观锁
     */
    private Integer version;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 主键id
     */
    private String id;
    /**
     * 商家id
     */
    private String sid;
    /**
     * 用户id
     */
    private String uid;
    /**
     * 骑手id
     */
    private String did;
    /**
     * 订单状态
     */
    private String state;
    /**
     * 备注
     */
    private String tip;
    /**
     * 开始时间
     */
    private Date beginTime;
    /**
     * 金额
     */
    private Double money;
    /**
     * 配送费
     */
    private Double delfee;
    /**
     * 地址
     * */
    private String address;


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getDelfee() {
        return delfee;
    }

    public void setDelfee(Double delfee) {
        this.delfee = delfee;
    }

}

