package com.wangyueche.controller.admin;

import com.wangyueche.bean.entity.SysMenu;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.biz.MenuBiz;
import com.wangyueche.util.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/4/5.
 */
@Controller
@RequestMapping(value = "/admin/menu/")
public class MenuController extends BaseController{

    @Autowired
    private MenuBiz biz;

    @RequestMapping(value = LIST, method = RequestMethod.GET)
    public void list(){

    }

    @RequestMapping(value = ADD, method = RequestMethod.GET)
    public void add(){

    }

    @ResponseBody
    @RequestMapping(value = PAGE)
    public EasyUIResult queryForPage(@RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "rows",defaultValue = "10") int rows,@RequestParam(value = "date",required = false) String date,@RequestParam(value = "search",required = false) String search){
        EasyUIResult result = biz.listForPage(page,rows, date, search);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = PARENT)
    public List<SysMenu> queryForParentId(@RequestParam(value = "parentId", defaultValue = "1") long parentId){
        List<SysMenu> sysMenus = biz.queryByParentId(parentId);
        return sysMenus;
    }
    @RequestMapping(value = VIEW, method = RequestMethod.GET)
    public void view(ModelMap modelMap,long id){
        SysMenu sysMenu = biz.query(id);
        modelMap.put("bean",sysMenu);
    }

    @RequestMapping(value = SAVE)
    public String save(SysMenu sysMenu){
        biz.save(sysMenu);
        return redirect("/admin/menu/list");
    }

    @RequestMapping(value = DELETE, method = RequestMethod.GET)
    public String delete(long id){
        biz.delete(id);
        return redirect("/admin/menu/list");
    }

    @RequestMapping(value = EDIT, method = RequestMethod.GET)
    public void edit(ModelMap modelMap,long id){
        SysMenu sysMenu = biz.query(id);
        modelMap.put("bean",sysMenu);
    }

    @ResponseBody
    @RequestMapping(value = UPDATE)
    public String update(SysMenu sysMenu){
        biz.update(sysMenu);
        return "success";
    }

}
