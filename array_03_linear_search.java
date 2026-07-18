import java.security.Key;
import java.util.Scanner;

public class array_03_linear_search {

    public static int linearsearch(int numbers[],int Key){

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==Key){
                return i;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int numbers[]={2,4,6,8,10,12,14,16,18,};
        System.out.print("Enter the Key : ");
        int Key=sc.nextInt();

        int index= linearsearch(numbers, Key);
        if(index==-1){
            System.out.println("NOT FOUND ");

        }
        else{
            System.out.println("KEY FOUND AT THE INDEX "+index);
        }




    }
}
