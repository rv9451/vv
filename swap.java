import java.util.*;
class swaped{
public static void main(String[] args){
int a,b,temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no :");
a=sc.nextInt();
b=sc.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("The swaped no is :"+a+" "+b);
}
}