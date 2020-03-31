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
public class Ch3_4 {

    public static void main(String[] args) {
	System.out.println("Start!");
	tag:
	for (int i =1; i <= 3; ++i){
	    System.out.println("i Start:"+i);
	    tag2:
	    for (int k = 1; k<= 5;++k){
		if (k==4){
		    break tag; //離開最接近標籤的for迴圈
		    //continue tag; //到最接近標籤的for迴圈的第三個位置
		}
		//%d 整數  %2d 不滿兩位數補空格
		System.out.printf("%d*%d=%2d ",i,k,k*i);
	    }
	     System.out.println();
	     System.out.println("i End:"+i);
	}
	System.out.println("End!");
    }
    
    
}
