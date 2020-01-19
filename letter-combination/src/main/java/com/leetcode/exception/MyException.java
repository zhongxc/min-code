package com.leetcode.exception;

import com.leetcode.enums.MyExceptionEnum;
import lombok.Data;
import org.springframework.util.Assert;

@Data
public class MyException extends Exception{

    private static final long serialVersionUID = -8537903223002821107L;

    private String code;
    private String[] args;
    private String info;
    private Exception prevException;

    public MyException(String code) {
        super(code);
        Assert.notNull(code,"错误编码不能为空");
        this.code = code;
    }

    public MyException(String code,String... args) {
        Assert.notNull(code,"错误编码不能为空");
        this.args = args;
        this.code = code;
    }

    public MyException(String code,String info) {
        super(info);
        this.code = code;
        //Assert.notNull(info);
        this.info = info;
    }

    public MyException(MyExceptionEnum e) {
        this(e.getCode(),e.getInfo());
    }

    public MyException(String code,String info,Exception prevException) {
        super(info,prevException);
        this.code = code;
        this.info = info;
        this.prevException = prevException;
    }

    public MyException(MyExceptionEnum e,Exception prevException) {
        this(e.getCode(),e.getInfo(),prevException);
    }
    public MyException(String code,Exception prevException) {
        this(code , prevException.getMessage() , prevException);
    }

    public MyException(Exception prevException) {
        this("500",prevException);
    }

}
