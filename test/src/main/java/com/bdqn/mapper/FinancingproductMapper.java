package com.bdqn.mapper;

import com.bdqn.entity.Financingproduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FinancingproductMapper {
    int deleteByPrimaryKey(String id);

    int insert(Financingproduct record);

    int insertSelective(Financingproduct record);

    Financingproduct selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Financingproduct record);

    int updateByPrimaryKey(Financingproduct record);

    List<Financingproduct> selFinancingproduct(@Param("map") Map<String, Object> map);
}