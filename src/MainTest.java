class A1
{
    public void methodOne()
    {
        System.out.println("AAA");
    }
}
 
class B extends A1
{
    public void methodOne()
    {
        System.out.println("BBB");
    }
}
 
public class MainTest
{
    public static void main(String[] args)
    {
        A1 a = new B();//Child
 
        a.methodOne();
        
        B a1 = new B();//Child
        a1.methodOne();
        //B a2 = new A1();//Invalid 
        A1 a3=new A1();
        a3.methodOne();
    }
}