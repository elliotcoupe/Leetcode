package week.four;

import java.util.HashMap;
import java.util.LinkedList;

// remove is not o(N) solution

public class LRUCache {
    public static void main(String[] args){
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));// 1
        cache.put(3, 3);
        System.out.println(cache.get(2)); // -1
        cache.put(4, 4);
        System.out.println(cache.get(1)); //-1
        System.out.println(cache.get(3)); // 3
        System.out.println(cache.get(4)); // 4

    }
    int capacity;
    Node head, tail;
    HashMap<Integer, Node> map;

    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        head = tail = null;
    }

    public int get(int key){
        if(!map.containsKey(key)) {
            return -1;
        }else{
            Node ref = map.get(key);
            if(ref == head && ref != tail) {
                ref.left.right = ref.right;
                ref.right.left = ref.right;
            }else if(ref != head && ref == tail){
                tail = tail.left;
                tail.right = null;
            }
            ref.left = null;
            ref.right = head;
            head.left = ref;
            head = ref;
            return ref.val;
        }
    }
    public void put(int key, int value){
        Node temp = new Node(value, key);
        if(map.size() < capacity){
            map.put(key, temp);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.right = head;
                head.left = temp;
                head = temp;
            }
        }else{
            if(tail == head){
                map.remove(tail.key);
                map.put(key, temp);
                head = tail = temp;
            }else{
                map.remove(tail.key);
                map.put(key, temp);
                Node help = tail;
                tail = tail.left;
                tail.right = null;
                help.left = null;
                temp.right = head;
                head.left = temp;
                head = temp;
            }
        }
    }
}

class Node{
    int val, key;
    Node left;
    Node right;
    Node(int val, int key){
        this.key = key;
        this.val = val;
        left = null;
        right = null;
    }
}
