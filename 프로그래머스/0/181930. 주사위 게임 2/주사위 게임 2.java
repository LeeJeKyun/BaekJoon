import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> numbers = Stream.of(a, b, c).collect(Collectors.toSet());
        return (a + b + c)*
                (numbers.size() < 3 ?(a*a+b*b+c*c) : 1 )*
                (numbers.size() < 2 ? (a*a*a+b*b*b+c*c*c) : 1);
    }
}