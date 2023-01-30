package LinkedListPackage;

public class MergeSortLL {
	public static Node<Integer> mergeSort(Node<Integer> head){
		
		if(head==null || head.next==null) {
			return head;
		}
		
		Node<Integer> mid=RecursiveLLprint.midPoint(head);
		Node<Integer> l2=mergeSort(mid.next);
		mid.next=null;
		Node<Integer> l1=mergeSort(head);
		
		
		return Merge2SortedLL.merge2SortedLL(l1,l2);
		
	}
}
