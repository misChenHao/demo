package com.bdqn.service.Impl;

import com.bdqn.entity.Financingproduct;
import com.bdqn.mapper.FinancingproductMapper;
import com.bdqn.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    private FinancingproductMapper financingproductMapper;

    @Override
    public List<Financingproduct> selFinancingproduct(Map<String, Object> map) {
        return financingproductMapper.selFinancingproduct(map);
    }

    @Override
    public int insert(Financingproduct record) {
        System.out.println(record.getId());
        return financingproductMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return financingproductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Financingproduct selectByPrimaryKey(String id) {
        return financingproductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Financingproduct record) {
        return financingproductMapper.updateByPrimaryKey(record);
    }
}
