import java.io.*; 

class HW3 {
    public static void main(String args[]) {
        int i = 1;
        int j = 0;

        System.out.println("Section 1");

        while (i < 10) {
            j = 0;

            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n Section 2");

        i = 10;
        while (i > 0) {
            j = 0;

            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

        for (int a = 10; a > 0; a--) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n Section 3");
        i = 12;
        while (i > 0) {
            j = 0;
            
            while (j < (12 - i) / 2) {
                System.out.print(" ");
                j++;
            }
            while (j + (12 - i) / 2 < 12) {
                System.out.print("*");
                j++;
            }
            while (j < 12) {
                System.out.print(" ");
                j++;
            }
            System.out.println();

            i -= 2;
        }

        // to do 
        // for loop

        System.out.println("\n Section 4");
        // to do
        // reverse section 3


        System.out.println("\n Section 5");
        // to do
        // diamond shape

        System.out.println("\n Section 6");
        // demonstrate do while
        // i = 0 ;
        // do {
        //     System.out.println("line do while: " + i);
        // } while (i > 0);

        return;
    }
}