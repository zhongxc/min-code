package com.leetcode.client;

import com.leetcode.exception.MyException;
import com.leetcode.factory.LetterCombinationsFactory;
import com.leetcode.lettercombination.LetterCombinations;
import com.leetcode.tools.NumberTools;
import com.leetcode.tools.RandomUtil;
import com.leetcode.vo.CombinationVO;

import java.util.Scanner;

public class ParallelClient {

    public static void runClient(){
        new ParallelClient().run();
    }

    public void run(){
        System.out.println("请输入长度，按回车键则显示结果，输入exit返回上一层");
        Scanner scanner = new Scanner(System.in);
        String inputs;
        boolean printFlag = false;
        LetterCombinations combinations = LetterCombinationsFactory.getParallelLetterCombinations();
        LetterCombinations strCombinations = LetterCombinationsFactory.getStrCombinations();
        System.out.println("是否输出运算结果：y/n");
        inputs = scanner.nextLine();
        if("y".equals(inputs)){
            printFlag = true;
        }
        for (;;) {
            inputs = scanner.nextLine();
            if("exit".equals(inputs)){
                break;
            }
            try {
                NumberTools.isNumberString(inputs);
                String str = RandomUtil.createRandomStr(Integer.parseInt(inputs));
                System.out.println("生成字符为："+str);
                long st = System.currentTimeMillis();
                CombinationVO combinationVO = combinations.letterCombinations(str);
                System.out.println("并发运算耗时(毫秒)："+(System.currentTimeMillis()-st));

                st = System.currentTimeMillis();
                CombinationVO combinationVO1 = strCombinations.letterCombinations(str);
                System.out.println("单线程运算耗时(毫秒)："+(System.currentTimeMillis()-st));
                if(printFlag){
                    System.out.println("并发运算结果：");
                    combinationVO.println();
                    System.out.println("单线程运算结果：");
                    combinationVO1.println();
                }
            } catch (MyException e) {
                System.out.println("运行有误：");
                System.out.println(e.getInfo());
            }
        }
    }
}
