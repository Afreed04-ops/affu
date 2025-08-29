public class Calculator
{
public int add(int a,int b)
    { 
        return a+b;
    }
public int subtract(int a,int b)
    {
        return a-b;
    }
public int multiply(int a,int b)
    {
        return a*b;
    }
public int divide(int a, int b) 
    {
    if (b == 0) 
    {
        throw new ArithmeticException("Cannot divide by zero");
    }
    return a / b;
}
public static void main(String args[])
{
Calculator cal=new Calculator();
System.out.println("addition"+cal.add(10,5));
System.out.println("subtraction"+cal.subtract(10,5));
System.out.println("multiplication"+cal.multiply(10,5));
System.out.println("division"+cal.divide(10,5));
}
}
