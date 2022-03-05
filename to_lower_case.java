class Solution {
    public String toLowerCase(String s) {
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            int num=(int)s.charAt(i);
            if(num>=65 && num<=90)
                arr[i]=(char)(num+32);
            else arr[i]=(char)num;
            
        }
        return new String(arr);
    }
}