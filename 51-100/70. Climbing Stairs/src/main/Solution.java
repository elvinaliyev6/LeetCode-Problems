package main;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public int climbStairs(int n) {

        int p2=0,p1=1,result=0;
        for(int i=1;i<=n;i++)
        {
            result=p2+p1;
            p2=p1;
            p1=result;
        }
        return result;
    }


}
