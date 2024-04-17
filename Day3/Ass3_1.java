public class Ass3_1 
{
    static Node head;

    static class Node 
    {
        int data;
        Node next;
        public Node()
        {

        }
        public Node(int data) 
        {
            this.data = data;
            this.next = null;
        }

    }

    static void insertElement(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null ) 
        {
            current = current.next;
        }
        current.next = newNode;

    }
    static void deleteElement(int d) 
    {
        if (head == null) 
        {
            System.out.println("List is empty...");
            return;
        }
    
        if (head.data == d) 
        {
            head = head.next;
            System.out.println("Element " + d + " is deleted.");
            return;
        }
    
        Node current = head;
        while (current.next != null) {
            if (current.next.data == d) {
                current.next = current.next.next;
                System.out.println("Element " + d + " is deleted.");
                return;
            }
            current = current.next;
        }
    
        System.out.println("Element " + d + " not found in the list.");
    }

    static void printElement() 
    {
        if (head == null) 
        {
            return;
        }
        Node n = head;
        while (n != null) 
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        insertElement(10);
        insertElement(20);
        insertElement(30);
        printElement();
        deleteElement(20);
        printElement();
    }
    
}
