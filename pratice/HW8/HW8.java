public class HW8 {
    public static void main(String args[]) {
        int i = 1;

        rec1(i);
        
        return;
    }

    // i = 1
    private static void rec1(int i) {
        if (i == 5)
            return;

        System.out.println("rec1 A: " + i);
        rec1(i + 1);
        // rec2(i + 1);
        System.out.println("rec1 B: " + i);
    }

    // // i = 2
    // private static void rec1(int i) {
    //     if (i == 5)
    //         return;

    //     System.out.println("rec1 A: " + i);
    //     rec1(i + 1);
    //     // rec2(i + 1);
    //     System.out.println("rec1 B: " + i);
    // }

    // // i = 3
    // private static void rec1(int i) {
    //     if (i == 5)
    //         return;

    //     System.out.println("rec1 A: " + i);
    //     rec1(i + 1);
    //     // rec2(i + 1);
    //     System.out.println("rec1 B: " + i);
    // }

    // // i = 4
    // private static void rec1(int i) {
    //     if (i == 5)
    //         return;

    //     System.out.println("rec1 A: " + i);
    //     rec1(i + 1);
    //     // rec2(i + 1);
    //     System.out.println("rec1 B: " + i);
    // }

    // // i = 5
    // private static void rec1(int i) {
    //     if (i == 5)
    //         return;

    //     System.out.println("rec1 A: " + i);
    //     rec1(i + 1);
    //     // rec2(i + 1);
    //     System.out.println("rec1 B: " + i);
    // }

    private static void rec2(int i) {
        if (i == 5)
            return;

        System.out.println("rec2 A: " + i);
        rec3(i + 1);
        System.out.println("rec2 B: " + i);
    }

    private static void rec3(int i) {
        if (i == 5)
            return;

        System.out.println("rec3 A: " + i);
        rec4(i + 1);
        System.out.println("rec3 B: " + i);
    }

    private static void rec4(int i) {
        if (i == 5)
            return;

        System.out.println("rec4 A: " + i);
        rec5(i + 1);
        System.out.println("rec4 B: " + i);
    }

    private static void rec5(int i) {
        if (i == 5)
            return;

        System.out.println("rec5 A: " + i);
        rec5(i + 1);
        System.out.println("rec5 B: " + i);
    }
}
