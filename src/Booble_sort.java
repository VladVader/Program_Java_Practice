import java.util.Arrays;
import java.util.Random;
import java.util.Date;

public class Booble_sort {

    public static void main(String []args){
        int [] array = new int [1000];
        Random r = new Random();
        Date old= new Date();

        for(int i=0;i<array.length;i++){
            array[i]= r.nextInt(100);
        }
        System.out.println(Arrays.toString(array));


        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }



        System.out.println(Arrays.toString(array));
        Date curent= new Date();
        long timer= (curent.getTime()-old.getTime());
        System.out.println("Time : "+timer);
    }

    
}
