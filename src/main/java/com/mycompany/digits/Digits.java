/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.digits;

import java.util.Scanner;

/**
 *
 * @author Islam Mohamed
 */
public class Digits {

    public static void main(String[] args) {
        byte T; 
        int N[] = new int[10];
        String num[] = new String[10];

        Scanner scan = new Scanner(System.in);
        T = scan.nextByte();
        for(int i=0;i<T;i++){
            N[i] = scan.nextInt();
            num[i] = String.valueOf(N[i]);
        
        }
        for(int i=0;i<T;i++){
            for(int j=num[i].length()-1;j>=0;j--){
                System.out.print(num[i].charAt(j)+" ");
            }
            System.out.println();
        }
        
    }
}
