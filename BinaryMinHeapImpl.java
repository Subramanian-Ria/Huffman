import scala.Int;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @param <V>   {@inheritDoc}
 * @param <Key> {@inheritDoc}
 */
public class BinaryMinHeapImpl<Key extends Comparable<Key>, V> implements BinaryMinHeap<Key, V> {
    /**
     * {@inheritDoc}
     */

    private HashMap<Integer, V> heap;
    private ArrayList<Key> indices;
    private Integer minIndex;
    private Key minKey;

    public BinaryMinHeapImpl() {
        heap = new HashMap<>();
        indices = new ArrayList<>();
        minIndex = -1;
        minKey = null;
    }

    private Integer getParent(Integer index) {
        if (index == 0) {
            return null;
        }
        return (int)(Math.floor(index/2));
    }

    private Integer getLChild(Integer index) {
        //TODO: check null return
        if (index >= heap.size()/2) {
            return null;
        }
        return 2*index;
    }

    private Integer getRChild(Integer index) {
        //TODO: check null return
        if (index >= heap.size()/2) {
            return null;
        }
        return 2*index + 1;
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean containsValue(V value) {
        //TODO: contains value is O(n)? piazza
        return heap.containsValue(value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(Key key, V value) {
        //TODO: implement
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void decreaseKey(V value, Key newKey) {
        //TODO: implement
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Entry<Key, V> peek() {
        return new Entry(minKey, heap.get(minKey));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Entry<Key, V> extractMin() {
        //TODO: implement
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<V> values() {
        return (Set<V>) heap.values();
    }
}