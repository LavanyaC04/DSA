class Solution {
     List<String>validStrings= new ArrayList<>();
    public List<String> validStrings(int n) {

        generateStrings(n,"",'\0'); //pass null character which indicates no previous character up until now.
       return validStrings; 
    }
    public  void generateStrings(int n, String str, char prev)
    {
        if(n==0) // base condition is met
        {
            validStrings.add(str);
            return;
        }
        // Add '0' only if the previous character is not zero
        if(prev!='0')
        {
           generateStrings(n-1, str + "0",'0'); 
        }
       // 1 can be added always anywhere
        generateStrings(n-1, str + "1",'1');
    }
}