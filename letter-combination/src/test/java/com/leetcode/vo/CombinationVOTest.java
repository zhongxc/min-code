package com.leetcode.vo;

import com.leetcode.enums.MyExceptionEnum;
import com.leetcode.exception.MyException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.matchers.StacktracePrintingMatcher;
import org.junit.rules.ExpectedException;
import org.junit.runners.model.Statement;
import org.mockito.internal.matchers.GreaterOrEqual;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class CombinationVOTest {

    @Rule
    public ExpectedException thown = ExpectedException.none();
    @Test
    public void isEmpty() {
        CombinationVO combinationVO = new CombinationVO();
        Assert.assertTrue(combinationVO.isEmpty());
        combinationVO.setList(null);
        Assert.assertTrue(combinationVO.getList()==null);
        Assert.assertTrue(new CombinationVO("ab","cd","ef").isEmpty()==false);
    }

    @Test
    public void size() throws MyException {
        thown.expect(MyException.class);
        thown.expectCause(isA(NullPointerException.class));
        CombinationVO combinationVO = new CombinationVO();
        Assert.assertTrue(new CombinationVO("ab","cd","ef").size()==3);
        Assert.assertTrue(new CombinationVO().size() == 0);
//        异常测试
        combinationVO.setList(null);
        combinationVO.size();
    }

    @Test
    public void testEquals() {
        Assert.assertTrue(new CombinationVO().equals(null) == false);
        Assert.assertTrue(new CombinationVO().equals(new CombinationVO()));
        CombinationVO a = new CombinationVO("ab","cd","ef");
        CombinationVO b = new CombinationVO("ab","cd","ef");
        Assert.assertTrue(a.equals(b));
    }
}