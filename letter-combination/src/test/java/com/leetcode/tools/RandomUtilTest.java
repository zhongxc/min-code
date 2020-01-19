package com.leetcode.tools;

import com.leetcode.enums.MyExceptionEnum;
import com.leetcode.exception.MyException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import sun.rmi.runtime.Log;

import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
public class RandomUtilTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void getRandomNumber() throws MyException {
        Integer[] s = {2,3,4,5,6,7,8,9};
        for (int i = 0; i < 1000; i++) {
            Integer r = RandomUtil.getRandomNumber(10,2);
            Assert.assertThat(r,isIn(s));
        }

        for (int i = 0; i < 1000; i++) {
            Integer r = RandomUtil.getRandomNumber(10,-20);
            Assert.assertTrue((-20<=r && r<10)==true);
        }
        expectedException.expect(MyException.class);
        expectedException.expectMessage(MyExceptionEnum.RANDOM_NUMBER_ERROR.getInfo());
        RandomUtil.getRandomNumber(10,20);
        RandomUtil.getRandomNumber(10,10);
    }

    @Test
    public void createRandomStr() throws MyException {
        Pattern compile = Pattern.compile("^[2-9]*$");

        String randomStr = RandomUtil.createRandomStr(1);
        Assert.assertTrue(compile.matcher(randomStr).matches());

        randomStr = RandomUtil.createRandomStr(10);
        Assert.assertTrue(compile.matcher(randomStr).matches());

        expectedException.expect(MyException.class);
        expectedException.expectMessage(MyExceptionEnum.LENGTH_LESS_ONE_ERROR.getInfo());
        RandomUtil.createRandomStr(0);
    }
}