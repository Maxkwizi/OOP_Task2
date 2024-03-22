
public interface QueueBehaviour {
    void enqueue(String person);
    String dequeue();
    boolean isEmpty();
    int size();
    }