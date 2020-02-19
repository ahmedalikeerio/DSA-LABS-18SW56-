import java.util.*;

class Node{
	int data;
	Node next;

	Node(){
	}

	Node(int data){
		this(data, null);
	}

	Node( int data, Node next ){
		this.data = data;
		this.next = next;
	}
}

class MyLinkedList{

	Node head;

	public void insert(int data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null){
			head = node;
		}
		else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void insertAtStart(int data){
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	public int size(){
		int temp=1;
		Node tempNode = head;
		while(tempNode.next !=null){
			temp++;
			tempNode = tempNode.next;
		}

		return temp;
	}

	public void insertAt(int data, int index){
		Node node = new Node();
		node.data = data;
		
		if(index == 0){
			node.next = head;
			head = node;

		}
		else{
			Node temp = head;

			for(int x=0; x<index-1; x++){
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;	
		}
		
	}

	public void deleteAt( int index ){

		if( index==0 ){
			head = head.next;
		}
		else{
			Node temp = head;
			for( int x=0; x<index-1; x++ ){
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	public void show(){
		Node node = head;
		while( node.next != null ){
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	public int sum(){
		Node temp = head;
		int sum = 0;
		while( temp.next != null ){
			sum += temp.data;
			temp = temp.next;
		}
		sum+=temp.data;

		return sum;
	} 

	public int get(int index){
		Node temp = head;
		int x=1;
		if(index ==0 ){
			return head.data;
		}
		else{
			
			while(x<=index){
			temp = temp.next;
			x++;
		 	}
		 	return temp.data;
		}
	}	

	public void set( int data , int index ){
		
		Node temp = head;
		int x=1;
		if( index==0 ){
			head.data = data;
		}
		else{
			while(x<=index){
			temp = temp.next;
			x++;
		 	}
		 	temp.data = data;
		}
	}
}

public class Task2{
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.insert(56);
		list.insert(10);
		list.insertAt(52, 3);
		list.insert(82);
		list.insert(9);
		list.insert(70);
		list.show();
		System.out.println();
		System.out.println(list.sum());
		System.out.println(list.get(3));
		list.set(66, 2);
		System.out.println(list.get(3));
		System.out.println("\"" + list.size() + "\"");
	}
}
