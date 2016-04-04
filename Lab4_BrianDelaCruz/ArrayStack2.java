/**
Brian Dela Cruz
Dr. Maher Mneimneh
Data Structures
Lab 4 Array Stack implementation
03/09/16

*/


public class ArrayStack2<T> implements StackInterface<T>
{
    private T[] stack;    // array of stack entries
    private static final int DEFAULT_INITIAL_CAPACITY = 50;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public ArrayStack2()
    {
        this(DEFAULT_INITIAL_CAPACITY);
    } // end default constructor

    public ArrayStack2(int initialCapacity)
    {
        capacity = initialCapacity;
        // the cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[])new Object[initialCapacity];
        stack = tempStack;

    } // end constructor

    public void push(T newEntry)
    {
        T top =stack[0];    // Store the value at 0th index in variable top
        int index = 1;      // Initialize index to 1
        while(top!=null && index<capacity){ // keep iterating until the value contained at index is not null i.e. top is not null, and index < size of array
            T temp = stack[index]; // store the value at index in variable temp
            stack[index]=top;   // copy the value at index-1 to the position index
            top = temp;         // make top as the value stored at index, previously. top = temp
            index++;            // increment index
        }
        stack[0] = newEntry;    // Put new entry at 0th index
    } // end push


    public T peek()
    {
        return stack[0];    // return the value stored at 0th index
    } // end peek


    public T pop()
    {
        T top = stack[0]; // store the top of the stack in a variable top.
        int i=0;
        for(i=0;i<capacity-1 && stack[i]!=null;i++){ // move the value at index to index-1, until value at index!= null and index is less than the size of the stack
            stack[i] = stack[i+1];
        }
        stack[i]=null; // set the value at last index to null
        return top; // return the value initially stored at 0th index i.e. the top of the stack
    } // end pop

    public boolean isEmpty()
    {
        return stack[0]==null; // if top of the stack is null, return true. else return false
    } // end isEmpty

    public void clear()
    {
        for(int i=0;i<capacity && stack[i]!=null;i++){ // Make the values stored at all indexes to null
            stack[i]=null;
        }
    }

} // end ArrayStack2