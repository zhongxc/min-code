package com.leetcode.client;

import com.leetcode.exception.MyException;
import com.leetcode.factory.LetterCombinationsFactory;
import com.leetcode.lettercombination.LetterCombinations;

import java.util.Scanner;

public class StringClient {

    public static void runClient(){
        new StringClient().run();
    }

    public void run(){
        System.out.println("请输入个一组数字，按回车键则显示结果，输入exit返回上一层");
        Scanner scanner = new Scanner(System.in);
        String inputs;
        LetterCombinations combinations = LetterCombinationsFactory.getStrCombinations();
        for (;;) {
            inputs = scanner.nextLine();
            if("exit".equals(inputs)){
                break;
            }
            try {
                combinations.letterCombinations(inputs).println();
            } catch (MyException e) {
                System.out.println("运行有误：");
                System.out.println(e.getInfo());
            }
        }
    }
}
