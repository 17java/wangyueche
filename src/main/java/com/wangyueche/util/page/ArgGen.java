package com.wangyueche.util.page;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.*;

public class ArgGen implements Serializable {
    private Map<String, Object> args = new HashMap<>();

    public Map<String, Object> getArgs() {
        return args;
    }

    /**
     * 添加字符串参数
     */
    public ArgGen add(String key, String value) {
        args.put(key, value);
        return this;
    }

    /**
     * 添加字符串参数, null && length==0 时参数被忽略
     */
    public ArgGen addNotEmpty(String key, String value) {
        if (StringUtils.isNotBlank(value)) args.put(key, value);
        return this;
    }

    /**
     * 添加用"LIKE"判断的字符串参数, 参数值两端会被包裹"%", null && length==0 时参数被忽略
     */
    public ArgGen addLike(String key, String value) {
        if (StringUtils.isNotBlank(value)) args.put(key, '%' + value + '%');
        return this;
    }

    /**
     * 添加整数参数, value < 0 时参数被忽略
     */
    public ArgGen addPositive(String key, Integer value) {
        if (null ==  value) return this;
        if (value >= 0) args.put(key, value);
        return this;
    }

    /**
     * 添加整数参数
     */
    public ArgGen add(String key, int value) {
        args.put(key, value);
        return this;
    }

    /**
     * 添加长整数参数, value < 0 时参数被忽略
     */
    public ArgGen addPositive(String key, Long value) {
        if (null == value) return this;
        if (value >= 0L) args.put(key, value);
        return this;
    }

    /**
     * 添加长整数参数
     */
    public ArgGen add(String key, long value) {
        args.put(key, value);
        return this;
    }

    /**
     * 添加日期参数, 忽略null
     */
    public ArgGen addNotEmpty(String key, Date value) {
        if (value != null) args.put(key, value);
        return this;
    }

    public ArgGen add(String key, boolean value) {
        args.put(key, value);
        return this;
    }

    public ArgGen add(String key, Serializable value) {
        args.put(key, value);
        return this;
    }

    public ArgGen addNotEmpty(String key, Serializable value) {
        if (value != null) args.put(key, value);
        return this;
    }

    /**
     * 添加list, 忽略null和空列表
     */
    public <T> ArgGen add(String key, Collection<T> values) {
        if (values != null && values.size() > 0) args.put(key, values);
        return this;
    }

    /**
     * 添加list, 忽略null和空列表
     */
    public ArgGen addIn(String key, List<Object> values) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < values.size(); i++) {
            Object value = values.get(i);
            if (value != null) {
                sb.append("'");
                sb.append(value);
                if (i == values.size() - 1){
                    sb.append("'");
                }else{
                    sb.append("',");
                }
            }
        }
        if (values != null && values.size() > 0) args.put(key, sb.toString());
        return this;
    }


}