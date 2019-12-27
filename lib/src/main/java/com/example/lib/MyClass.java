package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        String s = scanner.next();
        int Num0=0,Num1=0,Num2=0,Num3=0,Num4=0,Num5=0,Num6=0,Num7=0,Num8=0,Num9=0;
        for(int i=0;i<s.length();i++){
            switch (Integer.parseInt(String.valueOf(s.charAt(i)))){
                case 0:
                    Num0++;
                    break;
                case 1:
                    Num1++;
                    break;
                case 2:
                    Num2++;
                    break;
                case 3:
                    Num3++;
                    break;
                case 4:
                    Num4++;
                    break;
                case 5:
                    Num5++;
                    break;
                case 6:
                    Num6++;
                    break;
                case 7:
                    Num7++;
                    break;
                case 8:
                    Num8++;
                    break;
                case 9:
                    Num9++;
                    break;
            }
        }
        int arr[]={Num0,Num1,Num2,Num3,Num4,Num5,Num6,Num7,Num8,Num9};
        for(int i=0;i<10;i++ ){
            System.out.printf(" %d appear %d time(s)\n",i,arr[i]);
        }
    }
}