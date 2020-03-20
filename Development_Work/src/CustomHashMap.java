import java.util.Map;

class CustomHashMap<K,V>{
    private int capacity = 4;
    private Entry<K,V>[] table;

    static class Entry<K,V>{
        K key;
        V value;
        Entry<K,V> next;

        Entry(K key, V value, Entry<K,V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    CustomHashMap(){
        table = new Entry[capacity];
    }
    public int hash(K key){
        return Math.abs(key.hashCode())%capacity;
    }

    public void put(K newKey, V data){
        if(newKey == null){
            return;
        }
        int hash = hash(newKey);
        Entry<K,V> newEntry = new Entry<>(newKey,data,null);
        if (newEntry == null){
            table[hash] = newEntry;
        } else{
            Entry<K,V> prev = null;
            Entry<K,V> curr = table[hash];
            while (curr!=null){
                if(curr.key.equals(newKey)){
                    if (prev == null){
                        newEntry.next = curr.next;
                        table[hash] = newEntry;
                        return;
                    } else {
                        newEntry.next = curr.next;
                        prev.next = newEntry;
                        return;
                    }
                }
                prev = curr;
                curr = curr.next;
            }
            prev.next = newEntry;
        }
    }
    public V get(K newKey){
        int hash = hash(newKey);
        if (table[hash] == null){
            return null;
        } else {
            Entry<K,V> temp = table[hash];
            while (temp!=null){
                if (temp.key.equals(newKey)){
                    return temp.value;
                }
                temp = temp.next;
            }
            return null;
        }
    }
}