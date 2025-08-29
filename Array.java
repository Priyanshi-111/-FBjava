import java.util.Arrays;
public class Array {
    public static void main(String[] args){


        /*   Syntax



         * datatype[] arrayname = new datatype[size];
         
         */

    
            int arr[]= {1,2,3,4,5};
        
            System.out.println("Original :" + Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("Sorted :"+ Arrays.toString(arr));
            Arrays.fill(arr,5);
            System.out.println("Filled :"  + Arrays.toString(arr));
            Arrays.copyOf(arr,3);
            System.out.println("Copied :" + Arrays.toString(arr));
            


        
            
    }
    
}
