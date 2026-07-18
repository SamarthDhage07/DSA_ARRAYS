import java.util.Scanner;



public class array_01_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] fruits = {"apple","orange","banana","coconut"};

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);

        //-----------------------------------------------------------//

        int marks[]=new int[100];

        System.out.println("enter marks");

        marks[0]=sc.nextInt();     // taking value of arrays from user
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy :"+marks[0]);
        System.out.println("chem  : "+marks[1]);
        System.out.println("maths : "+marks[2]);

        marks[2]=marks[2]+5;   // updating the value

        System.out.println("updated marks of maths : "+ marks[2]);

        //---------------------------------------------------------------//

        System.out.println("lenght of an array "+ marks.length);    // lenght of an array
        System.out.println("lenght of an array "+ fruits.length);











    }
}
