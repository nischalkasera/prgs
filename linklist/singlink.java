package linklist;


public class singlink {
	
	private static listNode head;
	
	private static class listNode {
		private int data;
		private listNode next;
		
		public listNode (int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
	 head = new listNode(10);
	 listNode second = new listNode(1);
	 listNode third = new listNode(5);
	 listNode fourth = new listNode(12);
	 head.next = second;  //10-->1
	 second.next = third;	//10-->1-->5
	 third.next = fourth;	//10-->1-->5-->12-->null
	 insertNode(69);	//69-->10-->1-->5-->12-->null
	 insNodeEnd(32);	//69-->10-->1-->5-->12-->32-->null
	 insPos(44,1);
	 insPos(22,2);
	 delStart();
	 delEnd();
	 delPos(5,5);
	 delNode(10);
	 display(head);
	 count();
	 System.out.print("\nlength of sll is "+count());
//	 insertSortedlist(4);
//	 sortList(head);
//	 display(head);
//	 search(head, 1);
//	 if(search(head, 1))
//		 System.out.print("\nThe key is found!");
//	 else
//		 System.out.print("\nThe key is not found!");
//	 listNode revHead = reverse(head);
//	 display(revHead);
//	 listNode ls = middle();
//	 System.out.println("\nmiddle node is "+ls.data);
//	 listNode nele = nthele(3);
//	 System.out.print("Nth element from the node is "+nele.data);
//	 remDup();
//	 display(head);
//	 insertSortedlist(12);
	
	 
	}
	//displaying the elements in the sll
	public static void display(listNode head) {
		listNode current = head;
		System.out.println();
		 while(current!=null) {
			 System.out.print(current.data+"-->");
			 current = current.next;		 
		 }
		 System.out.print("null");
	}
	//returning the count of elements in the sll
	public static int count() {
		if(head == null)
			return 0;
		int count = 0;
		listNode current = head;
		while(current!=null) {
			count++;
			current = current.next;
		}
		return count;
	}
	//inserting a node at the beginning of linked list
	public static void insertNode(int value) {
		listNode newnode = new listNode(value);
		newnode.next = head;
		head = newnode;
	}

	//inserting node at the end of linked list
	public static void insNodeEnd(int value) {
		listNode newnode = new listNode(value);
		if(head == null) {
			head = newnode;
			return;
		}
		listNode current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = newnode;
	}
	//inserting node at a given position
	//this function can be used to insert at any position - head, end, or in between 
	public static void insPos(int value, int pos) {
		listNode node = new listNode(value);
		if(pos == 1) {
			node.next = head;
			head = node;
		} else {
			listNode prev = head;
			int count = 1;
			while(count<pos-1) {
				prev = prev.next;
				count++;
		}
		listNode current = prev.next;
		node.next = current;
		prev.next = node;
		}
	}
	//deleting first node of a sll (head)
	//shifts the head to next position and pops the element at the starting of sll
	public static listNode delStart() {
		if(head == null)
			return null;
		else {
			listNode temp = head;
			head = head.next;
			temp.next = null;
			return temp;
			
		}
	}
	
	//deleting last node of a sll (end)
	//shifts the addr of null pointer towards previous node and then pops the last element of sll
	public static listNode delEnd() {
		if(head == null || head.next == null) {
			return head;
		}
		listNode current = head;
		listNode prev = null;
		while(current.next!=null) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
		return current;
	}
	//deleting a node at a given position in linked list
	public static void delPos(int value, int pos) {
		if(pos == 1) {
			head = head.next;
		}else{
			listNode prev = head;
			int count = 1;
			while(count < pos-1) {
				prev = prev.next;
				count++;
			}
			listNode current = prev.next;
			prev.next = current.next;
		}
	}
	//searching an element in sll 
	public static boolean search(listNode head, int value) {
		if(head == null)
			return false;
		listNode current = head;
		while(current!= null) {
			if(current.data == value)
				return true;
			current = current.next;
			}
		return false;	
	}
	//reversing a sll
	public static listNode reverse(listNode head) {
		if(head == null) {
			return head;
		}
		listNode current = head;
		listNode next = null;
		listNode prev = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	//finding middle element in the sll
	public static listNode middle() {
		if(head == null) {
			return null;
		}
		listNode sptr = head;
		listNode fptr = head;
		while(fptr != null && fptr.next != null) {
			sptr = sptr.next;
			fptr = fptr.next.next;
		}
		return sptr;
	}
	
	//nth node from the end of the sll
	public static listNode nthele(int n) {
		if(head == null)
			return null;
		if(n <= 0)
			throw new IllegalArgumentException("Invalid value n = "+n);
		listNode mptr = head;
		listNode rptr = head;
		int count = 0;
		while(count<n) {
			if(rptr == null)
				throw new IllegalArgumentException(n+" is greater than number of nodes in the list");
			rptr = rptr.next;
			count++;
		}
		while (rptr != null) {
			rptr = rptr.next;
			mptr = mptr.next;
		}
		return mptr;
	}
	
	//removing duplicates from sll
	public static void remDup() {
		if(head == null)
			return;
		listNode current = head;
		if(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}
	
	//inserting elements into sorted sll
//	public static listNode insertSortedlist(int value) {
//		listNode newNode = new listNode(value);
//		if(head == null)
//			return newNode;
//		listNode current = head;
//		listNode temp = null;
//		while(current != null && current.data < newNode.data) {
//			temp = current;
//			current = current.next;
//		}
//		newNode.next = current;
//		temp.next = newNode;
//		return head;
//	}
	
	//sorting an unsorted sll
//	public static listNode sortList(listNode head) {
//        if (head == null || head.next == null)
//            return head;
//        listNode mid = getMid(head);
//        listNode left = sortList(head);
//        listNode right = sortList(mid);
//        return merge(left, right);
//        
//    }
//
//    public static listNode merge(listNode list1, listNode list2) {
//        listNode dummyHead = head;
//        listNode tail = dummyHead;
//        while (list1 != null && list2 != null) {
//            if (list1.data < list2.data) {
//                tail.next = list1;
//                list1 = list1.next;
//                tail = tail.next;
//            } else {
//                tail.next = list2;
//                list2 = list2.next;
//                tail = tail.next;
//            }
//        }
//        tail.next = (list1 != null) ? list1 : list2;
//        return dummyHead.next;
//    }
//
//    public static listNode getMid(listNode head) {
//        listNode midPrev = null;
//        while (head != null && head.next != null) {
//            midPrev = (midPrev == null) ? head : midPrev.next;
//            head = head.next.next;
//        }
//        listNode mid = midPrev.next;
//        midPrev.next = null;
//        return mid;
//    }
//    public static void printList(listNode dummyHead)
//	{
//		while (dummyHead != null) {
//			System.out.print(dummyHead.data + " ");
//			dummyHead = dummyHead.next;
//		}
//	}
	
	//delete any element in a sll using its key
	public static void delNode(int key) {
		listNode current = head;
		listNode temp = null;
		if(current!=null && current.data == key) {
			head = current.next;
			return;
		}
		while(current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		if(current == null)
			return;
		temp.next = current.next;
	}
	//checking if it contains the loop
	public static boolean containsLoop() {
        listNode fastPtr = head;
        listNode slowPtr = head;
        
        while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            
            if(fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
	}

    public static listNode startNodeInALoop() {
        listNode fastPtr = head;
        listNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(fastPtr == slowPtr) {
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    private static listNode getStartingNode(listNode slowPtr) {
        listNode temp = head;
        while(temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp; // starting node of the loop
    }

    public static void removeLoop() {
        listNode fastPtr = head;
        listNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(fastPtr == slowPtr) {
                removeLoop(slowPtr);
                return;
            }
        }
    }

    private static void removeLoop(listNode slowPtr) {
        listNode temp = head;
        while(temp.next != slowPtr.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    public static void createALoopInLinkedList() {
        listNode first = new listNode(1);
        listNode second = new listNode(2);
        listNode third = new listNode(3);
        listNode fourth = new listNode(4);
        listNode fifth = new listNode(5);
        listNode sixth = new listNode(6);
        
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }
}


