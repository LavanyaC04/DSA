/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node addNode(Node head, int p, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            if (p == -1) return newNode;
            else return head;
        }
        Node curr = head;
        for (int i = 0; i < p && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) return head;
        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next = newNode;
        if (newNode.next != null) newNode.next.prev = newNode;
        return head;
    }
}
