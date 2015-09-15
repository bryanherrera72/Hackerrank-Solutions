import java.util.Scanner; 

class ServiceLaneSolution{
    Scanner in = new Scanner(System.in);
    int n =0;
    int t =0;
    int center; 
    int[] width;
    public void loadValues(){
        n = in.nextInt();
        t = in.nextInt();
        width = new int[n];
         
        for(int counter =0; counter<n;counter++){
            width[counter] = in.nextInt();
        }
    }
    public void largestTransport(){
        int i=0;
        int j;
          
        int biggestSize =0 ; 
        
        for(int counter = 0; counter < t; counter ++){
            i = in.nextInt();
            j = in.nextInt();
            biggestSize = largestTransport(width,i,j);
            System.out.println(biggestSize);
        }
    }
    private static int largestTransport(int []portion, int firstindex, int lastindex){
        int currentSmallestVal = portion[firstindex],smallVal;
        int i = firstindex, j = lastindex;
        if(null == portion){}
        else if(i == j){
             currentSmallestVal = portion[i];
        }
        else{
            smallVal = largestTransport(portion, firstindex +1, lastindex);
            if(smallVal < currentSmallestVal){
                currentSmallestVal = smallVal; 
            }
        }
        return currentSmallestVal;
    }
    
    public static void main(String[] args){
        Solution currentSolution = new Solution();
        currentSolution.loadValues();
        currentSolution.largestTransport();
    }
}