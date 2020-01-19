package com.leetcode.vo;

import com.leetcode.enums.MyExceptionEnum;
import com.leetcode.exception.MyException;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Slf4j
public class CombinationVO {
    private List<String> list;

    public CombinationVO(String... str) {
        this.list = Arrays.asList(str);
    }
    public CombinationVO(List<String> list) {
        this.list = list;
    }

    public boolean isEmpty(){
        return list==null || list.isEmpty();
    }

    public int size() throws MyException {
        if(list==null){
            throw new MyException(MyExceptionEnum.DATA_NULL,new NullPointerException());
        }
        return list.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CombinationVO)) {
            return false;
        }
        return list.equals(((CombinationVO)obj).getList());
    }

    public void println(){
        System.out.println("结果长度："+list.size());
        System.out.println("运算结果为：");
        System.out.println(list);
    }

}
