package tarjetas;

import java.util.Scanner;

public class mainTarjetas {

    //Token: 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
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Menus m = new Menus();

        int op1;
        int op2;
        int op3;

        do {

            m.m1();

            do {
                op1 = teclado.nextInt();
            } while (op1 < 0 || op1 > 1);

            System.out.println("");

            switch (op1) {

                case 1:

                    m.m2();

                    do {
                        op2 = teclado.nextInt();
                    } while (op2 < 0 || op2 > 2);

                    System.out.println("");

                    switch (op2) {

                        case 1:

                            m.m3();

                            do {
                                op3 = teclado.nextInt();
                            } while (op3 < 0 || op3 > 3);

                            System.out.println("");

                            switch (op3) {

                                case 1:
                                    break;

                                case 2:
                                    break;

                                case 3:
                                    break;

                            }

                            break;

                        case 2:

                            break;

                    }

                    break;

            }

        } while (op1 != 0);

    }

}
