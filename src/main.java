import java.util.*;

public class main{
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args){
        String s1=scan.next(),s2=scan.next();
        int cnt=0;
        for(int i=0;i<s1.length();i++){
            int x=s1.length();
            s1.replaceFirst(s2,"");
            int y=s1.length();
            if(x!=y)cnt++;
        }
        System.out.println(cnt);
    }
}

