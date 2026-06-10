import java.util.Scanner;
public class hello{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("please type your college roll number:");
        int rollnumber=input.nextInt();
        System.out.print("please type your exact curent cgpa:");
        double currentcgpa= input.nextDouble();
        System.out.println("---your placemnt profile---");
        System.out.println("roll number stored:"+rollnumber);
        System.out.println("cgpa stored:"+currentcgpa);
    }

}
