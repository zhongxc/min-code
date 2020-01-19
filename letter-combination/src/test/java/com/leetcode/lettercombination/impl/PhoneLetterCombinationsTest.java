package com.leetcode.lettercombination.impl;

import com.leetcode.enums.MyExceptionEnum;
import com.leetcode.exception.MyException;
import com.leetcode.factory.LetterCombinationsFactory;
import com.leetcode.lettercombination.LetterCombinations;
import com.leetcode.vo.CombinationVO;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PhoneLetterCombinationsTest {


    @Rule
    public ExpectedException thown = ExpectedException.none();

    @Test
    public void letterCombinations() throws MyException {
        LetterCombinations combinations = LetterCombinationsFactory.getPhoneCombinations();
        CombinationVO combinationVO = combinations.letterCombinations("2");
        Assert.assertEquals(combinationVO,new CombinationVO("a","b","c"));
        combinationVO = combinations.letterCombinations("3");
        CombinationVO combinationVO1 = new CombinationVO("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        Assert.assertEquals(combinationVO,combinationVO1);
        combinationVO = combinations.letterCombinations("1");
        Assert.assertEquals(combinationVO,combinationVO1);
        //异常测试
        thown.expect(MyException.class);
        thown.expectMessage(MyExceptionEnum.NO_NUMBER.getInfo());
        combinations.letterCombinations("231Q");
    }
}