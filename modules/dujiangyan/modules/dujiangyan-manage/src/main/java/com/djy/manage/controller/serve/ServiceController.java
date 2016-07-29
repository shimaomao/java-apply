package com.djy.manage.controller.serve;

import com.alibaba.fastjson.JSONObject;
import com.djy.manage.controller.BaseController;
import com.djy.manage.model.vo.DimenVo;
import com.djy.manage.service.serve.ServeService;
import com.util.web.HttpRenderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 服务维度服务controller类
 */
@Controller
@RequestMapping(value = "/djy/serve")
public class ServiceController extends BaseController {

    private static final String PREFIX = "/dujiangyan/serve/";

    @Autowired
    private ServeService serveService;

    @RequestMapping(value = "/service")
    public String service() {
        return  PREFIX+"service";
    }

    @RequestMapping(value = "/serviceList")
    public void serviceList(HttpServletRequest request,HttpServletResponse response)
    {
        List<DimenVo> list = serveService.queryList();
        int count = (list==null)?0:list.size();
        JSONObject map = new JSONObject();
        map.put(DATAGRID_ROWS,list);
        map.put(DATAGRID_TOTAL,count);

        HttpRenderUtil.renderJSON(map.toJSONString(), response);
    }
}
