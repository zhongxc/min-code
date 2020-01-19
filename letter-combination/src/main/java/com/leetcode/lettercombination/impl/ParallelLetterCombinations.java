package com.leetcode.lettercombination.impl;

import com.leetcode.ApplicationContext;
import com.leetcode.enums.MyExceptionEnum;
import com.leetcode.exception.MyException;
import com.leetcode.lettercombination.LetterCombinations;
import com.leetcode.tools.NumberTools;
import com.leetcode.vo.CombinationVO;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

@Slf4j
public class ParallelLetterCombinations implements LetterCombinations {

    @Override
    public CombinationVO letterCombinations(String digits) throws MyException {
        NumberTools.isNumberString(digits);
        List<String> combinations = Arrays.asList(digits.split("|")).parallelStream().map(this::getMap).reduce(ParallelLetterCombinations::apply).get();
        return new CombinationVO(combinations);
    }

    private static List<String> apply(List<String> leftStr, List<String> rigthStr) {
        List<String> resultList = new LinkedList<>();
        for (int i = 0; i < leftStr.size(); i++) {
            for (int j = 0; j < rigthStr.size(); j++) {
                resultList.add(leftStr.get(i)+rigthStr.get(j));
            }
        }
        return resultList;
    }

    private List<String> getMap(String str){
        String letterStr = ApplicationContext.keys[Integer.parseInt(str)];
        return Arrays.asList(letterStr.split("|"));
    }
}
