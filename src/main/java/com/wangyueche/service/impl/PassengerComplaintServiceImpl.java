package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.PassengerComplaint;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.PassengerComplaintVo;
import com.wangyueche.mapper.PassengerComplaintMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.PassengerComplaintService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author lyq
 */
@Service
public class PassengerComplaintServiceImpl implements PassengerComplaintService {
    @Autowired
    private PassengerComplaintMapper passengerComplaintMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String orderId, String passengerPhone, String startDate, String endDate) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("orderId", orderId)
                .addPositive("address", address)
                .addNotEmpty("passengerPhone", passengerPhone);

        List<PassengerComplaint> list = passengerComplaintMapper.select(pager.setSorts(PassengerComplaintMapper.ORDERBY),argGen.getArgs());
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
