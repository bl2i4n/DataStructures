/**
Brian Dela Cruz
Dr. Maher Mneimneh
Data Structures
Lab 4 Stack driver to test methods
03/09/16

 */
public class StackDriver {

    public static void main(String args[]){
        System.out.println("------------------------------LinkedStack------------------------------");
        ArrayStack2<Integer> astack = new ArrayStack2<>(3);
        LinkedStack<Integer> lstack = new LinkedStack<>();
        lstack.push(1);
        lstack.push(2);
        lstack.push(3);
        lstack.push(4);
        lstack.push(5);
        if(!lstack.isEmpty())
            System.out.println(lstack.peek());
        else
            System.out.println("empty");
        if(!lstack.isEmpty())
            System.out.println(lstack.pop());
        else
            System.out.println("empty");
        if(!lstack.isEmpty())
            System.out.println(lstack.pop());
        else
            System.out.println("empty");
        if(!lstack.isEmpty())
            System.out.println(lstack.pop());
        else
            System.out.println("empty");if(!lstack.isEmpty())
            System.out.println(lstack.pop());
        else
            System.out.println("empty");
        if(!lstack.isEmpty())
            System.out.println(lstack.pop());
        else
            System.out.println("empty");
        if(!lstack.isEmpty())
            System.out.println(lstack.pop());
        else
            System.out.println("empty");


        lstack.push(1);
        lstack.push(2);
        lstack.push(3);
        lstack.push(4);
        lstack.push(5);

        System.out.println("Removed "+lstack.remove(3));
        if(!lstack.isEmpty())
            System.out.println(lstack.pop());
        else
            System.out.println("empty");
        if(!lstack.isEmpty())
            System.out.println(lstack.pop());
        else
            System.out.println("empty");
        if(!lstack.isEmpty())
            System.out.println(lstack.pop());
        else
            System.out.println("empty");


        System.out.println("------------------------------ArrayStack2------------------------------");


        astack.push(1);
        astack.push(2);
        astack.push(3);
        astack.push(4);
        astack.push(5);
        if(!astack.isEmpty())
            System.out.println(astack.peek());
        else
            System.out.println("empty");
        if(!astack.isEmpty())
            System.out.println(astack.pop());
        else
            System.out.println("empty");
        if(!astack.isEmpty())
            System.out.println(astack.pop());
        else
            System.out.println("empty");
        astack.push(4);
        astack.push(5);
        if(!astack.isEmpty())
            System.out.println(astack.pop());
        else
            System.out.println("empty");
        if(!astack.isEmpty())
            System.out.println(astack.pop());
        else
            System.out.println("empty");
        if(!astack.isEmpty())
            System.out.println(astack.pop());
        else
            System.out.println("empty");
        if(!astack.isEmpty())
            System.out.println(astack.pop());
        else
            System.out.println("empty");
        astack.push(5);
        if(!astack.isEmpty())
            System.out.println(astack.pop());
        else
            System.out.println("empty");


    }
}