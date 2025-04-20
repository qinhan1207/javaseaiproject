package com.qinhan.forE;

public class ForE {
    public static void main(String[] args) {
        printfMultifyTable();
    }
    public static void printfMultifyTable(){
        for (int i = 1; i <= 9; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
