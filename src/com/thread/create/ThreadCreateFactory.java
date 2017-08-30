package com.thread.create;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadCreateFactory {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            char[] s = cin.next().toCharArray();
            int n = s.length;

            //用curSum来保存已有计算结果
            //sum计算4种情况之和
            int sum = 0, curSum = 0;
            for (int i = 0; i < 4; ++i) {
                curSum *= 25;
                if (i < n) {
                    curSum += s[i] - 'a';
                }
                sum += curSum;
                if (i < n - 1) {
                    sum += 1;
                }
            }

            System.out.println(sum);
            cin.close();
        }
}
