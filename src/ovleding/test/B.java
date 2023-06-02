package ovleding.test;

import java.sql.SQLException;

class A
{
    void myMethod() throws Exception
    {
        System.out.println("Super Class");
    }
}
 
class B extends A

{
	
	public static void main(String[] args) throws Exception {
		B b=new B();
		b.myMethod();
	}
    @Override
    void myMethod() throws SQLException
    {
        System.out.println("Sub Class");
    }
}