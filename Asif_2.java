
class programming {
    String sa;
    String name;

    public programming(String sa) {
        name=sa;

    }
    public programming(){
        name=" i love programming languages";
    }
}
public class Asif_2{
    public static void main(String[]args){
        programming input = new programming();
        input.sa= "java";
        System.out.println(" I love "+input.sa);
        System.out.println(""+input.name);
    }
}