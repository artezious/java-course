package recursia;

import static recursia.Factorial.usingRecurcia;

/**
 * Created by WEO on 8/19/16.
 */
public class Factorial {

    private static final int FACTORIAL_DEFAULT_VAL = 5 ;

    public static void main(String[] args) {
        usingFor();
        System.out.println(usingRecurcia(FACTORIAL_DEFAULT_VAL));
    }

    private static void usingFor() {
        int f = 1;
        for (int i=2; i<=FACTORIAL_DEFAULT_VAL; i++) {
            f *=i; // равносильно записи f = f * i;
        }
        System.out.println(f);
    }

    public static int usingRecurcia(int fact) {

        if (fact == 1) return 1;
        return fact*usingRecurcia(--fact);

    }

}

