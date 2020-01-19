package com.leetcode.enums;

public enum MyExceptionEnum {

    DATA_NULL("010101","数据列表为空"),
    RANDOM_NUMBER_ERROR("010102","最小值不能大于最大值"),
    LENGTH_LESS_ONE_ERROR("010103","长度不能小于1"),
    NO_NUMBER("010201","包含非数字字符");

    private String code;
    private String info;

    MyExceptionEnum(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
