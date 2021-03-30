import java.io.*;
import java.util.ArrayList; 

class HW4 {
    static ArrayList ans = new ArrayList<>();
    public static void main(String args[]) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int sum = 0;
        // vector?

        // goal, find sum of 5 numbers = 20
        recursion(array, 0, sum);
        System.out.println(ans);
        return;
    }

    static boolean recursion(int[] array, int index, int sum) {
        // find ans
        if (sum == 20 && ans.size() == 5) {
            return true;
        }
        else if (ans.size() == 5) {
            return false;
        }

        while (index < array.length) {
            // pick number
            System.out.println("pick number " + array[index]);
            ans.add(array[index]);
            System.out.println(ans);
            
            boolean ans_found = recursion(array, index + 1, sum + array[index]);
            if (ans_found)
                return ans_found;

            System.out.println("remove number " + array[index]);
            ans.remove(ans.size()-1);
            System.out.println(ans);

            index++;
        }

        return false;
    }
}