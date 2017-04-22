/**
 * Created by vlad on 20.04.17.
 */
public class Linear {

    public static void main(String[] args) {
        int[] arr = { 1,12,23,34,55,61,67,88,89,101 };
        System.out.println(rank(55, arr));
    }




    public static int rank(int num,int[] arr){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==num) return i;
        }
        return -1;
    }
}
