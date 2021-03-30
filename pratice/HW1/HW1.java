import java.io.*; 

// variable scope
class HW1 {
    
    static int var3 = 6;

    public static void main(String args[]) {
        int var = 9;

        System.out.println("Line 11: " + var);

        {
            int  var = 14;
            System.out.println("Line 15: " + var);

            {
                System.out.println("Line 18: " + var);
            }

            {
                int var = 22; 
                System.out.println("Line 23: " + var);

                int var2 = 25;
                System.out.println("Line 26: " + var2);
                var = 27;
            }
            System.out.println("Line 30: " + var2);

            System.out.println("Line 31: " + var);
        }

        lineA(var);
        System.out.println("Line 35: " + var);

        lineC();
        System.out.println("Line 38: " + var);

        for (int var = 40; var < 42; var++)
            System.out.println("Line 41: " + var);

        for (var = 43; var < 45; var++)
            System.out.println("Line 44: " + var);

        for (int var4 = 46; var4 < 48; var4++)
            System.out.println("Line 47: " + var4);

        System.out.println("Line 49: " + var4);

        HW1 ob1 = new HW1();
        ob1.var3++;
        System.out.println("Line 53: " + ob1.var3);
        HW1 ob2 = new HW1();
        ob2.var3++;
        System.out.println("Line 56: " + ob2.var3);
        System.out.println("Line 57: " + var3);
        System.out.println("Line 58: " + ob1.var3);

        return;
    }

    static void lineA(int var) {
        System.out.println("Line 64: " + var);
        var -= 1;
        System.out.println("Line 66: " + var);
    }

    static void lineC() {
        System.out.println("Line 70: " + var);
        var -= 1;
        System.out.println("Line 72: " + var);
    }


    private int var = 76;
}