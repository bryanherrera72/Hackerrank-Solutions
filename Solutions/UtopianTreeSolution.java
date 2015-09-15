import java.util.*; 

 class UtopianTreeSolution{
    Scanner in = new Scanner(System.in);
    
    public void calculateSolution(){
        int numCases,loopcounter =1,cyclenumber=0,height; 
        numCases = in.nextInt();
        
        while(loopcounter<=numCases && cyclenumber<=60 && loopcounter<=10){
            cyclenumber = in.nextInt();
            height = 1; 
            for(int i = 0; i<cyclenumber;i++){
                if(0 == (i%2)){
                   height= height*2;      
                }
                else{height+=1;}
            }
            System.out.println(height);      
            loopcounter++;
            }
   } 
    
    public static void main(String[] args){
        Solution newSolution = new Solution();
        newSolution.calculateSolution();
        
    }
}