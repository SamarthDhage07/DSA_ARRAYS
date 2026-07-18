public class arrays_05_largest {

    public static int largest(int number[]){
        int largest=0;
        for(int i=0;i<number.length;i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
     return largest;
    }

    public static void main(String[] args) {
       int number[]={3,6,9,4,5};

        System.out.println("largest value is "+largest(number));

    }
}
