String losslessDataCompression(String inputString, int width) {
    String compressed="";
    String window="";
 
    for(int i=0; i< inputString.length();i++){
        // System.out.println(i);
        window=inputString.substring(Math.max(0, i-width), i);
        int index=-1;
        for(int j=Math.min(i+width, inputString.length()-1); j>i;j--){
            index=window.indexOf(inputString.substring(i,j));
            if(index>-1){
               
                int count=0;
                System.out.print(inputString.charAt(i+count));
                System.out.print(window.charAt(index+count));
                while(i+count< inputString.length() && index+count< window.length()&&inputString.charAt(i+count)==window.charAt(index+count)){
                    count++;
                   
                }
               
               
                index+=Math.max(0, i-width);
                compressed+="("+index+","+count+")";
                i=i+count-1;
                
                break;
            }
        }
        if(index<0){
            compressed+=inputString.charAt(i);
        }
        
    }
    return compressed;
}
