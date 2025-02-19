import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new PriorityQueue<>(new AbsoluteComparator());

        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int input = sc.nextInt();
            if(input == 0) {
                Integer result = queue.poll();
                if(result == null) {
                    System.out.println(0);
                } else {
                    System.out.println(result);
                }
            } else {
                queue.add(input);
            }
        }

    }
}

class AbsoluteComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //절댓값생성
        int o1a = 0;
        if(o1 < 0) o1a = -o1;
        else o1a = o1;
        int o2a = 0;
        if(o2 < 0) o2a = -o2;
        else o2a = o2;

        //o1a와 o2a가 같지 않다면
        if(o1a != o2a) return o1a - o2a;
        else return o1 - o2;
    }
}
