/*Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true. */


boolean checkPalindrome(String inputString) {

StringBuilder sb = new StringBuilder(inputString);  

sb.reverse();  

String reversed = sb.toString();  

if (reversed.equals(inputString)) {
 
     return true;     

}

return false;

}
