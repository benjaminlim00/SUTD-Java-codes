package com.example.lib01.AbstractClass;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void tranverse(ListItem root);
}
