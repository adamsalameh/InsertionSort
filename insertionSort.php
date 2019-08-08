<?php //php 7.0.8
 
// To effect the orginal array pass it by reference &$array       
function insertionSort($array)
{
    for ($i = 1; $i < count($array); $i++) {
        $key = $array[$i];
        $j = $i - 1;     
        while ($j >= 0 && $array[$j] > $key) {
            $array[$j + 1] = $array[$j];
            $j--;
        }         
        $array[$j + 1] = $key;
    }
    return $array;    
}

//                0  1    2   3   4   5   6   7   8   9  10  11  12  13  14  15 16 17 18 19  20  21  22  23  24
$numbers = array(29, 31, 37, 41, 79, 83, 89, 43, 47, 53, 59, 61, 67, 71, 73, 2, 3, 5, 7, 11, 13, 17, 19, 23, 97); 
      
print_r($numbers);
echo "The array after the insertion sort\n";
print_r(insertionSort($numbers)); 
    
?>
