package com.wangyueche.controller.admin;


import com.wangyueche.bean.entity.SysOrganization;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.StateCode;
import com.wangyueche.bean.vo.SysOrganizationVo;
import com.wangyueche.biz.OrganizationBiz;
import com.wangyueche.service.OrganizationService;
import com.wangyueche.util.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/19.
 */
@Controller
@RequestMapping(value = "/admin/organization/", method = RequestMethod.POST)
public class OrganizationController extends BaseController {

    @Autowired
    private OrganizationBiz biz;

    @Autowired
    private OrganizationService service;

    @RequestMapping(value = LIST, method = RequestMethod.GET)
    public void list() {

    }

    /*@RequestMapping(value = ADD, method = RequestMethod.GET)
    public void add() {

    }*/


    @ResponseBody
    @RequestMapping(value = PAGE)
    public EasyUIResult queryForPage(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "rows", defaultValue = "10") int pageSize, @RequestParam(value = "orgName", required = false) String orgName, @RequestParam(value = "orgLeader", required = false) String orgLeaderName) {
        EasyUIResult result = biz.listForPage(page, pageSize, orgName, orgLeaderName);
        return result;
    }


    @RequestMapping(value = VIEW, method = RequestMethod.GET)
    @ResponseBody
    public SysOrganizationVo view(long id) {
        SysOrganizationVo sysOrganizationVo = biz.query(id);
        return sysOrganizationVo;
    }

   /* @RequestMapping(value = EDIT, method = RequestMethod.GET)
    public void edit(ModelMap modelMap, long id) {
        SysOrganizationVo sysOrganizationVo = biz.query(id);
        modelMap.put("bean", sysOrganizationVo);
    }*/

    @ResponseBody
    @RequestMapping(value = SAVE)
    public String save(SysOrganization sysOrganization) {
        int result = biz.save(sysOrganization);
        if (result > 0) {
            return StateCode.SUCEESS;
        }
        return StateCode.ERROR;
    }

    @ResponseBody
    @RequestMapping(value = DELETE, method = RequestMethod.GET)
    public String delete(long id) {
        int result = biz.delete(id);
        if (result > 0) {
            return StateCode.SUCEESS;
        }
        return StateCode.ERROR;
    }

    @ResponseBody
    @RequestMapping(value = UPDATE)
    public String update(SysOrganization sysOrganization) {
        int result = biz.update(sysOrganization);
        if (result > 0) {
            return StateCode.SUCEESS;
        }
        return StateCode.ERROR;
    }

    /**
     * 批量删除
     *
     * @param checkedIdString
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "delChecked")
    public int delChecked(@RequestParam(value = "checkedId[]") String[] checkedIdString) {
        try {
            Long[] ids = new Long[checkedIdString.length];
            for (int i = 0; i < checkedIdString.length; i++) {
                ids[i] = Long.parseLong(checkedIdString[i]);
            }
            return biz.deleteByIds(Arrays.asList(ids));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

   /* @ResponseBody
    @RequestMapping(value = "autocomplete", method = RequestMethod.GET)
    public List<String> nameAutocomplete(@RequestParam(value = "term") String term) {
        return biz.nameAutocomplete(term);
    }*/

    @ResponseBody
    @RequestMapping(value = "organizationList", method = RequestMethod.GET)
    public List<SysOrganization> organizationList() {
        List<SysOrganization> list = service.list();
        if (list.size() < 1) {
            return null;
        }
        return list;
    }
}
