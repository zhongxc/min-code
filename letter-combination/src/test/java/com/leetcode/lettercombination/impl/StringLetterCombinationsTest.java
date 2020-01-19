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
public class StringLetterCombinationsTest {

    @Rule
    public ExpectedException thown = ExpectedException.none();

    @Test
    public void letterCombinationsTest() throws MyException {

        LetterCombinations strLetterCombinations = LetterCombinationsFactory.getStrCombinations();
        CombinationVO combinationVO = strLetterCombinations.letterCombinations("23546");
        Assert.assertEquals(combinationVO,new CombinationVO("adjgm", "adjgn", "adjgo", "adjhm", "adjhn", "adjho", "adjim", "adjin", "adjio", "adkgm", "adkgn", "adkgo", "adkhm", "adkhn", "adkho", "adkim", "adkin", "adkio", "adlgm", "adlgn", "adlgo", "adlhm", "adlhn", "adlho", "adlim", "adlin", "adlio", "aejgm", "aejgn", "aejgo", "aejhm", "aejhn", "aejho", "aejim", "aejin", "aejio", "aekgm", "aekgn", "aekgo", "aekhm", "aekhn", "aekho", "aekim", "aekin", "aekio", "aelgm", "aelgn", "aelgo", "aelhm", "aelhn", "aelho", "aelim", "aelin", "aelio", "afjgm", "afjgn", "afjgo", "afjhm", "afjhn", "afjho", "afjim", "afjin", "afjio", "afkgm", "afkgn", "afkgo", "afkhm", "afkhn", "afkho", "afkim", "afkin", "afkio", "aflgm", "aflgn", "aflgo", "aflhm", "aflhn", "aflho", "aflim", "aflin", "aflio", "bdjgm", "bdjgn", "bdjgo", "bdjhm", "bdjhn", "bdjho", "bdjim", "bdjin", "bdjio", "bdkgm", "bdkgn", "bdkgo", "bdkhm", "bdkhn", "bdkho", "bdkim", "bdkin", "bdkio", "bdlgm", "bdlgn", "bdlgo", "bdlhm", "bdlhn", "bdlho", "bdlim", "bdlin", "bdlio", "bejgm", "bejgn", "bejgo", "bejhm", "bejhn", "bejho", "bejim", "bejin", "bejio", "bekgm", "bekgn", "bekgo", "bekhm", "bekhn", "bekho", "bekim", "bekin", "bekio", "belgm", "belgn", "belgo", "belhm", "belhn", "belho", "belim", "belin", "belio", "bfjgm", "bfjgn", "bfjgo", "bfjhm", "bfjhn", "bfjho", "bfjim", "bfjin", "bfjio", "bfkgm", "bfkgn", "bfkgo", "bfkhm", "bfkhn", "bfkho", "bfkim", "bfkin", "bfkio", "bflgm", "bflgn", "bflgo", "bflhm", "bflhn", "bflho", "bflim", "bflin", "bflio", "cdjgm", "cdjgn", "cdjgo", "cdjhm", "cdjhn", "cdjho", "cdjim", "cdjin", "cdjio", "cdkgm", "cdkgn", "cdkgo", "cdkhm", "cdkhn", "cdkho", "cdkim", "cdkin", "cdkio", "cdlgm", "cdlgn", "cdlgo", "cdlhm", "cdlhn", "cdlho", "cdlim", "cdlin", "cdlio", "cejgm", "cejgn", "cejgo", "cejhm", "cejhn", "cejho", "cejim", "cejin", "cejio", "cekgm", "cekgn", "cekgo", "cekhm", "cekhn", "cekho", "cekim", "cekin", "cekio", "celgm", "celgn", "celgo", "celhm", "celhn", "celho", "celim", "celin", "celio", "cfjgm", "cfjgn", "cfjgo", "cfjhm", "cfjhn", "cfjho", "cfjim", "cfjin", "cfjio", "cfkgm", "cfkgn", "cfkgo", "cfkhm", "cfkhn", "cfkho", "cfkim", "cfkin", "cfkio", "cflgm", "cflgn", "cflgo", "cflhm", "cflhn", "cflho", "cflim", "cflin", "cflio"));
        combinationVO = strLetterCombinations.letterCombinations("231");
        Assert.assertEquals(combinationVO,new CombinationVO());
        combinationVO = strLetterCombinations.letterCombinations("230");
        Assert.assertEquals(combinationVO,new CombinationVO());
        //异常测试
        thown.expect(MyException.class);
        thown.expectMessage(MyExceptionEnum.NO_NUMBER.getInfo());
        strLetterCombinations.letterCombinations("230qwe");
    }
}