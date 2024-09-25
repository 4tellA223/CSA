class StringTools {

    public StringTools(){

    }

    public String lastLetter(String str) {
        String result = str.substring(str.length()-1);
        return result;
    }
    
    public String formatPhoneNumber(String str1){
        String s1 = "(" + str1.substring(0,3)+ ")";
        String s2 = " "+str1.substring(3,6)+"-";
        String s3 = str1.substring(6);
        return s1+s2+s3;
    }
    public String middleThree(String str){
        int mid = str.length()/2 -1;
        String result = str.substring(mid,mid+3);
        return result;
    }
    public String swapLastTwo (String str){
        String s1= str.substring(str.length()-2);
        String s2= str.substring(str.length()-1);
        String str1 = str.substring(0,str.indexOsf(s1));
        return str1 +s2+s1;
    
    }
    public boolean frontAgain (String str, int n){
     boolean result;
     String s1 = str.substring(0,n);
     String s2 = str.substring(str.length()-n);
     result = s1.equals(s2);
     return result;    
    }


}
