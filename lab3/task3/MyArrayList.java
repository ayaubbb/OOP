package lab3.task3;
import java.util.Iterator;

public class MyArrayList<E> implements MyCollection<E> {
	private E[] elements;
    private int size = 0;
    
	public MyArrayList() {
		// TODO Auto-generated constructor stub
		elements = (E[]) new Object[(10)];
	}

	@Override
	public boolean add(E element) {
		// TODO Auto-generated method stub
		if(size == elements.length) {
			return false;
		}
		elements[size++] = element;
		return true;
	}

	@Override
	public boolean remove(E element) {
		// TODO Auto-generated method stub
		for(int i = 0; i< size; i++) {
			if (elements[i].equals(element)) {
				for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
				size--;
				elements[size] = null;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contains(E element) {
		// TODO Auto-generated method stub
		for(int i = 0; i < size; i++) {
			if (elements[i].equals(element)) return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		size = 0;//д
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<E>() {
            private int cursor = 0;
            public boolean hasNext() {
                return cursor < size;
            }
            public E next() {
            	E element = elements[cursor];
                cursor++;
                return element;
            }
		};
	}
}
