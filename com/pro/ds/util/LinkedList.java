package com.pro.ds.util;
import com.pro.ds.util.LinkNode;

public class LinkedList{
    private LinkNode root;
    private int value;

    public void addFirst(int value){
        root=new LinkNode(value, null);
    }

    public void addAfter(int value, int afterValue){
        LinkNode tempNode=root;
        while(tempNode!=null){
            if(tempNode.getValue()==afterValue){
                tempNode.setNext(new LinkNode(value, tempNode.getNext()));
                break;
            }
            tempNode=tempNode.getNext();
        }
    }

    public void addLast(int value){
        if(root==null){
            addFirst(value);
           // System.out.println("Root : "+ value);
        }else{
            LinkNode head=root;
            while(head.getNext()!=null){
                head=head.getNext();   
            }
            head.setNext(new LinkNode(value, null));
            //System.out.println(head.getNext().getValue());
        }
    }

    public void printList(){
        while(root!=null){
            System.out.println(root.getValue());
            root=root.getNext();
        }
    }
}