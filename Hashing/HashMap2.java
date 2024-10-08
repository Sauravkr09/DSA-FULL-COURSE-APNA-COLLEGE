import java.util.LinkedList;

public class HashMap2 {
    private class Node {
        int key, value;
        Node(int key, int value) { this.key = key; this.value = value; }
    }

    @SuppressWarnings("unchecked")
    private LinkedList<Node>[] buckets = new LinkedList[4];
    private int size = 0;

    public HashMap2() {
        for (int i = 0; i < buckets.length; i++) buckets[i] = new LinkedList<>();
    }

    private int hashFunction(int key) {
        return Math.abs(key) % buckets.length;
    }

    public void put(int key, int value) {
        int bi = hashFunction(key), di = getIndex(key, bi);
        if (di != -1) buckets[bi].get(di).value = value;
        else { buckets[bi].add(new Node(key, value)); size++; }
        if (size > buckets.length * 2) rehash();
    }

    private int getIndex(int key, int bi) {
        for (int i = 0; i < buckets[bi].size(); i++) 
            if (buckets[bi].get(i).key == key) return i;
        return -1;
    }

    public Integer get(int key) {
        int bi = hashFunction(key), di = getIndex(key, bi);
        return di != -1 ? buckets[bi].get(di).value : null;
    }

    public void remove(int key) {
        int bi = hashFunction(key), di = getIndex(key, bi);
        if (di != -1) { buckets[bi].remove(di); size--; }
    }

    @SuppressWarnings("unchecked")
    private void rehash() {
        LinkedList<Node>[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length * 2];
        for (int i = 0; i < buckets.length; i++) buckets[i] = new LinkedList<>();
        size = 0;
        for (LinkedList<Node> ll : oldBuckets)
            for (Node node : ll) put(node.key, node.value);
    }

    public static void main(String[] args) {
        HashMap2 map = new HashMap2();
        map.put(1, 10); map.put(2, 20); map.put(3, 30);
        System.out.println(map.get(3)); // 30
    }
}
