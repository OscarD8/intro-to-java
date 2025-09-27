package intro_pt2.ArraysAndHashMaps.HashMap;


import java.util.ArrayList;
import java.util.List;

public class HashMapAttempt <K, V>
{
    private List<Pair<K,V>>[] values;
    private int firstFreeIndex;

    public HashMapAttempt() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue]; // creating a list of pairs to be the values at the indexes of the hashCode calculation

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }

        return null;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    private List<Pair<K,V>> getListBasedOnKey (K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }
        return values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];

        for (int i = 0; i < values.length; i++) {
            copy(newArray, i);
        }
        this.values = newArray;
    }

    private void copy(List<Pair<K,V>>[] newArray, int fromIndex) {
        // Loop through every Pair in the bucket at 'fromIndex' in the old array
        for (int i = 0; i < this.values[fromIndex].size(); i++) {
            Pair<K, V> pair = this.values[fromIndex].get(i);

            // Recalculate hash for the new array size
            int hashValue = Math.abs(pair.getKey().hashCode() % newArray.length);

            // If this bucket in the new array hasn't been initialized yet, make a new list
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }

            // Add the current key-value pair into the correct bucket in the new array
            newArray[hashValue].add(pair);
        }
    }

    public V remove(K key) {
        List<Pair<K,V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.isEmpty()) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }
        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
}
