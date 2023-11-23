import java.util.ArrayList;
import java.util.HashMap;

public class Mystery1 {

    private HashMap<String,String> S = new HashMap<String,String>();

    public Mystery1(){
        S.clear();
    };
    

    public void f1(String s1, String s2){
        if(s1 != s2){
            S.put(s1,s2);
        }
    }


    public int f2(String s){
        int i = 0;
        for (String s2 : S.values()) {
            if(s2==s){
                i++;
            }
        }
        return i;
    }


    public boolean f3(String s1, String s2){
        //use instance to prove it exists. 

        //as long X(s2,s1) in S
        //we can put s1 at L[0] and s2 at L(size-1), therefore X(L[size-1],L[0]) in S
        //therefore, if X(s2,s1) in s, contain codition mets, vise versa
        
        if(S.containsKey(s2)!=true || S.get(s2)!=s1){
            return false;
        }else{
            ArrayList<String> L = new ArrayList<>();
            String current = s1;
            L.add(s1);
            while(current!=s2){
                if(S.containsKey(current)!=true){return false;}
                L.add(S.get(current));
                current=S.get(current);
            }
            return L.get(0)==s1 && L.get(L.size()-1)==s2 && P(L);
        }
    }

    private boolean P(ArrayList<String> L){
        for(int i=1;i<L.size();i++){
            if (S.containsKey(L.get(i-1))!=true || (S.get(L.get(i-1))!= L.get(i))){
                return false;
            }
        }
        return true;
    }
}
