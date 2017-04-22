/**
 * Created by vlad on 20.04.17.
 */
public class factorial {
    public static void main(String[] args) {


      factorial rom = new factorial();
        System.out.println(rom.factorial1(10));
        System.out.println(rom.factorial2(10));



    }


    public int factorial1(int number) {
        int sum = 1;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                sum *= i;
            }
            return sum;
        } else return 0;

    }


    public int factorial2(int number){
        if (number==0) return 1;
        else return number*factorial2(number-1);

    }

}
