package com.example.lib01.AbstractClass;

public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    //PRIVATE VS PROTECTED
    /*
    Variables that are declared private can be accessed outside the class,
    if public getter methods are present in the class.

    Using the private modifier is the main way that an object encapsulates
    itself and hides data from the outside world.

    Variables, methods, and constructors, which are declared protected in
    a superclass can be accessed only by the subclasses in other package or
    any class within the package of the protected members' class.

    The protected access modifier cannot be applied to class and interfaces.
     */
}
