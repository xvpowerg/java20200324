/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20200331;
import java.util.Random;
public class Ch3_8 {
    public static void main(String[] args) {
	//java預設都是由小到大排序
	//java 用快速排序法O(nlogn)
	int[] myNumber = new int[200];
	Random ran = new Random();
	for (int i = 0;i < myNumber.length;i++){
	    myNumber[i] = ran.nextInt(30000)+1;
	}
	
	for(int i =0;i<10;i++){
	  System.out.print(myNumber[i]+" ");
	}
	
	
    }
    
}
