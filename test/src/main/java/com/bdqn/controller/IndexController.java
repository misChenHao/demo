package com.bdqn.controller;

import com.bdqn.common.utils.JsonUtil;
import com.bdqn.entity.Financingproduct;
import com.bdqn.service.IndexService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {
    @Resource
    private IndexService indexService;

    @PostMapping("selFinancingproduct")
    public String selFinancingproduct(@RequestParam(name = "id", required = false, defaultValue = "") String id,
                                      @RequestParam(name = "risk", required = false, defaultValue = "0") Integer risk) {
        Map<String, Object> map = new HashMap<>();
        if (id != "" && id != null) {
            map.put("id", id);
        }
        if (risk != 0) {
            map.put("risk", risk);
        }
        List<Financingproduct> list = indexService.selFinancingproduct(map);
        if (list.size() > 0) {
            return JsonUtil.getResponseJson(0, "ok", list);
        } else {
            return JsonUtil.getResponseJson(1, "err", null);
        }
    }

    @PostMapping("insFinancingproduct")
    public String insFinancingproduct(Financingproduct financingproduct) {
        System.out.println(financingproduct.getId());
        int row = indexService.insert(financingproduct);
        if (row > 0) {
            return JsonUtil.getResponseJson(0, "ok", null);
        } else {
            return JsonUtil.getResponseJson(1, "err", null);
        }
    }

    @PostMapping("delFinancingproduct")
    public String delFinancingproduct(String id) {
        int row = indexService.deleteByPrimaryKey(id);
        if (row > 0) {
            return JsonUtil.getResponseJson(0, "ok", null);
        } else {
            return JsonUtil.getResponseJson(1, "err", null);
        }
    }

    @PostMapping("selectFinancingproduct")
    public String selectFinancingproduct(String id) {
        Financingproduct financingproduct = indexService.selectByPrimaryKey(id);
        if (financingproduct != null) {
            return JsonUtil.getResponseJson(0, "ok", financingproduct);
        } else {
            return JsonUtil.getResponseJson(1, "err", null);
        }
    }

    @PostMapping("updFinancingproduct")
    public String updFinancingproduct(Financingproduct financingproduct) {
        System.out.println(financingproduct.getId());
        int row = indexService.updateByPrimaryKey(financingproduct);
        if (row > 0) {
            return JsonUtil.getResponseJson(0, "ok", null);
        } else {
            return JsonUtil.getResponseJson(1, "err", null);
        }
    }
}
