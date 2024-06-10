import java.util.LinkedList;
import java.util.Scanner;

public class Program7 {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static Node addElement(Node head,int val){
        Node temp=head;
        Node newNode=new Node(val);
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }

    public static String getString(Node head){
        String str = "";
        while (head!=null) {
            str+=head.val;
            head=head.next;
        }
        return str;
    }
    
    public static void main(String[] args) {
        Node l1 = new Node(0);
        Node head1 = addElement(l1, 0);
        head1 = addElement(head1, 1);
        Node l2 = new Node(0);
        Node head2 = addElement(l2, 0);
        head2 = addElement(head2, 9);
        String str1 = getString(head1);
        String str2 = getString(head2);
        String s1="",s2="";
        for(int i=str1.length()-1;i>=0;i--){
            s1+=str1.charAt(i);
        }
        for(int i=str2.length()-1;i>=0;i--){
            s2+=str2.charAt(i);
        }
        
        Integer n1 = Integer.parseInt(s1);
        Integer n2 = Integer.parseInt(s2);
        System.out.println(n1+n2);
    }
    
    

}