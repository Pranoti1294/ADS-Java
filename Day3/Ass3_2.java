
public class Ass3_2 
{
    static Node head;

    static class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            next = null;
            prev = null;

        }
    }

    static void display()
    {
        if(head.next == null)
        {
            System.out.println("Empty......");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) 
        {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }

    public static void main(String[] args) 
    {
        
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        display();
    }
}
