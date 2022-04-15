import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;


public class Basic {

    public static void main(String[] args) {

        for (int i = 0;i<10;i++)
        {
            if (i%2==0)
                continue;
            System.out.println(i);

        }

    }


}

enum Size {
    SMALL,
    MEDIUM,
    LARGE,
    EXTRA_LARGE
}