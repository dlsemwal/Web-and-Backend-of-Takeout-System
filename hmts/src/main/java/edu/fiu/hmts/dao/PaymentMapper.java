package edu.fiu.hmts.dao;

import edu.fiu.hmts.domain.Payment;
import edu.fiu.hmts.domain.PaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int countByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int deleteByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int deleteByPrimaryKey(Long paymentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int insert(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int insertSelective(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    List<Payment> selectByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    Payment selectByPrimaryKey(Long paymentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int updateByPrimaryKeySelective(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int updateByPrimaryKey(Payment record);
}