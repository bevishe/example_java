package com.ldu.bevishe.leetcode;

public class List {
    private ListNode head ;
    public int length = 0;

    //创建list
    public void create(int x){
        head = new ListNode(x);
        length = 1;
        head.next=null;
    }

    //添加节点
    public void addListNode( int x){
        if(this.length ==0){
            head = new ListNode(x);
            length = 1;
            head.next=null;
        }
        else{
            ListNode endNode = this.head;
            ListNode l = new ListNode(x);
            while(endNode.next!=null)
                endNode=endNode.next;
            endNode.next=l;
            length += 1;
            l.next=null;
        }

    }

    //以数组的形式来添加节点
    public void addListNode(int[] x){
        if(length ==0) {
            head = new ListNode(x[0]);
            this.length = 1;
            int i=1,len=x.length;
            ListNode endNode = head;
            for(;i<len;i++){
                ListNode newNode = new ListNode(x[i]);
                endNode.next = newNode;
                length++;
                endNode = endNode.next;
            }
            endNode.next = null;
        }
        else{
            ListNode endNode = head;
            while(endNode.next!=null)
                endNode = endNode.next;
            int len = x.length;
            for(int i=1;i<=len;i++){
                ListNode newNode = new ListNode(x[i-1]);
                endNode.next=newNode;
                endNode = endNode.next;
                length++;
            }
            endNode.next = null;
        }
    }

    //打印链表
    public void printList(){
        if(this.head==null)
            System.out.println("this list is null!");
        else{
            ListNode nextNode = this.head;
            while(nextNode!= null){
                System.out.print(nextNode.getValue()+"->");
                nextNode=nextNode.next;
            }
        }
    }

    //删除链表尾的节点
    public int deleteListNode(){
        int x = 0;
        ListNode endNode = head;
        while(endNode.next!=null)
            endNode = endNode.next;
        x = endNode.getValue();
        endNode = null;
        return x;
    }

    //获取最后一个节点
    public int getNodeValue(){
        ListNode endNode = head;
        while(endNode.next!=null)
            endNode = endNode.next;
        return endNode.getValue();
    }

    //获取第x个节点的值
    public int getNodeValue(int x){
        ListNode node = head;
        for(int i=1;i<x;i++){
            node = node.next;
        }
        return node.getValue();
    }


}
