package com.wangyueche.service;

import com.wangyueche.bean.entity.Fence;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.FenceVo;
import com.wangyueche.util.page.Pager;

import java.util.List;

/**
 * Created by zhangfei on 2017/4/25.
 */
public interface FenceService {

    EasyUIResult listForPage(Pager pager,  Fence fence);

    List<FenceVo> listAll();

    Fence findById(int id);

    int save(Fence fence);

    int update(Fence fence);

    int changeStatus(Integer id,Integer status);

    int deleteById(Integer id);

}
