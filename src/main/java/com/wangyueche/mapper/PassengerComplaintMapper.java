package com.wangyueche.mapper;

import com.wangyueche.bean.entity.PassengerComplaint;
import com.wangyueche.bean.entity.PassengerComplaintExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface PassengerComplaintMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    List<PassengerComplaint> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    PassengerComplaint selectByPrimaryKey(Integer id);

}