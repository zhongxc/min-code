package com.leetcode.lettercombination;

import com.leetcode.exception.MyException;
import com.leetcode.vo.CombinationVO;

public interface LetterCombinations {

    CombinationVO letterCombinations(String digits) throws MyException;
}
