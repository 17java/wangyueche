package com.wangyueche.bean.vo.baseinfo;

/**
 * Created by zhangfei on 2017/4/26.
 * 查询所有异常围栏，地图显示
 */
public class AbnormalaggregationVo {
    private Integer id;

    private String name;

    private String memo;

    private Double lng;

    private Double lat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
}
