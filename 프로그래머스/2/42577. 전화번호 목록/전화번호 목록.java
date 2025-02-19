import java.util.HashMap;
import java.util.Map;

class Solution {
public boolean solution(String[] phone_book) {

        Map<String, Integer> map = new HashMap<>();

        for(String phone : phone_book) {
            map.put(phone, 0);
        }

        for(int i=0; i< phone_book.length; i++) {
            String phone = phone_book[i];
            for(int j=0; j<phone.length(); j++) {
                if(map.containsKey(phone.substring(0, j))) return false;
            }
        }

        return true;
    }
}