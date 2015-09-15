import java.util.Scanner;

class GemstonesSolution{
    private Scanner in; 
    private int numcases; 
    private String firstline; 
    private String secondline;
    private String nextline; 
    
    public Solution(){
        in = new Scanner(System.in);
        numcases = in.nextInt();
        in.nextLine();
        firstline = in.nextLine();
        if((!(1 == numcases)) && !(null == firstline)){
           secondline = in.nextLine();
           System.out.println(totalElements());
           
        }
        else{System.out.println(firstline.length());}
    }
    
    private int totalElements(){
        int counter = 1; 
        String templateline = "";
        int templength = 0; 
        //create the template string
         for(int i = 0; i < firstline.length(); i ++){
               if(secondline.contains(String.valueOf(firstline.charAt(i))) && 
                 !(templateline.contains(String.valueOf(firstline.charAt(i))))){
                  
                   templateline +=  String.valueOf(firstline.charAt(i));
               }
         }
        
        //compare the rest of the list to the template
        counter++; 
        while(counter < numcases){
            nextline = in.nextLine();
            
            for(int i = 0; i <templateline.length();i++ ){
                   
                if(!(nextline.contains(String.valueOf(templateline.charAt(i))))){
                    
                    templateline = templateline.replace((String.valueOf(templateline.charAt(i))),"");
                    i-=1;
                }
                
            }
            counter ++;  
        }
        return templateline.length(); 
    }
    
    public static void main(String[] args){
        Solution currentSolution = new Solution(); 
        
    }
}