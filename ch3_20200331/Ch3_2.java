/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20200331;

/**
 *
 * @author xvpow
 */
public class Ch3_2 {
static void test(){
    System.out.println("");
}
    public static void main(String[] args) {
	
    //	for ( int i =1; i<=3 ; i++ ){
    //	    System.out.print(i+" ");
    //	}
	//System.out.println(i);//會錯誤因為i宣告在for迴圈內
	
	int a = 1,b =2,c= 3,x=1;
	for (a = x++; a <= 3 && ++b < 10; a++,c++){
	    System.out.println("a:"+a);
	}
	//a=1  b=3 p: 1 x=2
	//a=2 b=4 c=4 p:2
	//a=3 b=5 c=5 p:3
	//a=4,c =6
	 System.out.println("a:"+a);
	 System.out.println("b:"+b);
	 System.out.println("c:"+c);
	 System.out.println("x:"+x);
    }
    
}
