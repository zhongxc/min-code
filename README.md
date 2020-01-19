# min-code
包结构：
com.leetcode 
  client 程序运行客户端
  enums  枚举类：主要有异常枚举
  exception  自定义异常
  factory    工厂类包
  lettercombination  字母组合实现接口和方法
  tools    工具类包
  vo   功能实体类
  
设计思路：
实现了3种字母组合实现方式：
  1.PhoneLetterCombinations：每次输入一个数字，得出结果；
  2.StringLetterCombinations：以回朔算法实现；
  3.ParallelLetterCombinations：以lambda表达式的并发实现；

技术点：
1.lambda表达式实现的map reduce并发；
2.回朔算法
3.工厂设计模式，命令模式
4.ExpectedException的异常测试方法
