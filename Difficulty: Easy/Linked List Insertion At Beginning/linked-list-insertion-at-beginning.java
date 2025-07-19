// User function Template for Java

class Solution {
    
    public Node insertAtBegining(Node head, int x) {
        Node newnode = new Node(x);
        newnode.next = head;
        head = newnode;
        return head;
    }
}