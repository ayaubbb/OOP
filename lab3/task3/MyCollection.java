package lab3.task3;
import java.util.Iterator;

interface MyCollection<E> {
    boolean add(E element);
    boolean remove(E element);
    boolean contains(E element);
    int size();
    boolean isEmpty();
    void clear();
    Iterator<E> iterator();
}