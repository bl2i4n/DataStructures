/**
Brian Dela Cruz
Dr. Maher Mneimneh
Data Structures
Lab 4 Linked Stack
03/09/16

 A class of stacks whose entries are stored in a chain of nodes.
 @author Frank M. Carrano
 @version 3.0
 */
public class LinkedStack<T> implements StackInterface<T>
{
    private Node topNode; // references the first node in the chain

    public LinkedStack()
    {
        topNode = null;
    } // end default constructor

    public void push(T newEntry)
    {
        Node newNode = new Node(newEntry, topNode);   topNode = newNode;
    } // end push

    public T peek()
    {
        T top = null;
        if (topNode != null)
            top = topNode.getData();
        return top;
    } // end peek

    public T pop()
    {
        T top = peek();
        if (topNode != null)
            topNode = topNode.getNextNode();
        return top;
    } // end pop

    public boolean isEmpty() {
        return topNode == null;
    }
    public void clear() {
        topNode = null;
    }

    public int remove(int n){
        int count =0; // Initialize count to 0, count contains the number of removed elements
        while(count<n && topNode!=null){    // while count is less than n or top of stack is not null, move top of stack to next and increase count
            count++;    // increase count
            topNode=topNode.getNextNode();  // move top of node to next
        }
        return count;
    }


    private class Node
    {
        private T    data; // entry in stack
        private Node next; // link to next node

        private Node(T dataPortion)
        {
            this(dataPortion, null);
        } // end constructor

        private Node(T dataPortion, Node nextNode)
        {
            data = dataPortion;
            next = nextNode;
        } // end constructor

        private T getData()
        {
            return data;
        } // end getData

        private void setData(T newData)
        {
            data = newData;
        } // end setData

        private Node getNextNode()
        {
            return next;
        } // end getNextNode

        private void setNextNode(Node nextNode)
        {
            next = nextNode;
        } // end setNextNode
    } // end Node
} // end LinkedStack
