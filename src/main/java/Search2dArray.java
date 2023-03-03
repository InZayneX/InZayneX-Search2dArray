public class Search2dArray {
    /**
     * Receive a 2d array of ints. (That's an array of arrays!)
     * Your task is to search the array for a matching value, return true if found false otherwise.
     * You'll need to use a for loop within a for loop - each for loop handles searching in a particular dimension.
     * I recommend reasoning through this problem on pencil and paper.
     *
     * @param nums a two dimensional array - meaning, an array of arrays.
     * @param target a value that may be contained within nums.
     * @return true if nums contains target, and false otherwise.
     */
    public boolean search(int[][] nums, int target){
        // use a for loop inside a for loop as each for loop handles searching a particular dimension
        // have an int i and j
        //boolean the array nums with the two int i and j array values, to the int target 
        // to see if an arrays of array have matching values.
        //return true for yes, false for no
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target){
                    return true;
                }
            }
        }
        return false;   
 }
}
