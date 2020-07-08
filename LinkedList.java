import java.util.*;

public class LinkedList {
    static Node head;
    class Node{
    	public int data;
    	public Node next;
    	Node(int data){
    		this.data=data;
    	}
    }
    
    public void insert_At_beginning(int data) {
    	Node ptr = new Node(data);
    	if(head!=null)
          {
    		ptr.next=head;
    		head=ptr;
          }
    	else 
    		{ptr.next=null;
    		head=ptr;
    		}
    }
    
    public void print() {
    	Node ctr=head;
    	
   
    	
    	while(ctr!=null)
    	{
    		System.out.print(ctr.data);
    		ctr=ctr.next;
    	}
    	
    	
    	
    }
    
    public void insert_At_End(int data)
    {    Node ctr=head;
    	 Node ptr = new Node(data);
    	 if(ctr==null)
    	 { head=ptr;
    	   ptr.next=null;
    	   return ;
    	 }
    	 else {
    	 while(ctr.next!=null)
    		 ctr=ctr.next;
    	 ctr.next=ptr;
         ptr.next=null;
    	 }
    }
    
    public void delete_From_Beginning()
    {   if(head!=null)
    	head = head.next;
    else 
    	System.out.println("Linked list is empty");
    }
    
    public void delete_From_End()
    {   
    	Node ctr=head;
    	if(ctr!=null) {
    	while(ctr.next.next!=null)
    		ctr=ctr.next;
    	ctr.next=null;
    	}
    	else
    		System.out.println("Linked list is empty");  
    }
    
    public void delete_At_Position(int c)
    {   
    	int i=1;Node ctr=head,ptr;
    	if(ctr!=null ) {
    	while(i<c-1 && ctr.next!=null)
    		ctr=ctr.next;
    	    ptr=ctr.next;
    	ctr.next=ptr.next;
    }
    else
    	System.out.println("Linked list is empty"); 
    	return ;
    	
    }
    
    public void insert_At_Position(int c,int data)
    {
    	int i=1;Node ctr=head;
    	if(ctr!=null) {
    	while(i<c-1 && ctr.next!=null)
    		ctr=ctr.next;
    	Node ptr = new Node(data);
    	ptr.next=ctr.next.next;
    	ctr.next=ptr;
    	}
    	else
    	{
    		Node ptr = new Node(data);
    		ptr.next=null;
		head=ptr;
		}
    	return;
    }
    
    
    
   public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
   
    LinkedList ll = new LinkedList();
    System.out.println("Enter choice from 1-6");
    boolean f=true;int choice;
    while(f) {
    	 choice = sc.nextInt();
    switch(choice) {
    case 1: {
    int data=sc.nextInt();
    ll.insert_At_beginning(data);ll.print();break;
    }
    case 2:{
    	  int data=sc.nextInt();
    	ll.insert_At_End(data);ll.print();break;
    }
    case 3:{
    	int data=sc.nextInt();
        int c=sc.nextInt();
    	ll.insert_At_Position(c, data);ll.print();break;
    }
    case 4:{
    	ll.delete_From_Beginning();ll.print();break;
    }
    case 5:{
    	ll.delete_From_End();ll.print();break;
    }
    case 6:{
    	 int c=sc.nextInt();
    	ll.delete_At_Position(c);ll.print();break;
    }
    default:f=false;
    }
}
   }
}