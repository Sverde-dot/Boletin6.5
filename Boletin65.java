
package boletin.pkg6.pkg5;

import java.util.Scanner;


public class Boletin65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclea primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Teclea segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Teclea tercer número: ");
        int num3 = sc.nextInt();
        clase5 obxMaior = new clase5(num1,num2,num3);

        if (obxMaior.getnum1()>obxMaior.getnum2() && obxMaior.getnum1()>obxMaior.getnum3()) 
        System.out.println(num1+" es el numero mayor");
        else if (obxMaior.getnum2()>obxMaior.getnum1() && obxMaior.getnum2()>obxMaior.getnum3())
        System.out.println(num2+" es el numero mayor");
        else if (obxMaior.getnum3()>obxMaior.getnum1() && obxMaior.getnum3()>obxMaior.getnum2())
        System.out.println(num3+" es el numero mayor");
        else
        System.out.println("Hay números repetidos o iguales");
    }


    }
    

