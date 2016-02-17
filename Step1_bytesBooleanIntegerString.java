import java.util.*;
class A{
    public static void main(String[] args){
        A a=new A();
        a.f();
    }
   public int f(){
       StringBuilder br=new StringBuilder();
       //br.append("a");
       System.out.print(br.appendCodePoint(1));
       br.append("hello");
       br.append('e');
       System.out.print(br.capacity());
       System.out.print(br.reverse().toString());
       int q=Integer.valueOf("243"); //return Interger object
       int p=Integer.parseInt("432"); //return prime type integer
       //System.out.print(String.toString(q));
       System.out.print(String.valueOf(q));
       
       String s="shan";
       System.out.println(s.charAt(1)=='s');
       byte gg=-128; //byte could be -128~127
       if(fb(10) && fb(8)){ //if the first  fb(10) failed, fb(8) is not running...
            //for example:
            //output: runing 10
           System.out.print("new");
           System.out.print(gg);
       }
       return 1;
   }
   public boolean fb(int num){
       System.out.print("runing "+String.valueOf(num));
       return num<9;
   }
}
