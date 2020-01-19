package com.leetcode.tools;

import com.leetcode.enums.MyExceptionEnum;
import com.leetcode.exception.MyException;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * 生机随机字符串
 */
@Slf4j
public class RandomUtil {

    public static String createRandomStr(int len) throws MyException{
        if(len<1){
            throw new MyException(MyExceptionEnum.LENGTH_LESS_ONE_ERROR);
        }
        StringBuilder sb = new StringBuilder(len);
        Random random = new Random();
        try {
            for (int i = 0; i < len; i++) {
                sb.append(getRandomNumber(10,2));
            };
        } catch (MyException e) {
            log.error("创建随机字符串出错",e);
        }
        return sb.toString();
    }

    public static Integer getRandomNumber(int max,int min) throws MyException{
        if(max<=min){
            throw new MyException(MyExceptionEnum.RANDOM_NUMBER_ERROR);
        }
        Random random = new Random();
        return random.nextInt(max)%(max-min)+min;
    }
}
