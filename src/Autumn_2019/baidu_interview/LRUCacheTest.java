package Autumn_2019.baidu_interview;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : JasonRen
 * @date : 2018/08/15
 * @email : zhicheng_ren@163.com
 */
public class LRUCacheTest {
    class Node {
        Integer key;
        Integer val;
        Node pre;
        Node next;

        public Node(Integer key, Integer val) {
            this.key = key;
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int cap;
    Map<Integer, Node> map = new HashMap<>();

    public LRUCacheTest(int capacity) {
        cap = capacity;
        head = new Node(null, null);
        tail = new Node(null, null);
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        Node n = map.get(key);

        if (n != null) {
            n.next.pre = n.pre;
            n.pre.next = n.next;
            appendTail(n);
            return n.val;
        }

        return -1;
    }


    public void set(int key, int value) {
        Node n = map.get(key);
        if (n != null) {
            n.val = value;
            n.next.pre = n.pre;
            n.pre.next = n.next;
            appendTail(n);
            map.put(key, n);
            return;
        }
        //else
        if (map.size() == cap) {
            Node tmp = head.next;
            head.next = head.next.next;
            head.next.pre = head;
            map.remove(tmp.key);
        }

        n = new Node(key, value);
        appendTail(n);
        map.put(key, n);
    }

    private void appendTail(Node node) {
        node.next = tail;
        node.pre = tail.pre;
        tail.pre.next = node;
        tail.pre = node;

    }
}
