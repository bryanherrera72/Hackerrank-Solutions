import java.util.Scanner; 
/*
 *solution to hacker rank problem LoveLetterMystery
 *can be adjusted to print palindromes as well
*/
class LoveLetterMystery{
   Scanner in = new Scanner(System.in);
   int numCases; 
   String line,palindrome;
   int output;  
   int counter =0; 
   char[] stringArray;
   
    
   public void displaySolution(){
        numCases = in.nextInt();
        in.nextLine();
        while(counter < numCases){
            line = in.nextLine().toString();
            if(isPalindrome(line)){
               System.out.println(0);
            }
            else{
               output = stepsToGeneratePalindrome(line);
               System.out.println(output);
            }
            counter ++; 
        } 
   }
   //creates a palindrome from a string
   public int stepsToGeneratePalindrome(String thisline){
      int result = 0 , counter = 0;
      int i = 0; 
      int size = thisline.length();
      int j = size- 1;
      char[] temp;  
      char templetter; 
      if((thisline.length()==0)|| (null == thisline) || (1 == thisline.length())){}
      
      else if((thisline.length()%2 >= 0)){
      
         stringArray = createCharArray(thisline);
         if(thisline.length() % 2 == 0){
            
            while(j > i){
               if(stringArray[i] < stringArray[j]){
                  templetter = stringArray[i];
                  result+=stringArray[j] - templetter;
                  
               }
               else if(stringArray[i] > stringArray[j]){
                  templetter = stringArray[j];
                  result+= stringArray[i] - templetter;
               }
               j--;
               i++;
            }
         }
         else{
            while(!(i  == j)){
               if(stringArray[i] < stringArray[j]){
                  templetter = stringArray[i];
                  
                  result+=stringArray[j] - templetter;
               }
               else if(stringArray[i] > stringArray[j]){
                  templetter = stringArray[j];
                  
                  result+= stringArray[i] - templetter;
               }
               i++; 
               j--;
            }
         }
      }
       
     
      return result; 
   }
   //determines if a string is already a palindrome
   private boolean isPalindrome(String thisline){
      boolean result = false;
      if(null == thisline){}
      else if((reverseLine(thisline)).equals(thisline)){
         result = true;
      }
      
      return result;
   }
   //creates character array based on given string
   private char[] createCharArray(String line){
      char[] temp = new char[line.length()];
      int counter = 0; 
      while(counter < line.length()){
         temp[counter] = line.charAt(counter);
         counter ++;
      }
      return temp;
   }
   //reverses a line (used to determnine a palindrome)
   //has a helper method
   private String reverseLine(String thisline){
        String reversed = ""; 
        reversed = reverseLine(thisline,thisline.length());
        return reversed;
   }
   private String reverseLine(String thisline, int size){
      String currentstring = "",firstletter = "";
      if(thisline == null || thisline.length() == 0){
      }
      else if(thisline.length()==1){
         currentstring = thisline;
      }
      else{
         firstletter = thisline.substring(0,1);
         currentstring = reverseLine(thisline.substring(1,size), size-1) + firstletter;
      } 
      return currentstring;
   }
   
   
   
   public static void main(String[] args){
      
   }
}