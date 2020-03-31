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
	
	int[] scores = new int[5];
	scores[2] = 75;
	scores[1] = 96;
	scores[3] = 67;
	
	for (int i= 0; i < scores.length;i++){
	    System.out.print(scores[i]+" ");
	}
    }
    
}
