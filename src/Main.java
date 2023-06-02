import java.io.IOException;

class Main
{
	public static void main(String[] args) {
		Main m=new Main();
		m.myMethod();
	}
    void myMethod() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("ONE");
    }
	/*
	 * void myMethod() throws NumberFormatException { System.out.println("TWO"); }
	 * 
	 * void myMethod() throws IOException { System.out.println("THREE"); }
	 */
}