package customers;

import java.util.Iterator;
import java.util.List;

public class OddFilter<T> implements Iterator<T> {
    private List<T> list;
    private int position;

    public OddFilter(List<T> list, int position) {
        this.list = list;
        this.position = position;
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
        T elem = list.get(position);
        position = position+2;
        return elem;
    }
}
