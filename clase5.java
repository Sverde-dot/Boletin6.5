
package boletin.pkg6.pkg5;

import java.util.Scanner;

public class clase5 {
    Scanner sc=new Scanner(System.in);
    private int num1;
    private int num2;
    private int num3;
 
    public clase5(){
    }

   public clase5(int num1,int num2,int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }
    public void setnum1(){
        this.num1=num1;
    }
        public int getnum1(){
        return num1; 
    }
        public void setnum2(){
        this.num2=num2;
    }
        public int getnum2(){
        return num2; 
    }
  
        public void setnum3(){
        this.num3=num3;
    }
        public int getnum3(){
        return num3; 
    }
        
        
    public void Paso(int num1){
           switch(num1){
            case (num1>num2):
               System.out.println("Estamos a lunes");     
            break;
            case 2:
               System.out.println("Estamos a martes");     
            break;
            case 3:
               System.out.println("Estamos a miercoles");     
            break;
            case 4:
               System.out.println("Estamos a jueves");     
            break;
            case 5:
               System.out.println("Estamos a viernes");     
            break;
            case 6:
                System.out.println("Estamos a sabado");
            break;
            case 7:
                System.out.println("Estamos a domingo");
            break;
            default: System.out.println("Numero erroneo");
        }
    }


    }
