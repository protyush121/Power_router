
public class LinkedList {
    public static Node head;
    public static Node tail;
    public static int size;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    }
    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
        }
        tail.next= newNode;
        tail= newNode;
    }
    public void addMiddle(int index, int data){
        Node newNode= new Node(data);
        size++;
        if(index==0){
            addFirst(data);
            return;
        }
        Node temp= head;
        for(int i=0; i<(index-1);i++){
            temp= temp.next;
        }
        newNode.next= temp.next;
        temp.next= newNode;


    }
   
    public void display(){
        if(head==null) {
            System.out.println("Linked list is empty ...");
            return;
        }
        Node temp= head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    

    }
    public Node findMid(Node Node){//slow fast approach
        Node fast= head;// jumps 2 node
        Node slow= head;//jumps 1 node
        while(fast!=null && fast.next!=null){ //odd && even
            slow= slow.next;// +1
            fast= fast.next.next;//+2
        }
        return slow;// at the end slow is my mid ...
    }
   

    public static void main(String[] args) {

        LinkedList ll= new LinkedList();
        ll.display();
        ll.addFirst(12);
        ll.display();
       ll.addFirst(13);
        ll.display();
        ll.addLast(7);
        ll.display();
        ll.addLast(6);
        ll.display();
        ll.addMiddle(4,92);
        ll.display();

        System.out.println( ll.findMid(head));

        head = new Node(1);
        Node temp= new Node(2);
        head.next= temp;
        head.next.next= new Node(3);

        head.next.next.next=temp;//1->2->3->4-point back-->2
        

    }
}