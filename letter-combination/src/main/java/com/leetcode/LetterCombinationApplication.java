package com.leetcode;

import com.leetcode.client.ParallelClient;
import com.leetcode.client.PhoneClient;
import com.leetcode.client.StringClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LetterCombinationApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LetterCombinationApplication.class);
    }



    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for(;;){
            System.out.println("请选择: 1开始, 0结束退出");
            String inputs = scanner.nextLine();

            if ("0".equals(inputs)) {//结束退出
                break;
            }
            System.out.println("请选择模式：");
            System.out.println("1:模拟电话模式");
            System.out.println("2:输入完整参数模式");
            System.out.println("3:自动生成字符模式");
            inputs = scanner.nextLine();
            System.out.println("Tips:请不要轻易尝试输出长度超过10的字符，会很慢！！！");
            switch (inputs){
                case "1":
                    PhoneClient.runClient();
                    break;
                case "2":
                    StringClient.runClient();
                    break;
                case "3":
                    ParallelClient.runClient();
                    break;
                default:
                    System.out.println("输入有误，请重新输入。");
                    break;
            }
        }
    }
}
