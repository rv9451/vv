import java.util.*;
class A{
public static void main(String[] args){
int r;
double a,pi = 3.14;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius:");
r = sc.nextInt();
a = pi*r*r;
System.out.println("The area of circle: "+a);
}
}