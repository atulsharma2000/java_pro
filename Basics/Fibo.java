package Basics;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Prog to print Numbers in Fibonacci till n numbers");
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int first=0,sec=1;
        int third=0;

        if(n<0)
            System.out.println("Less than 0 invalid");
        if(n==0){
            System.out.println("0 ");
            return;
        }
        if(n==1){
            System.out.print("1 ");
            return;
        }   
        if(n>1){
            System.out.print("0 ");
            System.out.print("1 ");
                while(first+sec <=n){
                    third=first+sec;
                    System.out.print(third+" ");
                    first = sec;
                    sec = third;

                }          
         }
         
         System.out.println("\n\n--n fibo numbers using rec --\n\n ");
         System.out.print("Enter how many fibbonaci numbers you want: ");
         int zzz = sc.nextInt();
         for(int k=1;k<=zzz;k++){
                System.out.print(recFibbo(k)+" ");
         }
         System.out.println("\n");

 }

 public static int recFibbo(int pos){
        if(pos==1) return 0;
        if(pos==2) return 1;
        
        return recFibbo(pos-1)+recFibbo(pos-2);

        
 }
}
