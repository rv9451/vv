import java.util.*;
class arms{
public static void main(String[] args){
int a,z,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no: ");
a = sc.nextInt();
z=a;
for(int i=0;i<=z;i++){
if(a!=0){
count = count++;
}
}
System.out.println("The no of count: "+count);
}
}