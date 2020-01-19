package com.leetcode.tools;

import com.leetcode.enums.MyExceptionEnum;
import com.leetcode.exception.MyException;

import java.util.regex.Pattern;

public class NumberTools {

    public static void isNumberString(String str) throws MyException {
        Pattern compile = Pattern.compile("^[0-9]*$");
        if (!compile.matcher(str).matches()) {
            throw new MyException(MyExceptionEnum.NO_NUMBER);
        }
    }
}
