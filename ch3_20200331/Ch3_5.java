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
public class Ch3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//for 適合用在知道長度時
	//while 適合用不知道長度時
	//do while 適合用不知道 且必須先測試一次的
	int count = 0;
	while(count <= 5){
	    System.out.print(count+++" ");
	}
	System.out.println();
	int k= 10;
	do{
	    System.out.print(k--+" ");
	}while(k >= 1);
	
    }
    
}
