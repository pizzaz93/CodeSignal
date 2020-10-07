/* Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.*/

int adjacentElementsProduct(int[] inputArray) {
int sum  = 0;
int result = 0;
int i = 0;
for (int j: inputArray){
    if (i < inputArray.length-1){
   
   
        result = j * inputArray[i+1];
        if (result > sum || sum == 0) {
            sum = result;
        }
        i++;
    }
}
return sum;
}
