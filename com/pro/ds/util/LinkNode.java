package com.pro.ds.util;

public class LinkNode{
    private int value;
    private LinkNode next;

    public LinkNode(int value, LinkNode next){
        this.value=value;
        this.next=next;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param next the next to set
     */
    public void setNext(LinkNode next) {
        this.next = next;
    }

    /**
     * @return the next
     */
    public LinkNode getNext() {
        return next;
    }

}