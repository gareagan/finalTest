package DataStructures;

public class LinkedListNode<T> {

    //Instance variable
    //Data stored in node can be of any type
    private T value;

    //Instance variable
    //Contains a reference to the next node on the LL.
    //Contains null if it is the last node in the LL.
    // - The type LinkedListNode<T> allows next to hold references to other nodes in LL
    private LinkedListNode<T> next;

    //Constructor
    //Takes 2 parameters when called.
    //Creates nodes in a LL and initializes the instance variables inside them.
    public LinkedListNode(T val, LinkedListNode<T> next) {

        // - Initializes the current nodes value to be the value that is passed
        this.value = val;

        // - Initializes the current node to hold a reference to the node passed.
        // - LL are created from end of list so first constructor call will pass the next as null.
        // - From then on the next will be passed as the next nodes obj name.
        this.next = next;
    }

    // - Returns the data stored in current node.
    public T getValue()
    {
        // - Returns the data stored in current node.
        return this.value;
    }

    // - Passes through a node of any data type
    // - This node is the node that wanted as the next node.
    public void setNext(LinkedListNode<T> node)
    {
        // - // - Changes the current nodes reference to the node that is passed through reference.
        this.next = node;
    }

    // - No parameters
    // - Used to return the next node in a LL
    public LinkedListNode<T> getNext()
    {
        // - Instance variable of type LinkedListNode<T>
        // - The instance variable next contains a reference to the next node on the LL
        // - Returns reference to the next node in a LL.
        return this.next;
    }


    public int size()
    {
        if (this.next == null) {
            return 1;
        } else {
            return 1 + this.next.size();
        }
    }

    public String toString() {
        String out = "";
        out += this.value;
        if (this.next != null) {
            out += this.next.toString() + " ";
        }
        return out;
    }

    public LinkedListNode<T> getElement(T value) {
        if (this.value.equals(value)) {
            return this;
        } else if (this.next == null) {
            return null;
        } else {
            return this.next.getElement(value);
        }
    }

    public void append(T value) {
        if (this.next == null) {
            this.next = new LinkedListNode<>(value, null);
        } else {
            this.next.append(value);
        }
    }

    public void insert(T value, int loc) {
        if (loc == 0) {
            this.next = new LinkedListNode<>(this.value, this.next);
            this.value = value;
        } else {
            this.next.insert(value, loc - 1);
        }
    }

}
