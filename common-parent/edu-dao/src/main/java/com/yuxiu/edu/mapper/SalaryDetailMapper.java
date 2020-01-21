package com.yuxiu.edu.mapper;

import com.yuxiu.edu.model.SalaryDetail;
import com.yuxiu.edu.model.SalaryDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalaryDetailMapper {
    long countByExample(SalaryDetailExample example);

    int deleteByExample(SalaryDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(SalaryDetail record);

    int insertSelective(SalaryDetail record);

    List<SalaryDetail> selectByExample(SalaryDetailExample example);

    SalaryDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SalaryDetail record, @Param("example") SalaryDetailExample example);

    int updateByExample(@Param("record") SalaryDetail record, @Param("example") SalaryDetailExample example);

    int updateByPrimaryKeySelective(SalaryDetail record);

    int updateByPrimaryKey(SalaryDetail record);
}