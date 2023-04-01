public class Assignment2{
    public boolean isAnagram(String aString, String bString){
        if(aString.length() != bString.length()){
            return false;
        }

        char[] aArr=aString.toCharArray();
        char[] bArr=bString.toCharArray();

        for(int i=0; i<aArr.length; i++){
            for(int j=0; j<aArr.length; j++){
                if(aArr[i]==bArr[j]){
                    bArr[j]='\\';
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isAnagram("fried","fired"));
    }
}