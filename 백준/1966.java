import java.util.*;

class Document {
    int index;
    int priority;

    public Document(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            int[] priorities = new int[n];

            for (int j = 0; j < n; j++) {
                priorities[j] = sc.nextInt(); 
            }

            int result = findPrintOrder(priorities, m);
            System.out.println(result);
        }

        sc.close();
    }

    public static int findPrintOrder(int[] priorities, int m) {
        int order = 0; 
        Queue<Document> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Document(i, priorities[i])); 
        }

        while (!queue.isEmpty()) {
            Document currentDoc = queue.poll();
            boolean canPrint = true;

            for (Document doc : queue) {
                if (doc.priority > currentDoc.priority) {
                    canPrint = false;
                    break;
                }
            }

            if (canPrint) {
                order++;
                if (currentDoc.index == m) {
                    return order; 
                }
            } else {
                queue.add(currentDoc); 
            }
        }

        return order;
    }
}
