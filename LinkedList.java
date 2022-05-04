public class LinkedList {
    public static void delete(Node head,int pos){
        if(pos==0){
            head=head.next;
            return;
        }
        Node prev = head;
        for(int i=0;i<pos-1;i++)
        {
            prev = prev.next;
        }
        prev.next=prev.next.next;
    }
    public static void insert(int data,Node head,int pos){
        Node toadd = new Node(data);
        if(pos==0)
        {
            toadd.next = head;
            head=toadd;
        }
        Node prev=head;
        for(int i=0;i<pos-1;i++){
            prev=prev.next;
        }
        toadd.next=prev.next;
        prev.next=toadd;

    }
    public static void traverse(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node head= n1;
        head.next = n2;
        n2.next=n3;
        n3.next=null;
        traverse(head);
        insert(34, head, 2);
        traverse(head);
        delete(head, 1);
        traverse(head);

    }
    
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}