package com.pro.ds;

import com.pro.ds.util.LinkedList;

public class Program{
    public static void main(String[] args){

        LinkedList list=new LinkedList();

        list.addLast(56);
        list.addLast(67);
        list.addLast(78);
        list.addLast(90);
        list.addAfter(68, 67);
        list.printList();
    }
}