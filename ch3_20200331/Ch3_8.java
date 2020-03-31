/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20200331;
import java.util.Random;
import java.util.Arrays;
public class Ch3_8 {
    public static void main(String[] args) {
	//java預設都是由小到大排序
	//java 用快速排序法O(nlogn)
	int[] myNumber = new int[200];
	//1 我有一個長度為200的陣列
	//2 我希望陣列內的數值是1~30000之間的亂數
	Random ran = new Random();
	for (int i = 0;i < myNumber.length;i++){
	    myNumber[i] = ran.nextInt(30000)+1;//1~30000之間亂數
	}
	//可排序 使用快速排序法
	Arrays.sort(myNumber);
	for (int i= 0;i<10;i++){
	    System.out.print(myNumber[i]+" ");
	}
	System.out.println();
	//Java 是使用2分搜尋法 一定要遞增排序排序才能搜尋 
	//如果找不到一定是負數
	int search[] =  {6,8,10,25};
	int index = Arrays.binarySearch(search, 10);
	System.out.println(index);
	index = Arrays.binarySearch(search, 9);
	System.out.println(index);
    }
}
