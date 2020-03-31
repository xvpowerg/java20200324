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
public class Ch3_6 {
    public static void main(String[] args) {
	//陣列 陣列不是基本型態
	//陣列預設值
	//整數:0 浮點數:0.0 字元:空白字元 布林:false
	int[] scores = new int[5];
	scores[2] = 75;
	scores[1] = 96;
	scores[3] = 67;
	
	for (int i= 0; i < scores.length;i++){
		  System.out.print(scores[i]+" ");
	}
	System.out.println();
	//適合輪巡  不需要知道index時
	for (int k : scores){
	    System.out.print(k+" ");
	}
	System.out.println();
    }
    
}
