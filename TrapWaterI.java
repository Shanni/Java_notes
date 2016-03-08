
import java.util.LinkedList;
import java.util.List;

public class TrapWater {   
    public static int answer(int[] heights) { 
        if(heights.length<2){
            return 0;
        }
        boolean ispeak=true;
        LinkedList<Integer> peaks=new LinkedList<>();
       for(int i=0;i<heights.length-1;i++){
           if(heights[i]<heights[i+1]){
               ispeak=true;
           }else if(heights[i]>heights[i+1]){
               if(ispeak){
                   peaks.add(i);
                   ispeak=false;
               }
           }
       }
       if(heights[heights.length-2]<heights[heights.length-1]){
           peaks.add(heights.length-1);
       }
       if (peaks.size()<2)
            return 0;
       int peak=peaks.poll();
       int water=0;
       while(!peaks.isEmpty()){
           int nextpeak=peaks.poll();
           int waterlevel=Math.min(heights[peak], heights[nextpeak]);
           System.out.print("\nMax height: "+heights[nextpeak]);
           for(int i=peak+1;i<nextpeak;i++){
               water+=waterlevel>heights[i]?waterlevel-heights[i]:0;
               System.out.print(" "+water);
           }
           peak=nextpeak;
       }
       return water;
     
    } 
    public static void main(String[] args){
    	int water=answer(new int[]{12,7,8,7,2,4,0,8});
    	System.out.print("\n Contain water: "+water);
    }
}
