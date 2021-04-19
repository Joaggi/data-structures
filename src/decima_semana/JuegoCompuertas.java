package decima_semana;

import java.util.*;

public class JuegoCompuertas {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        // entrada de una cadena
        int numberOfIterations = sc.nextInt();
        int[] results = new int[numberOfIterations];
        for(int i=0; i<numberOfIterations; i++){
            int sizeOfTree = sc.nextInt();
            int numberOfExperiments = sc.nextInt();

            Node head = createTree(sizeOfTree+1, true);

            enumerateTree(head);

            results[i] = runExperiments(head, numberOfExperiments);
        }

        for (int i = 0; i < results.length-1; i++) {
            System.out.println("Test #" + (i+1) + ": " + results[i]);
        }
        System.out.print("Test #" + (results.length) + ": " + results[(results.length - 1)]);

    }

    private static int runExperiments(Node head, int numberOfExperiments) {
        int result = 0;
        for(int j = 0; j < numberOfExperiments; j++){
            Node currentPointer = head.copy();

            while(currentPointer.left != null && currentPointer.right != null) {
                if (currentPointer.left.open) {
                    currentPointer.left.open = false;
                    currentPointer.right.open = true;
                    currentPointer = currentPointer.left;
                }
                else{
                    currentPointer.left.open = true;
                    currentPointer.right.open = false;
                    currentPointer = currentPointer.right;
                }
            }
            result = currentPointer.number;
        }
        return result;
    }

    public static Node createTree(int height, boolean open){
        if(height > 0){
            Node node = new Node();
            node.open = open;
            node.left = createTree(height-1, true);
            node.right = createTree(height-1, false);
            return node;
        }
        return null;
    }

    public static void enumerateTree(Node head){
        Queue<Node> queue = new ArrayDeque<>();
        int number = 1;
        queue.add(head);
        while(!queue.isEmpty()){
            Node auxNode = queue.remove();
            auxNode.number = number;
            number++;
            if(auxNode.left != null)
                queue.add(auxNode.left);
            if(auxNode.right != null)
                queue.add(auxNode.right);
            //System.out.println(number);
        }
    }


    public static class Node{
        Node left;
        Node right;
        int number;
        boolean open;

        Node copy(){
            Node node = new Node();
            node.left = this.left;
            node.right = this.right;
            node.open = this.open;
            node.number = this.number;
            return node;
        }
    }



}


/*
7
2 3
2 1
3 2
4 2
8 10
12 15
20 100
 */

/*
2
9 10
15 25
 */

/*
2
15 21
16 52
 */