public class arrays_06_binarysearch {

    public static int BinarySearch(int number[],int key){
        int start=0,end = number.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            //comparison
            if(number[mid]==key){//found
                return mid;
            }
            if(number[mid]>key){ //left
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("index of the key is "+BinarySearch(number,key));

    }
}
