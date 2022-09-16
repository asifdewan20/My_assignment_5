
class student{
    String sa;
    String name;
    public student(String sa){
        name = sa;
    }
    public student()
    {
        name = "unknown";
    }
}
public class Asif_1{
    public static void main(String[] args) {
        student obj = new student();
        obj.sa = "Fiamur";
        System.out.println(obj.sa);
        System.out.println(obj.name);

    }
}