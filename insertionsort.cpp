//g++  5.4.0

#include <iostream>
using namespace std;

void insertionSort(int array[], int length ){
        
        for (int i = 1; i<length; i++){
            
               
                int key = array[i];
                int j = i -1;
            
            while ( j >= 0 && array[j] > key){
                                
                   array[j + 1 ] = array[j];
                   j--;
           }
            
                array[j+1 ] = key;
                            
        }
     
    }
    
int main()
{
            int array[] = {29, 31, 37, 41, 79, 83, 89, 43, 47, 53, 59, 61, 67, 71, 73, 2, 3, 5, 7, 11, 13, 17, 19, 23, 97};
            int length = sizeof(array)/sizeof(array[0]);      
            insertionSort(array,length);
            for (int k = 0; k< length;k++){
        
                 cout << array[k] <<endl;
        }
}
