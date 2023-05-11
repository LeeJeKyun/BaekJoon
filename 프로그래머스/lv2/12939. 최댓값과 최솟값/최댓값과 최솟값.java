import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
    public String solution(String str) {
        
        List<Integer> list = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(str);
        Iterator iter = st.asIterator();
        
        int nCount = 0;
        while(iter.hasNext()){
            nCount++;
            list.add( Integer.parseInt( (String)iter.next() ) );
        }
        
        Collections.sort(list);
        
        String answer = list.get(0) + " " + list.get(nCount-1);
        return answer;
    }
}