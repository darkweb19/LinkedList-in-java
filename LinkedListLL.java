//LinkedList

class LinkedListLL {
    Node head ;
    private int size ;

    LinkedListLL(){
        this.size = 0 ;
    }

    class Node{
        String data ;
        Node  next ;

        Node(String data) {
            this.data = data ;
            this.next = null;
            size++;
        }
    }

    //Insert / Add ==First  and last..
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head ==  null ) {
            head  = newNode ;
            return ;
        }
        newNode.next =  head ;
        head   =    newNode ;
        
    }
    //add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head ==  null ) {
            head  = newNode ;
            return ;
        }

        Node currNode = head ;
        while(currNode.next != null){
            currNode = currNode.next ;
        }
        currNode.next = newNode ;

    }


    //Print
    public void printList() {

        if(head == null) {
            System.out.println("List is empty");
            return ;
        }
        Node currNode = head ;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next ;
        }
        System.out.println("NULL");

    }


    //Delete

    public void deleteFirst() {
        if(head ==  null) {
            System.out.println("The list is empty :");
            return ;

        }
        size--;
        head  =  head.next ;

    }


    public void deleteLast(){
        if(head ==  null) {
            System.out.println("The list is empty :");
            return ;

        }
        size--;
        if(head.next  == null){
            head = null;
            return ;
        }

        Node secondLast = head; 
        Node LastNode = head.next ;
        while(LastNode.next != null){
            LastNode = LastNode.next ;
            secondLast = secondLast.next ;
        }
        secondLast.next = null;
    }



    //size
    public int getSize(){
        return size ;
    }





    public static void main(String agrs[]){ 
        LinkedListLL list =  new LinkedListLL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();
        
        
        list.addFirst("This");
        list.printList();
        
        
        list.deleteFirst();
        list.printList();
        
        list.deleteLast();
        list.printList();

        System.out.println( list.getSize());
        
        
        list.addFirst("Hello");
        list.printList();
        System.out.println( list.getSize());

    }
    
}

//NOTE : Time Complexity : 
// Insertion = O(1) 
// Search = O(n); because treverse all linked list ..


// Propoerties : 
// 1. size varies
// 2. Non continous memory means not serially 



// TIP: For freqeuently used
// If Search  garnu xa  then arraylist use   garne if Insertion garnu
//  xa then LinkedList use garne...