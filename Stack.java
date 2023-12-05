public class Stack<Integer> {
    private Node Head = null;

    private Node Tail = null;


    public Stack()
    {}

    private class Node {
        private int data;
        private Node nextNodeReference;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data , Node nextNodeReference) {
            this.data = data;
            this.nextNodeReference = nextNodeReference;

        }

    }


    public void push(int data)
    {
        if (Head == null)
        {
            Node newNode = new Node(data);
            Head = newNode;
            Tail = newNode;

        }else {

            Node newNode = new Node(data , Head);

            Head = newNode;

        }
    }
    public int peek()
    {
        return Head.data;
    }
    public int pop() {

        Node temp = Head;
        if (isEmpty())
        {
            return 0;
        }

        Head = Head.nextNodeReference;

        return temp.data;
    }
    public void print()
    {
        if (isEmpty())
        {
            System.out.println("null");
            return;
        }

        Node Temp = Head;
        System.out.println();

        while (Temp != null)
        {
            System.out.println(Temp.data);
            Temp = Temp.nextNodeReference;
        }

    }

    public Boolean isEmpty()
    {
        if (Head == null)
        {
            return true;
        }else {
            return false;
        }
    }

    public void clear()
    {
        Head = null;
        Tail = null;
    }
    public void pushAtBottom(int data)
    {
        //condition to stop
        if (isEmpty())
        {
            push(data);
            return;
        }

        //main work
        int temp= pop();

        //recursive call
        pushAtBottom(data);
        push(temp);

    }

    public void reverseStack()
    {
        //condition to stop
        if (isEmpty())
        {
            return;
        }


        //main work
        int temp= pop();

        //recursive call
        reverseStack();
        pushAtBottom(temp);

    }



//    private static class  CustomizedException extends Exception {
//        public CustomizedException() {
//            super("Empty Stack");
//        }
//    }

}



