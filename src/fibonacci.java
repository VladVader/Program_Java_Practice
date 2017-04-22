/**
 * Created by vlad on 20.04.17.
 */
public class fibonacci {
    public static void main (String[] args){
        fibonacci fib = new fibonacci();
        System.out.println(fib.fibonacci1(10));

    }


    public int fibonacci1(int number){
        if (number == 0) return 0;
        if (number ==1) return 1;
        else return fibonacci1(number-1)+fibonacci1(number-2);
    }
}
