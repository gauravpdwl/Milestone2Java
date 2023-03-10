package LinkedListPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//
//class LinkedListNode<T> {
//    T data;
//    LinkedListNode<T> next;
//    
//    public LinkedListNode(T data) {
//        this.data = data;
//    }
//}

public class Runner {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            
            LinkedListNode<Integer> head = takeInput();
            String[] i_j = br.readLine().trim().split("\\s");

            int i = Integer.parseInt(i_j[0]);
            int j = Integer.parseInt(i_j[1]);

            LinkedListNode<Integer> newHead = Solution.swapNodes(head, i, j);
            print(newHead);
            
            t -= 1;
        }

    }
    

public class Solution {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        LinkedListNode<Integer> first=head,second=head,temp=head,fr,sr;
        int count=0;

        while(temp!=null){
            if(count==i-1){
                first=temp;
            }
            if(count==j-1){
                second=temp;
            }
            count++;
            temp=temp.next;
        }

        if(i!=j-1 && j!=i-1){
            fr = first.next.next;
            sr = second.next.next;
            // System.out.println(fr.data);
            // System.out.println(sr.data);
            temp = first.next;
            first.next = second.next;
            first.next.next = fr;
            second.next = temp;
            second.next.next = sr;
        }else{
        	
        	fr = first.next.next;
            sr = second.next.next;

            temp = first.next;
            first.next = second.next;
            first.next.next = temp;
            second.next = temp;
            temp.next = sr;
        }
        return head;
	}

}
}