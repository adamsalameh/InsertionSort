//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

class Rextester
{  
    public static int[] insertionSort (int[] array){
        
        for (int i = 1; i<array.length; i++){
                        
                int key = array[i];
                int j = i -1;
            
            while ( j >= 0 && array[j] > key){
                                
                   array[j + 1 ] = array[j];
                   j--;
           }
            
                array[j+1 ] = key;                       
        }
     return array;
    }
   /*   public static int[] insertionSort (int[] array){
        
        for (int i = 1; i<array.length; i++){
            
            int key = array[i];
            
            int j = i -1;
            
            for(; j >= 0 && array[j] > key; j--){
                
                array[j + 1 ] = array[j];
              
            }
                 array[j+1 ] = key;  
                            
            }  
         return array;
    }   */
    
    public static void main(String args[])
    {
       
        int[] array = {29, 31, 37, 41, 79, 83, 89, 43, 47, 53, 59, 61, 67, 71, 73, 2, 3, 5, 7, 11, 13, 17, 19, 23, 97};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
