import java.util.*;
class Store
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("entre the mobile model ");
 String Mmodel=sc.nextLine();
 System.out.println("entre the mobile company ");
 String Mcompany=sc.nextLine();
 System.out.println("entre the mobile price ");
 int Mprice=sc.nextInt();
 Mobile M1=new Mobile();
 M1.Addmobile(Mmodel,Mcompany,Mprice);
 M1.displayMobile();

}
}