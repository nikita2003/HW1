
import java.util.Arrays;

public class Assignment01Q04 {
    private static void reverse(int[] array, int start, int end) {
        while (start < end) { 
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (direction != 'R' && direction != 'L') {
            return array;
        }

        if (move == 0) {
            return array;
        }

        if (move < 0) {
            move = -move;
            direction = (direction == 'R') ? 'L' : 'R';
        }

        int n = array.length;
        if (n > 0) {
            move = move % n;
        }

        if (direction == 'L') {
            move = n - move;
        }

        reverse(array, 0, n   - 1);
        reverse(array, 0, move - 1);
        reverse(array, move, n - 1);

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}
