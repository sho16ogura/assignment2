public class Assignment2{
    public boolean isAnagram(String aString, String bString){
        if(aString.length() != bString.length()){
            return false;
        }

        char[] aArr=aString.toCharArray();
        char[] bArr=bString.toCharArray();

        int count=0;
        for(int i=0; i<aArr.length; i++){
            for(int j=0; j<aArr.length; j++){
                System.out.println(aArr[i]+" "+bArr[j]);
                if(aArr[i]==bArr[j]){
                    bArr[j]='\\';
                    count++;
                    continue;
                }
            }
        }
        if(count==aArr.length)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        Assignment2 a=new Assignment2();
        System.out.println(a.isAnagram("fried","fired"));
    }
}