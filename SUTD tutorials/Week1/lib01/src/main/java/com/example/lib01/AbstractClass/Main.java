package com.example.lib01.AbstractClass;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.tranverse(list.getRoot());
        list.getRoot();

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s: data) {
            list.addItem(new Node(s));
        }

        list.tranverse(list.getRoot());
        //I FAILED THIS.
    }
}
