package com.licc.web.model;

import com.licc.base.domain.IEntity;
import java.math.BigDecimal;

/**
 *  
 */
public class TalentGains implements IEntity {
    /**
     *  ID
     */
    private Long id;

    /**
     *  订单表ID
     */
    private Long orderId;

    /**
     *  达人表ID
     */
    private Long talentUserId;

    /**
     *  收益金额
     */
    private BigDecimal gainsNum;

    /**
     *  比例ID-便于以后出错查数据
     */
    private Long scaleId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取字段 talent_gains.ID
     *
     * @return the value of talent_gains.ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置字段 talent_gains.ID
     *
     * @param id the value for talent_gains.ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取字段 talent_gains.ORDER_ID
     *
     * @return the value of talent_gains.ORDER_ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置字段 talent_gains.ORDER_ID
     *
     * @param orderId the value for talent_gains.ORDER_ID
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取字段 talent_gains.TALENT_USER_ID
     *
     * @return the value of talent_gains.TALENT_USER_ID
     */
    public Long getTalentUserId() {
        return talentUserId;
    }

    /**
     * 设置字段 talent_gains.TALENT_USER_ID
     *
     * @param talentUserId the value for talent_gains.TALENT_USER_ID
     */
    public void setTalentUserId(Long talentUserId) {
        this.talentUserId = talentUserId;
    }

    /**
     * 获取字段 talent_gains.GAINS_NUM
     *
     * @return the value of talent_gains.GAINS_NUM
     */
    public BigDecimal getGainsNum() {
        return gainsNum;
    }

    /**
     * 设置字段 talent_gains.GAINS_NUM
     *
     * @param gainsNum the value for talent_gains.GAINS_NUM
     */
    public void setGainsNum(BigDecimal gainsNum) {
        this.gainsNum = gainsNum;
    }

    /**
     * 获取字段 talent_gains.SCALE_ID
     *
     * @return the value of talent_gains.SCALE_ID
     */
    public Long getScaleId() {
        return scaleId;
    }

    /**
     * 设置字段 talent_gains.SCALE_ID
     *
     * @param scaleId the value for talent_gains.SCALE_ID
     */
    public void setScaleId(Long scaleId) {
        this.scaleId = scaleId;
    }
}