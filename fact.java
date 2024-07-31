import java.util.Scanner;
class B{
public static void main(String[] args){
int a,fac=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no ");
a = sc.nextInt();
for(int i=1;i<=a;i++){
fac = fac*i;
}
System.out.println("The factorial is :"+fac);
}
}