package com.leetcode.lettercombination.impl;

import com.leetcode.ApplicationContext;
import com.leetcode.exception.MyException;
import com.leetcode.lettercombination.LetterCombinations;
import com.leetcode.tools.NumberTools;
import com.leetcode.vo.CombinationVO;

import java.util.LinkedList;
import java.util.List;

/**
 * 输入字符串组合字母
 */
public class StringLetterCombinations implements LetterCombinations {


    private List<String> combinations ;
    private String digits ;

    @Override
    public CombinationVO letterCombinations(String d) throws MyException {
        NumberTools.isNumberString(d);
        combinations = new LinkedList<>();
        if (d.length()==0) {
            return new CombinationVO(combinations);
        }
        digits = d;
        composeLetters("",0);
        return new CombinationVO(combinations);
    }

    /**
     * 使用回朔算法实现字符组合
     * @param compose
     * @param index
     */
    private void composeLetters(String compose,int index) {
        //设置退出条件
        if (digits.length()==index) {
            combinations.add(compose);
            return;
        }else{
            int real = digits.charAt(index)-'0';
            String strings = ApplicationContext.keys[real];
            for (int i=0;i<strings.length();i++) {
                //进行回朔
                composeLetters(compose+strings.charAt(i),1+index);
            }
        }
    }
}
