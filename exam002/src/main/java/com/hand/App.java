package com.hand;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
    	Scanner in = new Scanner(System.in);
    	System.out.print("请输入工资:"  );
    	 float sal = in.nextFloat();
    	    	 float as;
    	if (sal>80000) {
    		float s_7 = (sal-80000)*0.45f;
    		float s_6 = 25000 *0.35f;
    		float s_5 = 20000 *0.30f;
    		float s_4 = 16000 *0.25f;
    		float s_3 = 4000 *0.20f;
    		float s_2 = 3000 *0.10f;
    		float s_1 = 1500 *0.03f;
    		 as = s_1 + s_2 + s_3+ s_4+ s_5+ s_6+s_7;
			}else if (sal > 55000) {
				//float s_7 = (sal-80000)*0.45f;
	    		float s_6 = (sal-55000) *0.35f;
	    		float s_5 = 20000 *0.30f;
	    		float s_4 = 16000 *0.25f;
	    		float s_3 = 4000 *0.20f;
	    		float s_2 = 3000 *0.10f;
	    		float s_1 = 1500 *0.03f;
	    		 as = s_1 + s_2 + s_3+ s_4+ s_5+ s_6;
			}else if (sal>35000) {
				//float s_6 = (sal-55000) *0.35f;
	    		float s_5 = (sal-35000) *0.30f;
	    		float s_4 = 16000 *0.25f;
	    		float s_3 = 4000 *0.20f;
	    		float s_2 = 3000 *0.10f;
	    		float s_1 = 1500 *0.03f;
	    		 as = s_1 + s_2 + s_3+ s_4+ s_5;
			}else if (sal > 9000) {
				//float s_5 = (sal-35000) *0.30f;
	    		float s_4 = (sal-9000) *0.25f;
	    		float s_3 = 4000 *0.20f;
	    		float s_2 = 3000 *0.10f;
	    		float s_1 = 1500 *0.03f;
	    		 as = s_1 + s_2 + s_3+ s_4;
			}else if (sal>4500) {
				//float s_4 = (sal-9000) *0.25f;
	    		float s_3 = (sal-4500) *0.20f;
	    		float s_2 = 3000 *0.10f;
	    		float s_1 = 1500 *0.03f;
	    		 as = s_1 + s_2 + s_3;
			}else if (sal>1500) {
				//float s_3 = (sal-4500) *0.20f;
	    		float s_2 = (sal-1500) *0.10f;
	    		float s_1 = 1500 *0.03f;
	    		 as = s_1 + s_2;
			}else {
			
	    		 as = sal * 0.03f;
		}
    	System.out.println("所需要缴纳的税费为:"+ as );
    }
}