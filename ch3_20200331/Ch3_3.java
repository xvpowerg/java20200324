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
public class Ch3_3 {
    public static void main(String[] args) {
	for (char c1 = 'a';c1 <= 'z'; c1++){
	    if (c1 == 'e'){
		//break;//離開迴圈 //指印到d後面都不輸出
		continue;//只有e不輸出其他都輸出 回到for迴圈的第三個位置
	    }
	    System.out.print(c1+" ");
	}
	
	
	
    }
}
