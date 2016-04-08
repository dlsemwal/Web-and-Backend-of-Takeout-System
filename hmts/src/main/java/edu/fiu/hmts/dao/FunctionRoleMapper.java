package edu.fiu.hmts.dao;

import edu.fiu.hmts.domain.FunctionRoleExample;
import edu.fiu.hmts.domain.FunctionRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunctionRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table functionrole
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int countByExample(FunctionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table functionrole
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int deleteByExample(FunctionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table functionrole
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int deleteByPrimaryKey(FunctionRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table functionrole
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int insert(FunctionRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table functionrole
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int insertSelective(FunctionRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table functionrole
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    List<FunctionRoleKey> selectByExample(FunctionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table functionrole
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int updateByExampleSelective(@Param("record") FunctionRoleKey record, @Param("example") FunctionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table functionrole
     *
     * @mbggenerated Fri Apr 08 05:16:48 EDT 2016
     */
    int updateByExample(@Param("record") FunctionRoleKey record, @Param("example") FunctionRoleExample example);
}