import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        // 1. 몸무게순으로 오름차순 정렬
        Arrays.sort(people);
        
        // 2. 가장 가벼운 사람과 무거운 사람을 가리키는 인덱스 설정
        int left = 0;
        int right = people.length - 1;
        
        // 3. 양 끝에서 좁혀오며 보트 태우기
        while (left <= right) {
            // 가장 무거운 사람 + 가장 가벼운 사람의 합이 limit 이하인지 확인
            if (people[left] + people[right] <= limit) {
                // 두 명 탑승 가능 시 가벼운 사람 인덱스 증가
                left++;
            }
            
            // 무거운 사람은 같이 타든 혼자 타든 보트 하나를 소모함
            right--;
            
            // 보트 개수 증가
            answer++;
        }
        
        return answer;
    }
}