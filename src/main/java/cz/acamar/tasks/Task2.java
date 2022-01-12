package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        // to store the result of computation
        int[] result = new int[input.length];
        int left_pointer = 0;
        int right_pointer = input.length - 1;
        int idx = right_pointer;

        // visiting each number in the input with left and right pointers
        while(left_pointer <= right_pointer) {
            // value of the square of number at the left pointer
            int a = input[left_pointer] * input[left_pointer];
            // value of the square of number at the right pointer
            int b = input[right_pointer] * input[right_pointer];

            // if the square value at the left is greater than that at the right
            if(a > b) {
                // add the value to the result variable
                result[idx] = a;
                // move the pointer forward
                left_pointer++;
            // if the square value at the right is greater than that at the left
            } else {
                // add the value to the result variable
                result[idx] = b;
                // move the pointer backward
                right_pointer--;
            }
            idx--;
        }
        // return the computed result
        return result;
    }
}
