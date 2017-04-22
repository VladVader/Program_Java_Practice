/**
 * Created by vlad on 20.04.17.
 */
public class Binary {


    public static void main(String[] args) {
        int[] arr = { 1,12,23,34,55,61,67,88,89,101 };
        System.out.println(rank(55, arr));
    }




   public static int rank(int num,int[] arr){
        return rank(num,arr,0,arr.length-1);
   }

    public static int rank(int num,int [] arr,int low,int hi){
        if (low>hi) return -1;
        int sr=low+(low+hi)/2;
        if (num>arr[sr]) return rank(num,arr,sr+1,hi);
        if (num<arr[sr]) return rank(num,arr,low,sr-1);
        else return sr;
    }






}
