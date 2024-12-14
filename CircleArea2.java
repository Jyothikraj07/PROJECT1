import java.io.*;
import java.util.*;
class CircleArea2
{
double x,y;
double r;
double area()
{
return Math.PI*r*r;
}
public class CircleMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
CircleArea2 ca1 = new CircleArea2();
CircleArea2 ca2 = new CircleArea2();
System.out.println("Enter radius of first circle:");
ca1.r = sc.nextDouble();
System.out.println("Enter radius of second circle:");
ca2.r = sc.nextDouble();
System.out.println("Enter Area of first circle:" +ca1.area());
System.out.println("Enter Area of second circle:"+ca2.area());
}
}
}