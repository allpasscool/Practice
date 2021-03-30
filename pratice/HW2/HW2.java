import java.io.*; 

class HW2 {
    public static void main(String args[]) {
        int i = 5;
        int j = 0;

        if (i > 0)
            System.out.println("line 9");
        else if(i < 10)
            System.out.println("line 11");
        else
            System.out.println("line 13");
            System.out.println("line 14");
        System.out.println("line 15");

        if (true)
            System.out.println("line 18");
        else
            System.out.println("line 20");
        // else if (i < 10)
        //     System.out.println("line 22");

        if (true)
            System.out.println("line 25");
        System.out.println("line 26");
        // else if(true)
        //     System.out.println("line 28");
        // else
        //     System.out.println("line 30");

        if (!false)
            System.out.println("line 33");
        if (!true)
            System.out.println("line 35");
        else
            System.out.println("line 37");

        if (true) {
            if (!false) {
                System.out.println("line 41");

                if (!!true) {
                    System.out.println("line 44");
                }
                else {
                    System.out.println("line 47");
                }

                if (!true) 
                    System.out.println("line 51");
                else
                    System.out.println("line 53");
            }
            else
                System.out.println("line 56");
        }

        return;
    }
}