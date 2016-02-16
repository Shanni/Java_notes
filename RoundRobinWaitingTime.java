import java.util.*;
class RoundRobin{
    int quant=3;
    public static void main(String[] args){
        int[] arrive={0,1,4};
        int[] execute={5,2,3};
        RoundRobin a=new RoundRobin();
       System.out.print(a.roundRobin(arrive,execute));
    }
    public double roundRobin(int[] arrive, int[] execute){
        if (arrive.length==0 || execute.length==0){
            return 0;
        }
        Queue<Integer> q=new LinkedList<Integer>();
        int exeTime=0;
        int wait=arrive[0];
        int cumTime=0;
        q.offer(0);
        int i=0;
        int j=1;
        while(!q.isEmpty()){
            i=q.poll();
            wait+=cumTime-arrive[i];
            //System.out.println("the thing has been waiting "+String.valueOf(cumTime-arrive[i]));
            int runTime=Math.min(execute[i],quant);
            cumTime+=runTime;
            execute[i]-=runTime;

            while( j<arrive.length && arrive[j]<=cumTime ){
                q.offer(j);
                j+=1;
            }
            if (0<execute[i]){
                q.offer(i);
                arrive[i]=cumTime;
            }
          
        }
        return (double)wait/arrive.length;
    }
}
