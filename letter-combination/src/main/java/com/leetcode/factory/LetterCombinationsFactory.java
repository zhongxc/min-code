package com.leetcode.factory;

import com.leetcode.lettercombination.LetterCombinations;
import com.leetcode.lettercombination.impl.ParallelLetterCombinations;
import com.leetcode.lettercombination.impl.PhoneLetterCombinations;
import com.leetcode.lettercombination.impl.StringLetterCombinations;

public class LetterCombinationsFactory {
    private static LetterCombinations strCombinations = new StringLetterCombinations();
    private static LetterCombinations parallelLetterCombinations = new ParallelLetterCombinations();

    public static LetterCombinations getPhoneCombinations() {
        return new PhoneLetterCombinations();
    }

    public static LetterCombinations getStrCombinations() {
        return strCombinations;
    }

    public static LetterCombinations getParallelLetterCombinations() {
        return parallelLetterCombinations;
    }
}
