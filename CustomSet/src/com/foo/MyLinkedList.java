package com.foo;

import java.util.Iterator;
/**
 *
 * @author Aishwarya_Bommisetty
 *
 * @param <T>
 */
public final class MyLinkedList<T extends Comparable<T>>
implements Iterable<T> {
    /**
     *
     */
    private Node<T> head = null;
    /**
     *
     */
    private Node<T> tail = null;
    /**
     *
     * @param elements stores elements
     */
    @SafeVarargs
    public final void add(final T... elements) {
        for (T element : elements) {
            Node<T> temp = head;
            int flag = 0;
            for (int i = 0; i < this.size(); i++) {
                if (temp.data.compareTo(element) == 0) {
                    flag = 1;
                    break;
                }
                temp = temp.next;
            }
            if (flag == 0) {
                if (head == null && tail == null) {
                    head = new Node<T>(element);
                    tail = head;
                } else {
                    Node<T> temp1 = new Node<T>(element);
                    tail.next = temp1;
                    tail = temp1;
                }
            }
        }
    }
    /**
     * implements java.lang.Iterable<T>.iterator .
     * @return Iterator<T>
     */
    public Iterator<T> iterator() {

        Iterator<T> iterator = new Iterator<T>() {

            private Node<T> current = head;

            public Node<T> getCurrent() {
                return current;
            }

            public void setCurrent(final Node<T> current) {
                this.current = current;
            }

            public boolean hasNext() {

                if (getCurrent() != null) {
                    return true;
                }
                return false;
            }

            public T next() {
                Node<T> temp = getCurrent();
                setCurrent(current.next);
                return temp.data;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return iterator;
    }

    /**
     *
     * @param index stores index at which removal should happen
     */
    public void removeAt(final int index) {
        if (this.size() < index) {
            System.err.println("Invalid index");
            return;
        }
        Node<T> temp = head;
        if (index == 0) {
            head = head.next;
            return;
        }
        int flag = 0;
        while (temp.next.next != null) {
            if (flag == index - 1) {
                break;
            }
            temp = temp.next;
            flag++;
        }

        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }

    }

    /**
     *
     * @return the size of the list
     */
    public int size() {
        int size = 0;
        Node<T> temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    /**
     *
     * @param index takes the index of the element
     * @return the element
     */
    public T get(final int index) {
        Node<T> temp = head;
        if (this.size() < index) {
            System.err.println("Invalid index");
        }
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return temp.data;
            }
            if (temp == null) {
                return null;
            } else {
                temp = temp.next;
            }
        }
        return null;
    }
  /**
   *
   */
    public void sort() {
        if (this.size() > 1) {
            boolean wasChanged;

            do {
                Node<T> current = head;
                Node<T> previous = null;
                Node<T> nextNode = head.next;
                wasChanged = false;

                while (nextNode != null) {
                    if (current.data.compareTo(nextNode.data) == 1) {

                        wasChanged = true;

                        if (previous != null) {
                            Node<T> sig = nextNode.next;

                            previous.next = nextNode;
                            nextNode.next = current;
                            current.next = sig;
                        } else {
                            Node<T> sig = nextNode.next;

                            head = nextNode;
                            nextNode.next = current;
                            current.next = sig;
                        }

                        previous = nextNode;
                        nextNode = current.next;
                    } else {
                        previous = current;
                        current = nextNode;
                        nextNode = nextNode.next;
                    }
                }
            } while (wasChanged);
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub


        String str = "Set: [";

        if (head == null) {
            return str + " ]";
        }

        Node<T> curRef = head;
        Node<T> nextRef = head.next;

        str += "{" + curRef.data.toString() + "}, ";

        while (nextRef != null) {
            curRef = nextRef;
            nextRef = nextRef.next;

//            if (nextRef == null) {
//                str += "{" + curRef.data.toString() + "}";
//            } else {
//                str += "{" + curRef.data.toString() + "}, ";
//            }

            str += "{" + curRef.data.toString() + "}";
        }

        str += "]";


        return str;

    }

    /**
     *
     * @author Aishwarya_Bommisetty
     *
     * @param <R> is the data to be stored
     */
    class Node<R extends Comparable<R>> {
        /**
         * data that needs to be stored in the node.
         */
        private R data;
        /**
         *
         * @return data
         */
        public R getData() {
            return data;
        }
        /**
         *
         * @param input data that needs to be stored in the node
         */
        public void setData(final R input) {
            this.data = input;
        }
        /**
         * next node of the present node.
         */
        private Node<R> next;
        /**
         *
         * @return Node<R> the node next to the present node.
         */
        public Node<R> getNext() {
            return next;
        }
        /**
         *
         * @param nextNode next node.
         */
        public void setNext(final Node<R> nextNode) {
            this.next = nextNode;
        }

        /**
         *
         * @param d data for the node
         */
        Node(final R d) {
            data = d;
            next = null;
        } // Constructor
    }
}
