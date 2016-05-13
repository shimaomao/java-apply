package com.shop.model.pojo;

import java.util.Date;

public class PdSkuStock {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.id
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.shop_id
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private Long shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.product_id
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.sku_num
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private String skuNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.sku_name
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private String skuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.cur_price
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private Long curPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.org_price
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private Long orgPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.stock_cnt
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private Integer stockCnt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.update_time
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.updater
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private Integer updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.create_time
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.creator
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private Integer creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.pic
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_sku_stock.note
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.id
     *
     * @return the value of pd_sku_stock.id
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.id
     *
     * @param id the value for pd_sku_stock.id
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.shop_id
     *
     * @return the value of pd_sku_stock.shop_id
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.shop_id
     *
     * @param shopId the value for pd_sku_stock.shop_id
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.product_id
     *
     * @return the value of pd_sku_stock.product_id
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.product_id
     *
     * @param productId the value for pd_sku_stock.product_id
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.sku_num
     *
     * @return the value of pd_sku_stock.sku_num
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public String getSkuNum() {
        return skuNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.sku_num
     *
     * @param skuNum the value for pd_sku_stock.sku_num
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setSkuNum(String skuNum) {
        this.skuNum = skuNum == null ? null : skuNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.sku_name
     *
     * @return the value of pd_sku_stock.sku_name
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.sku_name
     *
     * @param skuName the value for pd_sku_stock.sku_name
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.cur_price
     *
     * @return the value of pd_sku_stock.cur_price
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public Long getCurPrice() {
        return curPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.cur_price
     *
     * @param curPrice the value for pd_sku_stock.cur_price
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setCurPrice(Long curPrice) {
        this.curPrice = curPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.org_price
     *
     * @return the value of pd_sku_stock.org_price
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public Long getOrgPrice() {
        return orgPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.org_price
     *
     * @param orgPrice the value for pd_sku_stock.org_price
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setOrgPrice(Long orgPrice) {
        this.orgPrice = orgPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.stock_cnt
     *
     * @return the value of pd_sku_stock.stock_cnt
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public Integer getStockCnt() {
        return stockCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.stock_cnt
     *
     * @param stockCnt the value for pd_sku_stock.stock_cnt
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setStockCnt(Integer stockCnt) {
        this.stockCnt = stockCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.update_time
     *
     * @return the value of pd_sku_stock.update_time
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.update_time
     *
     * @param updateTime the value for pd_sku_stock.update_time
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.updater
     *
     * @return the value of pd_sku_stock.updater
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public Integer getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.updater
     *
     * @param updater the value for pd_sku_stock.updater
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.create_time
     *
     * @return the value of pd_sku_stock.create_time
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.create_time
     *
     * @param createTime the value for pd_sku_stock.create_time
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.creator
     *
     * @return the value of pd_sku_stock.creator
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.creator
     *
     * @param creator the value for pd_sku_stock.creator
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.pic
     *
     * @return the value of pd_sku_stock.pic
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.pic
     *
     * @param pic the value for pd_sku_stock.pic
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_sku_stock.note
     *
     * @return the value of pd_sku_stock.note
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_sku_stock.note
     *
     * @param note the value for pd_sku_stock.note
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}