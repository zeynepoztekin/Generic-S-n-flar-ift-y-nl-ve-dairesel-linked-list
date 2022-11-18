public class MyNode <T>{
    T data;
    MyNode<T> prev;
    MyNode<T> next;

    public MyNode() {
        data = null;
        prev = null;
        next = null;
    }

    public MyNode(T data) {
        this.data = data;
    }

    public MyNode(T data, MyNode<T> prev, MyNode<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
