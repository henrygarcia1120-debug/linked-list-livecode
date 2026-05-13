import java.util.List;

public class Practice {
    public static void main(String[] args) {
        ListNode myNode = new ListNode(); 
        myNode.data = 'x';
        

        ListNode anotherNode = new ListNode();
        anotherNode.data = 't'; 

        myNode.next = anotherNode;

        ListNode moreNode = new ListNode();
        moreNode.data = 'r'; 

        anotherNode.next = moreNode; 


        ListNode coolNode = new ListNode(); 
        coolNode.data = 'w'; 

        coolNode.next = myNode; 

        ListNode extra = moreNode; 
        moreNode.data = 'e'; 

        ListNode hello = new ListNode(); 
        hello.data = 'x';
        extra.next = hello; 

        printList(coolNode);
        System.out.println();

        //int xCount = countX(coolNode); 
        //System.out.println(xCount);

        ListNode newHead = removeAt(coolNode, 0);
        printList(newHead);

    }   

    public static void printList(ListNode head)
    {

        //keep track of current, starting at head 
        ListNode current = head; 
        // until head of list
        while(current != null) 
        {   
            //print out data at current
            System.out.println(current.data);


            //move current to the next node 
            current = current.next; 
            
        }
    }
    

    //count how many nodes hold an X 
    public static int countX(ListNode head)
    {
        int count = 0;
        //keep track of current starting at head 
        ListNode current = head; 

        //until end of list
        while(current != null)
        {
            if(current.data == 'x');
            {
                count++;
            }
            current = current.next; 
        }
        return count; 
    }


    //remove the node at removeIndex, and return the head of the list 
    //Example: 
    //e --> t --> k --> y
    // removeIndex 2 
    // e --> t --> y 
    public static ListNode removeAt(ListNode head, int removeIndex)
    {
        if(removeIndex == 0)
        {
            return head.next; 
        }
        ListNode current = head;

        for(int i = 0; i < removeIndex - 1; i++)
        {
            current = current.next; 
            
        }
        current.next = current.next.next;

        return head; 
    }

}
