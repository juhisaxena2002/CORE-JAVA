import java.util.Arrays;

public class validshuffle {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "abc";
        String s3 = "aaabbc";
        Boolean ans = valid_shuff(s1, s2, s3);
        System.out.println(ans);
    }
    public static boolean valid_shuff(String s1, String s2, String res){
        int n = s1.length();
        int m = s2.length();
        int p = res.length();
        if(n+m != p) return false;
        s1 = sort(s1);
        s2 = sort(s2);
        res = sort(res);
        int i=0,j=0,k=0;
        while(k<p){
            if(i<n && s1.charAt(i) == res.charAt(k)) i++;
            else if(j<m && s2.charAt(j) == res.charAt(k)) j++;
            else
            return false;
            k++;}
            return i>=n && j>=m;}
               
            
        
    
    public static String sort(String ss) {
        char ch[] = ss.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
     }
    }


