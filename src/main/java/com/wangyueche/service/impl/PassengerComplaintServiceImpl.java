package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.PassengerComplaint;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.PassengerComplaintVo;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.PassengerComplaintService;
import com.wangyueche.dao.PassengerComplaintDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/17 17:09
 *
 * @author gaojl
 */
@Service
public class PassengerComplaintServiceImpl implements PassengerComplaintService {
    @Autowired
    private PassengerComplaintDao dao;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String orderId, String passengerPhone, String startDate, String endDate) {
        List<PassengerComplaint> list = dao.listForPage(page, rows, address, companyId, orderId, passengerPhone, startDate, endDate);
        List<PassengerComplaintVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (PassengerComplaint complaint : list) {
                PassengerComplaintVo vo = new PassengerComplaintVo(complaint);
                vo.setCompanyName(map.get(complaint.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<PassengerComplaint> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
