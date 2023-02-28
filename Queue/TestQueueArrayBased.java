package Queue;

public class TestQueueArrayBased {
    public static void main(String[] args) {
        QueueArrayBased<Integer> queue = new QueueArrayBased<Integer>();

        for(int i = 30; i  <=76;i++)
        queue.enqueue(i);
        System.out.println("after enqueue");
        System.out.println(queue);

        for(int i = 30; i  <=40; i++)
         int num = queue.dequeue();
        if (num %10 ==0);
        System.out.println(num);

        
        
    }
    
}
