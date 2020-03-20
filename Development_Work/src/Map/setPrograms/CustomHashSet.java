package Map.setPrograms;

public class CustomHashSet<T> {

    private int size;
    private int capacity = 4;
    private Entry<T>[] table;

    static class Entry<T>{
        T key;
        Entry<T> next;
        Entry(T key){
            this.key = key;
            this.next = null;
        }
    }

    CustomHashSet(){
        table = new Entry[capacity];
    }

    public int hash(T key){
        return Math.abs(key.hashCode())%capacity;
    }

    public void add(T newKey){
        int hash = hash(newKey);
        Entry<T> curr = table[hash];
        Entry<T> newEntry = new Entry<>(newKey);
        if(curr == null){
            table[hash] = newEntry;
            size++;
            return;
        }
        while (curr.next!=null){
            if (curr.key.equals(newKey)){
                return;
            }
            curr = curr.next;
        }
        if(!curr.key.equals(newKey)){
            curr.next = newEntry;
            size++;
        }
    }
}
