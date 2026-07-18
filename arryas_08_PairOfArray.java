public class arryas_08_PairOfArray {

    public static void pair(int n[]){
        for(int i=0;i<n.length;i++){
            for(int j=1;j<n.length;j++){
                System.out.print("("+n[i]+"|"+n[j]+")  ");
            }
        }
    }








    public static void main(String[] args) {

        int n[]={2,4,6,8,};
        pair(n);


    }
}
