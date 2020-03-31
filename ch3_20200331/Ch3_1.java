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
public class Ch3_1 {
    public static void main(String[] args) {
	int v1= 5,v2 = 2;
	String action = "/";
	
	switch(action){
	    case "+":
	      System.out.println(v1 + v2);
		break;
	    case "-":
	       System.out.println(v1 - v2);
               break;
	    case "*":
	      System.out.println(v1 * v2);
		break;
	    case "/":
	      System.out.println(v1 / (float)v2);
		break;
	}
	
    }
    
}
