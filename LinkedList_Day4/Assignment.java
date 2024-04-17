
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Assignment {
    ListNode head;

    public Assignment() {
        this.head = null;
    }

    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
    
        ListNode slow = head;
        ListNode fast = head;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
    
            if (slow == fast) return true;
        }
    
        return false;
    }
    public ListNode findStartOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
    
            if (slow == fast) {
                ListNode start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }
        }
    
        return null;
    }
    public static void main(String[] args) 
    {
        
    }
}
