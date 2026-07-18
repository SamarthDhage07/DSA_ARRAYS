public class arryas_09_subarrays {

    public static void printsubarrays(int number[],int k){
        int count =0;

        if(number[number.length-1]==k){
            count++;
        }


        for(int i=0;i<number.length;i++){
            int sum=0;

            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;

                for(int m=start;m<=end;m++){
                    sum +=number[m];
                    System.out.print(number[m]);
                    }
                if(sum==k){
                    count ++;
                }
                System.out.println();


            }
            System.out.println();

        }
        System.out.println(count);
    }









    public static void main(String[] args) {
        int number[]={1,2,1,2,1};
        int k=3;
        printsubarrays(number,k);



    }
}
