public class MyDoublyCircularLinkedList <T>{
    MyNode<T> head;
    public void insert(int index , T data) {
        if (index <= 0){
            System.out.println("insert failed");
            return;
        }
        if (index == 1) {
            if (head == null){
                MyNode<T> newNode = new MyNode<>(data);
                newNode.next = newNode.prev = newNode;
                head = newNode;
            }
            else {
                MyNode<T> newNode = new MyNode<>(data, head.prev, head);
                head.prev.next = newNode;
                head.prev = newNode;
                head = newNode;
            }
            return;
        }
        MyNode<T> iter = head;
        for (int i = 1; i < index-1; iter = iter.next, i++) {
            if (iter == null || iter == head && i != 1){
                System.out.println("insert failed");
                return;
            }
        }
        MyNode<T> newNode = new MyNode<>(data, iter, iter.next);
        iter.next.prev = newNode;
        iter.next = newNode;
    }

    public void reverseInsert(int index, T data){
        if (index <= 0){
            System.out.println("reverseInsert failed");
            return;
        }
        if (head == null && index == 1) {
            MyNode<T> newNode = new MyNode<>(data);
            newNode.next = newNode.prev = newNode;
            head = newNode;
            return;
        }
        MyNode<T> iter = head;
        for (int i = 1; i < index-1; iter = iter.prev, i++) {
            if (iter == null || iter == head && i != 1){
                System.out.println("reverseInsert failed");
                return;
            }
        }
        MyNode<T> newNode = new MyNode<>(data, iter.prev, iter);
        iter.prev.next = newNode;
        iter.prev = newNode;
    }
    public void remove(int index){
        if (index <= 0){
            System.out.println("remove failed");
            return;
        }
        MyNode<T> iter = head;
        for (int i = 1; i < index; iter = iter.next, i++) {
            if (iter == null || iter == head && i != 1){
                System.out.println("remove failed");
                return;
            }
        }
        if (index == 1){
            head = head.next;
        }
        iter.prev.next = iter.next;
        iter.next.prev = iter.prev;
        iter.next = null;
        iter.prev = null;
    }
    public void reverseRemove(int index){
        if (index <= 0){
            System.out.println("reverseRemove failed");
            return;
        }
        MyNode<T> iter = head;
        for (int i = 1; i < index + 1; iter = iter.prev, i++) {
            if (iter == null || iter == head && i != 1){
                System.out.println("reverseRemove failed");
                return;
            }
        }
        if (index == 1){
            head = head.next;
        }
        iter.prev.next = iter.next;
        iter.next.prev = iter.prev;
        iter.next = null;
        iter.prev = null;
    }
    public void search(T data){
        int i = 1;
        for (MyNode<T> iter = head; ; iter = iter.next, ++i) {
            if (iter == null || iter == head && i != 1){
                System.out.println("search failed");
                return;
            }
            if (iter.data.equals(data)) {
                System.out.println(i);
                return;
            }
        }

    }

    public void print(int index){
        if (index <= 0){
            System.out.println("print failed");
            return;
        }
        MyNode<T> iter = head;
        for (int i = 1; i < index; i++) {
            iter = iter.next;
            if (iter == head) {
                System.out.println("print failed");
                return;
            }
        }
        System.out.println(iter.data);
    }
    public void printAll(){
        String elements = "";
        if (head == null){
            System.out.println("printAll failed");
            return;
        }
        for (MyNode<T> iter = head; iter.next != null && iter.next != head; iter = iter.next) {
            elements += iter.data + " ";
        }
        System.out.println(elements + head.prev.data);
    }



    public void reversePrintAll(){
        String elements = "";
        if (head == null){
            System.out.println("reversePrintAll failed");
            return;
        }
        for (MyNode<T> iter = head; iter.prev != null && iter.prev != head; iter = iter.prev) {
            elements += iter.prev.data + " ";
        }
        System.out.println(elements + head.data);
    }
}
