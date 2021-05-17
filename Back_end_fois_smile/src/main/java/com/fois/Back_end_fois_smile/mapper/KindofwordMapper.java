package com.fois.Back_end_fois_smile.mapper;

import com.fois.Back_end_fois_smile.entity.Kindofword;
import com.fois.Back_end_fois_smile.entity.KindofwordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KindofwordMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kindofword
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    long countByExample(KindofwordExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kindofword
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int deleteByExample(KindofwordExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kindofword
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int deleteByPrimaryKey(String maloaitu);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kindofword
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int insert(Kindofword record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kindofword
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int insertSelective(Kindofword record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kindofword
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    List<Kindofword> selectByExample(KindofwordExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kindofword
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    Kindofword selectByPrimaryKey(String maloaitu);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kindofword
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int updateByExampleSelective(@Param("record") Kindofword record, @Param("example") KindofwordExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kindofword
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int updateByExample(@Param("record") Kindofword record, @Param("example") KindofwordExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kindofword
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int updateByPrimaryKeySelective(Kindofword record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kindofword
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int updateByPrimaryKey(Kindofword record);
}