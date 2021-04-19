package novena_semana;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PruebaListaPila {
    public static void main(String[] args) {
        f(4,4);
    }

    public static void f(int n, int m){
        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i<n; i++){
            for (int j=0; j<m; j++){
                if (i + j % 2  == 0){
                    s.add(i+j);
                    q.add(s.peek());
                }
                if ( i*2 + j%3 == 0){
                    int t = q.peek();
                    q.add(s.pop());
                    s.add(t);
                    q.poll();
                }
            }
        }

        System.out.println(s.size());
        System.out.println(q.size());

    }
}
