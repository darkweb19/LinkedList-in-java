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


    
    
    //Printing the list
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

    
    

    //Delete from first
    public void deleteFirst() {
        if(head ==  null) {
            System.out.println("The list is empty :");
            return ;

        }
        size--;
        head  =  head.next ;

    }

    

    //delete from last..
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
    
    
    
    
    
    
    //This function is to reverse LinkedList... using  looop 
    public void reverseIterate() {

        if(head == null || head.next == null) {
            return ;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node  nextNode = currNode.next;
            currNode.next = prevNode ;

            //update    
            prevNode = currNode;
            currNode = nextNode ;

        }
        head.next  = null ;
        head = prevNode ;
    }
    
   
    
    
    
    //This function is to reverse LinkedList using recursion...
    public Node reverseRecursive(Node head){


        if(head ==  null  || head.next == null) {
            return head ;
        }
        Node newhead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null ;
        return newhead;
    }



    
    
    //main function
    public static void main(String agrs[]){ 
        LinkedListLL list =  new LinkedListLL();
        
        //for addin in first
        list.addFirst("a");
        list.addFirst("is");
        //for adding  in last
        list.addLast("list");
        list.addFirst("This");
        list.printList();
        
        //for deleting 
        list.deleteFirst();
        list.printList();
        //delete
        list.deleteLast(); 
        list.printList();

        System.out.println( list.getSize());//get size or number of list in a LinkedList...
        
        
        list.addFirst("Hello");
        list.printList();
        System.out.println( list.getSize());
        
        
        
        //for reverse.. using iterate
        list.reverseIterate();
        list.printList();
        
        //for reverse using reccursion...
        list.head = list.reverseRecursive(list.head);
        list.printList();
        

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
