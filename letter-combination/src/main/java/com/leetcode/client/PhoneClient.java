package com.leetcode.client;

import com.leetcode.exception.MyException;
import com.leetcode.factory.LetterCombinationsFactory;
import com.leetcode.lettercombination.LetterCombinations;

import java.util.Scanner;

public class PhoneClient {

    public static void runClient(){
        new PhoneClient().run();
    }

    public void run(){
        System.out.println("请输入单个数字，按回车键则显示结果，输入exit返回上一层");
        Scanner scanner = new Scanner(System.in);
        String inputs,params="";
        LetterCombinations combinations = LetterCombinationsFactory.getPhoneCombinations();
        for (;;) {
            inputs = scanner.nextLine();
            if("exit".equals(inputs)){
                break;
            }
            if(inputs.length()>1){
                System.out.println("请输入一个数字");
                continue;
            }
            if(params.length()>8){
                System.out.println("输入太长了，清空重新输入");
                params = inputs;
                combinations = LetterCombinationsFactory.getPhoneCombinations();
            }
            params = params+inputs;
            System.out.println("输入字符为：");
            System.out.println(params);
            try {
                combinations.letterCombinations(inputs).println();
            } catch (MyException e) {
                System.out.println("运行有误：");
                System.out.println(e.getInfo());
            }
        }
    }
}
