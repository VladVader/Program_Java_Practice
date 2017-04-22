import java.util.Arrays;
import java.util.Random;

/**
 * Created by vlad on 23.03.17.
 */
public class Fast_sort {
    public static void main(String[] args){
        int[] array= new int[5];
        Random r= new Random();

        for (int i=0;i<array.length;i++){
            array[i]=r.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        sort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));


    }

    public static void sort(int[] arr,int low,int high){
        int i=low;
        int j=high;
        int x=arr[low+(high-low)/2];
        int temp;
        do {
            while (arr[i]<x)
                i++;
            while (x<arr[j])
                j--;
            if (i<=j) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            System.out.println(Arrays.toString(arr));


        }
        while (i<=j);
        if (low<j) sort(arr,low,j);
        if (i<high) sort(arr,i,high);

    }




    }





