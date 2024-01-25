import java.util.*;

class Node{
    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}

class LinkedListDemo{

    Node head = null;

    void addFirst(int data){

        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    void addLast(int data){

        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
        }else{

            Node temp = head;

            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    int countNode(){

        Node temp = head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;
    }

    void addAtPosition(int position,int data){

        if(position<=0 || position>=countNode()+2){
            System.out.println("Wrong Position");
            return;
        }

        if(position==1){
            addFirst(data);
        }else if(position==countNode()+1){
            addLast(data);
        }else{
            
            Node newNode = new Node(data);
            Node temp = head;
            
            while(position-2 != 0){
                temp=temp.next;
                position--;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }

    void delFirst(){

        if(head==null){
            System.out.println("Empty LinkedList");
            return;
        }

        if(countNode()==1){
            head=null;
        }else{
            head=head.next;
        }
    }

    void delLast(){

        if(head==null){
            System.out.println("Empty LinkedList");
            return;
        }

        if(countNode()==1){
            head=null;
        }else{
            Node temp = head;

            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }

    void delAtPosition(int position){

        if(position<=0 || position>=countNode()+2){
            System.out.println("Wrong Position");
            return;
        }

        if(position==1){
            delFirst();
        }else if(position==countNode()+1){
            delLast();
        }else{
            Node temp = head;

            while(position-2 != 0){
                temp=temp.next;
                position--;
            }
            temp.next = temp.next.next;
        }
        
    }

    void printLinkedList(){

        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }else{
            Node temp = head;

            while(temp.next!=null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
}

class Client{

    public static void main(String[] args){

        LinkedListDemo ll = new LinkedListDemo();
        char ch;

        do{
            System.out.println("1.addFirst");
            System.out.println("2.addLast");
            System.out.println("3.addAtPosition");
            System.out.println("4.delFirst");
            System.out.println("5.delLast");
            System.out.println("6.delAtPosition");
            System.out.println("7.countNode");
            System.out.println("8.printLinkedList");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch(choice){

                case 1 :{
                    System.out.println("Enter Data");
                    int data = sc.nextInt();
                    ll.addFirst(data);
                }
                break;

                case 2 :{
                    System.out.println("Enter Data");
                    int data = sc.nextInt();
                    ll.addLast(data);
                }
                break;

                case 3 :{
                    System.out.println("Enter Data");
                    int data = sc.nextInt();
                    System.out.println("Enter Position");
                    int position = sc.nextInt();
                    ll.addAtPosition(position, data);
                }
                break;

                case 4 :{
                    ll.delFirst();
                }
                break;

                case 5 :{
                    ll.delLast();
                }
                break;

                case 6 :{
                    System.out.println("Enter Position");
                    int position = sc.nextInt();
                    ll.delAtPosition(position);
                }
                break;

                case 7 :{
                    int count = ll.countNode();
                    System.out.println(count);
                }
                break;

                case 8 :{
                    ll.printLinkedList();
                }
                break;

                default :
                    System.out.println("Wrong Choice");
                    break;
            }

            System.out.println("Continue?");
            ch = sc.next().charAt(0);
            ///sc.close();
        }while(ch=='Y' || ch=='y');
    
    }
}
