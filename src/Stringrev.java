/**
 * Created by vlad on 20.04.17.
 */
import java.io.StringReader;
import java.util.Scanner;

public class Stringrev {

    public static void main(String[] args) {
        Scanner rom = new Scanner(System.in);
        Stringrev rev = new Stringrev();
        String name = rom.nextLine();
        rev.reversing(name);

    }











    public void reversing(String name) {

        char[] chars = name.toCharArray();

        char[] revers = new char[chars.length];
        int j = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            revers[j] = chars[i];
            j++;
        }

        System.out.println(revers);
    }

}
