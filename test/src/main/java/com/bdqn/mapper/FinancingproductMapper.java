package com.bdqn.mapper;

import com.bdqn.entity.Financingproduct;

public interface FinancingproductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Financingproduct record);

    int insertSelective(Financingproduct record);

    Financingproduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Financingproduct record);

    int updateByPrimaryKey(Financingproduct record);
}