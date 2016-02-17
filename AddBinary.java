public class Solution {
    public String addBinary(String a, String b) {
        int la=a.length(), lb=b.length();
        StringBuilder br =new StringBuilder();
        int i=0;
        int l=Math.min(la,lb);
        int carry=0;
        while (i<l){
            if(a.charAt(la-1-i)=='0'&&b.charAt(lb-1-i)=='0'){
                if(carry==0){
                    br.append('0');
                }else{
                    br.append('1');
                    carry=0;
                }
                
            }
            else if (a.charAt(la-1-i)=='1'&&b.charAt(lb-1-i)=='1'){
                if(carry==0){
                    carry=1;
                    br.append('0');
                }else{
                    br.append('1');
                }
                
            }
                
            else {
                if(carry==0){
                    br.append('1');
                }else{
                    br.append('0');
                }
              
            }
            i++;
        }
        while(i<la){
            
            if(a.charAt(la-1-i)=='1'){
                 if(carry==0){
                     br.append('1');
                 }else{
                     carry=1;
                     br.append('0');
                 } 
            }
            else{
                if(carry==0){
                    br.append("0");
                }else{
                    carry=0;
                    br.append('1');
                }
            }
            i++;
        }
        while(i<lb){
            if(b.charAt(lb-1-i)=='1'){
                 if(carry==0){
                     br.append('1');
                 }else{
                     carry=1;
                     br.append('0');
                 } 
            }
            else{
                if(carry==0){
                    br.append("0");
                }else{
                    carry=0;
                    br.append('1');
                }
            }
            i++;
        }
        if(carry==1)
            br.append("1");
        return br.reverse().toString();
    }
    
}
