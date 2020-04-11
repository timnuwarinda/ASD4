package customers;

import java.util.*;

public class AgeIterator<T> implements Iterator<T> {

    private List<T> list = new ArrayList<T>();
    private int position;
    private Comparator comparator;

    public AgeIterator(List<T> list, Comparator<T> comparator) {
        this.list = list;
        this.comparator = comparator;
        this.position = 0;
        Collections.sort(this.list,this.comparator);

    }

    public Iterator<T> iterator() {
        return this;
    }



    @Override
    public boolean hasNext() {
        return position<list.size();
    }

    @Override
    public T next() {
        return list.get(position++);
    }


}
