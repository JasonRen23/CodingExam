package Autumn_2019.ctrip;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cap = Integer.valueOf(sc.nextLine());
        LRUCache lruCache = new LRUCache(cap);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals(""))
                break;
            execute(lruCache, line);
        }

    }

    public static void execute(LRUCache lruCache, String line) {
        String[] arr = line.split(" ");
        if (arr.length < 1)
            return;
        if (arr[0].equals("p")) {
            lruCache.set(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
        } else {
            System.out.println(lruCache.get(Integer.valueOf(arr[1])));
        }
    }


}

class LRUCache{
    class Node {
        Node pre;
        Node next;
        Integer key;
        Integer val;

        public Node(Integer key, Integer val) {
            this.key = key;
            this.val = val;
        }
    }

    Map<Integer, Node> map = new HashMap<>();
    //The head (eldest) of the doubly linked list.
    Node head;
    //The tail (eldest) of the doubly linked list.
    Node tail;
    int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        head = new Node(null, null);
        tail = new Node(null, null);
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        Node n = map.get(key);
        //existed
        if (n != null) {
            n.pre.next = n.next;
            n.next.pre = n.pre;
            appendTail(n);
            return n.val;
        }
        return -1;
    }

    public void set(int key, int value) {
        Node n = map.get(key);
        //existed
        if (n != null) {
            n.val = value;
            map.put(key, n);
            // n.pre.next = n.next;
            // n.next.pre = n.pre;
            // appendTail(n);
            return;
        }

        if (map.size() == cap) {
            Node tmp = head.next;
            head.next = head.next.next;
            head.next.pre = head;
            map.remove(tmp.key);
        }

        n = new Node(key, value);
        //youngest node append tail
        appendTail(n);
        map.put(key, n);
    }

    private void appendTail(Node n) {
        n.next = tail;
        n.pre = tail.pre;
        tail.pre.next = n;
        tail.pre = n;
    }
}
