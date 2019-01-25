import java.util.Scanner;
import java.io.IOException;
public class test
{
public static void main(String[] args) throws IOException
{
int i=0;
Scanner in = new Scanner(System.in);
while(i==0)
{
System.out.println("Please choose below convertion option");
int expr = in.nextInt();
switch(expr)
{
case 1 :
     System.out.println("case 1");
    break;
}
 System.out.println("do you want to continue enter 0");
i = in.nextInt();
}
}
} 