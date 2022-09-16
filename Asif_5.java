// 2.without declaring input.
 import java.util.Scanner;
public class Asif_5 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String n=input.next().toString();
        Asif_5 obj1=new Asif_5();
        Asif_5 obj=new Asif_5(n);
    }
    Asif_5(){
        System.out.println("I love programming languages");
    }
    Asif_5(String a){
        System.out.println("I love "+a);
    }

    }


