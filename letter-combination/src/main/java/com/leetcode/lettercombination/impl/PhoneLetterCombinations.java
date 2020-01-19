package com.leetcode.lettercombination.impl;

import com.leetcode.ApplicationContext;
import com.leetcode.enums.MyExceptionEnum;
import com.leetcode.exception.MyException;
import com.leetcode.lettercombination.LetterCombinations;
import com.leetcode.tools.NumberTools;
import com.leetcode.vo.CombinationVO;

import java.util.*;
import java.util.regex.Pattern;

/**
 * 模拟手机输入按键的场景的实现
 */
public class PhoneLetterCombinations implements LetterCombinations {
    private List<String> combinations = new LinkedList<>();

    @Override
    public CombinationVO letterCombinations(String digits) throws MyException {
        NumberTools.isNumberString(digits);
        if (digits.length()==0) {
            return new CombinationVO(combinations);
        }
        composeLetters(digits);
        return new CombinationVO(combinations);
    }

    private void composeLetters(String digits){
        String strings = ApplicationContext.keys[Integer.parseInt(digits)];
        List<String> combinationsTmp = new LinkedList<>();
        if(combinations.isEmpty()){
            combinations.addAll(Arrays.asList(strings.split("|")));
        }else{
            for (int i = 0; i < combinations.size(); i++) {
                for (String str:strings.split("|")) {
                    combinationsTmp.add(combinations.get(i)+str);
                }
            }
            combinations = combinationsTmp;
        }
    }
}
