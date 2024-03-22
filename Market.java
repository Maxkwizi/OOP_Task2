
import java.util.ArrayList;
import java.util.List;

class Market implements QueueBehaviour, MarketBehaviour {
    private 
    List<String> queue;

public Market() {
    this.queue = new ArrayList<>();
}

@Override
public void enqueue(String person) {
    queue.add(person);
    System.out.println(person + " Встал в очередь.");
}

@Override
public String dequeue() {
    if (!queue.isEmpty()) {
        String person = queue.remove(0);
        System.out.println(person + " Ушёл из очереди.");
        return person;
    } else {
        System.out.println("Очередь пуста.");
        return null;
    }
}

@Override
public boolean isEmpty() {
    return queue.isEmpty();
}

@Override
public int size() {
    return queue.size();
}

@Override
public void addPersonToQueue(String person) {
    enqueue(person);
}

@Override
public void removePersonFromQueue() {
    dequeue();
}
}