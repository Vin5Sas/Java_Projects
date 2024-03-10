/*Binary Search Program
 * Time Complexity is O(log n)
 */

public class BinarySearch {
    
    public static int binarySearch(int[] arr, int start, int end, int target)
    {
        int mid = (int)(Math.floor( (start+end) / 2 ));                         //calculate mid index value of the incoming array
        
        if(start > end)                                                         //base condition check, if start index is greater than the end index of the array, it means that the target value was not found in the array
            return -1;
        
        if(arr[mid]==target)                                                    //if the value at index 'mid' of the array equals the target value searched for, return the 'mid' index
            return mid;
        
        if(arr[mid]> target)                                                    //if the value at index 'mid' of the array is greater than the target, then we halve the array with 'mid-1' as the end index of array in the new recursive call 
            return binarySearch(arr, start, mid-1, target);
        else
            return binarySearch(arr, mid+1, end, target);                       //else then we consider the right half of the array for further search and pass 'm+1' as start index of the array for the next recursive call
        //return mid;
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Let's do some Binary Search");

        int arr[] = {1,2,3,4,5,6,7,8};
        int end = arr.length - 1;
        int target = 7;

        long startTime = System.nanoTime()/1000000;
        System.out.println("Program Start Time: " + startTime + " ms");

        int resultIndex = binarySearch(arr, 0, end, target);
        if(resultIndex > 0)
            System.out.println("The target value " + target + " was found at index " + resultIndex);
        else
            System.out.println("The target value " + target + " was not found in the array!");
        
        long progEndTime = System.nanoTime()/1000000; 
        System.out.println("Program End Time: " + progEndTime + " ms");
        System.out.println("Execution Time: " + (progEndTime-startTime) + " ms");
    }
}
