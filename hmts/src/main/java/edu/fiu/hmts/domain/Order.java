package edu.fiu.hmts.domain;

public class Order {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_id
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.ship_address
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    private String shipAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.phone
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.note
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.status
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.user_id
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_id
     *
     * @return the value of order.order_id
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_id
     *
     * @param orderId the value for order.order_id
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.ship_address
     *
     * @return the value of order.ship_address
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public String getShipAddress() {
        return shipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.ship_address
     *
     * @param shipAddress the value for order.ship_address
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress == null ? null : shipAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.phone
     *
     * @return the value of order.phone
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.phone
     *
     * @param phone the value for order.phone
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.note
     *
     * @return the value of order.note
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.note
     *
     * @param note the value for order.note
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.status
     *
     * @return the value of order.status
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.status
     *
     * @param status the value for order.status
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.user_id
     *
     * @return the value of order.user_id
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.user_id
     *
     * @param userId the value for order.user_id
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}