package com.java;

public class MergeSortedLists {

	private Node head;
	
	public MergeSortedLists(){
		//head = new Node(null);
	}

	//Add At End
	public Node addAtEnd(Integer data){

		if (head == null) {
			head = new Node(data);
		}
 
		Node temp = new Node(data);
		Node current = head;
		
		if(current != null){
			while(current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(temp);
		}
		
		return current;
	}
	
	//Merge 2 lists
	public Node mergeLists(Node list1, Node list2) {
		  if (list1 == null) return list2;
		  if (list2 == null) return list1;

		  if (list1.data < list2.data) {
		    list1.next = mergeLists(list1.next, list2);
		    return list1;
		  } else {
		    list2.next = mergeLists(list2.next, list1);
		    return list2;
		  }
		}
	
	
	public String toString() {
		String output = "";
 
		if (head != null) {
			Node current = head.getNext();
			while (current != null) {
				output += "[" + current.getData().toString() + "]";
				current = current.getNext();
			}
 		}
		return output;
	}
	
	//Build Node
	class Node{
	    Integer data;
	    Node next;
	    
	    public Node(Integer dataValue){
	    	next = null;
	    	data = dataValue;
	    }
	    
	    public Node(Integer dataValue, Node nextValue){
	    	next = nextValue;
	    	data = dataValue;
	    }

		public Integer getData() {
			return data;
		}

		public void setData(Integer data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedLists list1 = new MergeSortedLists();
		list1.addAtEnd(1);
		list1.addAtEnd(2);
		list1.addAtEnd(4);
		list1.addAtEnd(7);
		System.out.println(list1);
		
		MergeSortedLists list2 = new MergeSortedLists();
		list2.addAtEnd(3);
		list2.addAtEnd(5);
		list2.addAtEnd(6);
		list2.addAtEnd(8);
		System.out.println(list2);
		
		MergeSortedLists mergeList = new MergeSortedLists();
		//mergeList.mergeLists(list1, list2);
		
	}
}
