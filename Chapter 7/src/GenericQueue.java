import java.util.*;

public class GenericQueue<E>{

    private LinkedList<E> list = new LinkedList<>();

    public E peek() {
        return list.get(getSize() - 1);
    }

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }}
