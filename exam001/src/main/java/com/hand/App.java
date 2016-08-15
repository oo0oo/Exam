package com.hand;


public class App 
{
    public static void main( String[] args )
    {
        System.out.print("输出101到200之间共有21个素数，分别是：");
        
        int a = 101;
        int b = 200;
     
        boolean yn = false;
        for ( a = 101; a < 200; a++) {
        	for ( b = 2; b < 100; b++) {
				if (a%b==0) {
					yn = true;
					break;
				}
			}
        	if (yn) {
				yn = false;
				continue;
			}
        	
        	System.out.print(a+",");
			
		}
    }

}