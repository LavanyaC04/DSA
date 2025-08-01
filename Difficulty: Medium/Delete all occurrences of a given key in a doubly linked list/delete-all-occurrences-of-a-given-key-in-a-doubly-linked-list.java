// User function Template for Java

/* Structure of Doubly Linked List
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
}*/
class Solution {
    static Node deleteNode(Node head, Node del) 
    {
        if (head == null || del == null)
            return null;
        if (head == del)
            head = del.next;
        if (del.next != null)
            del.next.prev = del.prev;
        if (del.prev != null)
            del.prev.next = del.next;

        del = null;

        return head;
    } 
    static Node deleteAllOccurOfX(Node head, int x) {
        if (head == null)
            return null;
        Node current = head;
        Node next;
        while (current != null)
        {
            if (current.data == x)
            {
                next = current.next;
                head = deleteNode(head, current);
                current = next;
            }
            else
                current = current.next;

        }
        return head;

    }
}