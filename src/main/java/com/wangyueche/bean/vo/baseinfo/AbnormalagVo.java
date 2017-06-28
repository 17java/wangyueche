package com.wangyueche.bean.vo.baseinfo;

/**
 * Created by zhangfei on 2017/4/27.
 * 异常聚集---鼠标放在异常围栏上显示信息
 */
public class AbnormalagVo {

    private int id;

    //车辆数
    private int num;

    //报警级别
    private int level;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
