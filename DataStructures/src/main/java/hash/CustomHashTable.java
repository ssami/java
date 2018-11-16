package hash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomHashTable<T> {

    List<LinkedList<HashEntry<T>>> values = new ArrayList<LinkedList<HashEntry<T>>>();
    final IHashFunction hashFunction;

    CustomHashTable(IHashFunction hashFunction){
        this.hashFunction = hashFunction;
        // init values 100
        for (int i=0; i<100; i++){
            values.add(null);
        }
    }

    public T get(String key) {
        int index = hashFunction.hashCode(key);
        LinkedList<HashEntry<T>> possibleValues = values.get(index);
        if (null == possibleValues) {
            return null;
        }
        else if (possibleValues.size() == 1){
            return possibleValues.get(0).getValue();
        }
        else {
            for (HashEntry<T> e : possibleValues){
                if (e.getKey().equals(key)) {
                    return e.getValue();
                }
            }
        }
        throw new IllegalArgumentException("Could not find value for this key!");
    }

    public void put(String key, T value){
        int index = hashFunction.hashCode(key);
        if (null == values.get(index)) {
            LinkedList<HashEntry<T>> llist = new LinkedList<HashEntry<T>>();
            llist.add(new HashEntry<T>(key, value));
            values.add(index, llist);
        }
        else {
            LinkedList<HashEntry<T>> llist = values.get(index);
            llist.add(new HashEntry<T>(key, value));
        }
    }

}
