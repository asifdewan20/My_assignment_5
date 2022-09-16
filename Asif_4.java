import java.util.Scanner;

// without declaring input.
public class Asif_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the names");

     String  n=input.next().toString();
        Asif_4 n1=new Asif_4 ();
        Asif_4 n2=new Asif_4 (n);
    }
    Asif_4 (){
        System.out.println("Unknown");
    }
    Asif_4 (String a){
        System.out.println("Name = "+a);
    }
}