package com.shop.dao.mapper;

import com.shop.model.pojo.ShShop;
import com.shop.model.pojo.ShShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ShShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_shop
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    int countByExample(ShShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_shop
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    int deleteByExample(ShShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_shop
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    @Delete({
        "delete from sh_shop",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_shop
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    @Insert({
        "insert into sh_shop (name, state, ",
        "create_time, grade, ",
        "shop_desc, pic, verify_status, ",
        "verify_time, is_enterprise, ",
        "ent_name, owner_id, ",
        "owner_name)",
        "values (#{name,jdbcType=VARCHAR}, #{state,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{grade,jdbcType=INTEGER}, ",
        "#{shopDesc,jdbcType=VARCHAR}, #{pic,jdbcType=VARCHAR}, #{verifyStatus,jdbcType=INTEGER}, ",
        "#{verifyTime,jdbcType=TIMESTAMP}, #{isEnterprise,jdbcType=INTEGER}, ",
        "#{entName,jdbcType=VARCHAR}, #{ownerId,jdbcType=BIGINT}, ",
        "#{ownerName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ShShop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_shop
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    int insertSelective(ShShop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_shop
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    List<ShShop> selectByExample(ShShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_shop
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    @Select({
        "select",
        "id, name, state, create_time, grade, shop_desc, pic, verify_status, verify_time, ",
        "is_enterprise, ent_name, owner_id, owner_name",
        "from sh_shop",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    ShShop selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_shop
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    int updateByExampleSelective(@Param("record") ShShop record, @Param("example") ShShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_shop
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    int updateByExample(@Param("record") ShShop record, @Param("example") ShShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_shop
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    int updateByPrimaryKeySelective(ShShop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_shop
     *
     * @mbggenerated Fri May 13 11:32:38 CST 2016
     */
    @Update({
        "update sh_shop",
        "set name = #{name,jdbcType=VARCHAR},",
          "state = #{state,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "grade = #{grade,jdbcType=INTEGER},",
          "shop_desc = #{shopDesc,jdbcType=VARCHAR},",
          "pic = #{pic,jdbcType=VARCHAR},",
          "verify_status = #{verifyStatus,jdbcType=INTEGER},",
          "verify_time = #{verifyTime,jdbcType=TIMESTAMP},",
          "is_enterprise = #{isEnterprise,jdbcType=INTEGER},",
          "ent_name = #{entName,jdbcType=VARCHAR},",
          "owner_id = #{ownerId,jdbcType=BIGINT},",
          "owner_name = #{ownerName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ShShop record);
}