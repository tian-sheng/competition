package com.octopus.eureka.user;

import java.io.Serializable;

/**
 * 文件创建时写入注释内容
 *
 * @author zp3778
 * @version 1.0.0
 * @date Created in 17:13 2019/9/25
 */
public class UserDao implements Serializable {
    String customerId;
    String customerName;
    String cetificationId;
    String cetificationType;
    String riskLevel;
    String isSigned;

    public UserDao(String customerId, String customerName, String cetificationId, String cetificationType, String riskLevel, String isSigned) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.cetificationId = cetificationId;
        this.cetificationType = cetificationType;
        this.riskLevel = riskLevel;
        this.isSigned = isSigned;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCetificationId() {
        return cetificationId;
    }

    public void setCetificationId(String cetificationId) {
        this.cetificationId = cetificationId;
    }

    public String getCetificationType() {
        return cetificationType;
    }

    public void setCetificationType(String cetificationType) {
        this.cetificationType = cetificationType;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getIsSigned() {
        return isSigned;
    }

    public void setIsSigned(String isSigned) {
        this.isSigned = isSigned;
    }

}