class rec{
    int length;
    int breadth;

    public rec(){
        length=0;
        breadth=0;

    }
    public rec(int length){
       this.length=length;
        this.breadth=length;

    }
    public rec(int length,int breadth){
       this.length=length;
       this.breadth=breadth;
    }
    public void m(){
        System.out.println(length*breadth);
    }
}
public class Asif_3{
    public static void main(String[]args){
        rec input=new rec();
        input.m();
        rec input1 =new rec(10);
        input1.m();
        rec input2=new rec(15,6);
        input2.m();

    }
}
