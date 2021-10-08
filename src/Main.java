import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //MyArrayList tessting
        MyList<Integer> myList = new MyArrayList<>();
        System.out.println(myList.size());
        myList.add(90);
        myList.add(null);
        myList.add(87);
        System.out.println(myList.toString());
        System.out.println(myList.size());
        myList.remove(Integer.valueOf(87));
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);

        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");

        //MyLinkedListTesting
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        System.out.println(myLinkedList.size());
        myLinkedList.add(90);
        myLinkedList.add(null);
        myLinkedList.add(87);
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.size());
        myLinkedList.remove(Integer.valueOf(87));
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);


        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");

        //MyStack testing

        MyStack<Integer> stack = new MyStack<>();
        stack.push(4);
        stack.push(44);
        stack.push(43);
        stack.push(374);
        stack.push(488);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
