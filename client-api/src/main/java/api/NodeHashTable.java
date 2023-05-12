package api;

import accessors.RSNode;
import accessors.RSNodeHashTable;
import com.google.common.collect.Iterators;
import runestar.generated.XNode;
import runestar.generated.XNodeHashTable;

import java.util.*;

public abstract class NodeHashTable<K, V, N extends RSNode> extends AbstractMap<K, V> {

    private List<N> nodes;

    public NodeHashTable() {
        nodes = new ArrayList<>();
    }

    public abstract RSNodeHashTable getAccessor();

    protected abstract K wrapKey(N node);

    protected abstract long unwrapKey(K key);

    protected abstract V wrapValue(N node);

    @Override
    public V get(Object key) {
        long longKey = unwrapKey((K) key);
        RSNode bucketSentinel = getAccessor().getBuckets()[((int) longKey) & (getAccessor().getSize() - 1)];
        RSNode cur = bucketSentinel.getPrevious();
        while (cur != null && cur != bucketSentinel) {
            if (cur.getKey() == longKey) {
                return wrapValue((N) cur);
            }
            cur = cur.getPrevious();
        }
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
        return get(key) != null;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> entrySet = new HashSet<>();
        for (N node : nodes) {
            entrySet.add(new AbstractMap.SimpleEntry<>(wrapKey(node), wrapValue(node)));
        }
        return entrySet;
    }
}