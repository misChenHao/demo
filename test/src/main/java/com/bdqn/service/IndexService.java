package com.bdqn.service;

import com.bdqn.entity.Financingproduct;

import java.util.List;
import java.util.Map;

public interface IndexService {
    List<Financingproduct> selFinancingproduct(Map<String, Object> map);

    int insert(Financingproduct record);

    int deleteByPrimaryKey(String id);

    Financingproduct selectByPrimaryKey(String id);

    int updateByPrimaryKey(Financingproduct record);
}
