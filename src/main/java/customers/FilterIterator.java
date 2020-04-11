package customers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class FilterIterator<T> implements Iterator<T> {
    private Predicate<T> predicate;
    private int position;
    private List<T> list;

    public FilterIterator(List<T> list, Predicate<T> predicate) {
        this.list = list;
        this.predicate = predicate;
        this.position = 0;
    }

    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        int temp = this.position;

        while(temp<list.size()){
            T nextElem = list.get(temp);
            if(predicate.test(nextElem)){
                return true;
            }else{
                temp++;
            }
        }
        return false;
    }

    @Override
    public T next() {
        int temp = position;
        while (temp < list.size()) {
            T nextElem = list.get(temp);
            if (predicate.test(nextElem)) {
                position = temp + 1;
                return nextElem;
            } else {
                temp++;
            }
        }
            return null;
    }

}
