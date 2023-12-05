public class LinkedList {
    private Node Head = null;

    private Node Tail = null;

    public LinkedList()
    {

    }

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

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNextNodeReference() {
            return nextNodeReference;
        }

        public void setNextNodeReference(Node nextNodeReference) {
            this.nextNodeReference = nextNodeReference;
        }
    }

    public void add (int data)
    {
        Node newNode = new Node(data);

        if (Head == null)
        {
            Head = newNode;
            Tail = newNode;

        }else {

            Tail.nextNodeReference = newNode;
            Tail = newNode;
        }

    }

    public void addLast(int data)
    {
        add(data);
    }

    public void addFirst(int data)
    {
        if (Head == null)
        {
            add(data);
        }else {

            Node newNode = new Node(data , Head);

            Head = newNode;

        }
    }



    public void print()
    {
        Node Temp = Head;
        System.out.println();
        while (Temp != null)
        {
            System.out.print(Temp.data);
            System.out.print(" --> ");
            Temp = Temp.nextNodeReference;
        }

        System.out.print("null");

    }

    public void remove()
    {

    }

    public int size()
    {
        Node Temp = Head;
        int Count = 0;

        while (Temp != null)
        {
            Count++;
            Temp = Temp.nextNodeReference;
        }

        return Count;

    }

    public int sizeRecursive()
    {
        return sizeRecursiveMethod(Head);

    }

    private int sizeRecursiveMethod(Node Temp)
    {

        //base condition for stop
        if (Temp == null)
        {
            return 0;
        }

        //main work
        Temp = Temp.nextNodeReference;

        ///recursive call
        return sizeRecursiveMethod(Temp) + 1;

    }

    public void clear()
    {
        Head = null;
        Tail = null;
    }

    public void insertGreatestCommonDivisors ()
    {
        Node nodeTemp1 = Head ;
        Node nodeTemp2 = Head.nextNodeReference ;
        int intTemp1 = 0 ;
        int intTemp2 = 0;
        int commonDivisor = 0;


        if (nodeTemp2 == null)
        {
            print();
            return ;
        }

        while (nodeTemp2 != null) // 10 --> 6 --> 10 --> 3
        {

            intTemp1 = (int) nodeTemp1.data;
            intTemp2 = (int) nodeTemp2.data;

            commonDivisor = findCommonDivisor(intTemp1, intTemp2);
            Node commonDiviorNode = new Node(commonDivisor, nodeTemp2);

            nodeTemp1.nextNodeReference = commonDiviorNode;

            nodeTemp1 = nodeTemp2;
            nodeTemp2 = nodeTemp2.nextNodeReference;

        }

        print();
    }

    private int findCommonDivisor(int a , int b)
    {
        int temp = 0;

        for (int i=1 ; i <=a && i <=b ; i++ )
        {
            if (a%i == 0 && b%i == 0)
            {
                temp = i;
            }
        }

        return temp;
    }

    public Node getHead()
    {
        return Head;
    }

    public void removeElements(int val) {



        while (Head!=null && Head.data == val)
        {
            Head = Head.nextNodeReference;
        }

        if(Head==null)
        {
            return ;
        }

        Node temp1 = Head;
        Node temp2 = temp1.nextNodeReference;

        while(temp2 != null )//1,2,6,3,4,5,6
        {

            //2 3 3 1
            if(temp2.data == val)
            {

                temp1.nextNodeReference = temp2.nextNodeReference;
                temp2 = temp2.nextNodeReference;
            }else {
                temp1 = temp1.nextNodeReference;
                temp2 = temp2.nextNodeReference;

            }

        }

        print();

    }
    public void deleteDuplicates() {

        if (Head == null)
        {
            return;
        }
        Node temp1 = Head;
        Node temp2  = Head.nextNodeReference;

        while (temp2 != null)       //1-->1-->2-->3-->3
        {
            if (temp2.data == temp1.data)
            {
                temp2 = temp2.nextNodeReference;
            }else {
                temp1.nextNodeReference = temp2;
                temp1 = temp2;
                temp2 = temp2.nextNodeReference;
            }
        }

        temp1.nextNodeReference = null;

    }


}

