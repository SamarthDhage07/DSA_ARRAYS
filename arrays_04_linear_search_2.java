import java.util.Scanner;

public class arrays_04_linear_search_2 {

    public static int linearsearch2(String items[],String drinks){

        for(int i=0;i<items.length;i++){
            if(items[i]==drinks){
                return i;
            }
        }
        return -1;
    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String items[]={"coffee","tea","drink"};
        System.out.print("Enter drinks :");
        String drinks=sc.nextLine();

        int index=linearsearch2(items,drinks);
        if(index==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("FOUND AT THE INDEX "+index);
        }



    }
}
