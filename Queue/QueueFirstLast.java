package Queue;



public class QueueFirstLast<E> implements Queueable<E> {
    private Node<E> first;
    private Node<E> last;
    public QueueFirstLast(){
        this.first = null;
        this.last = null;
    }
    @Override
    public boolean isEmpty() {
       return (this.first == null);
    }
    @Override
    public void dequeueAll() {
        this.first=null;
        this.last =null;

    }
    @Override
    public E peek() throws QueueException {
        if (this.isEmpty())
        throw new QueueException("Queue is empty.");
    else {
        return this.first.getItem;
    }
    }
    @Override
    public void enqueue(E newItem) {
        Node<E> newNode = new Node<E>(newItem);

        if (isEmpty())
       this.first = newNode;
       
    }else{
        Node<E> newNode;
        this.last.setNext(newNode);
        
        
    }
    this.last = newNode;
    }
    }
    @Override
    public E dequeue() throws QueueException {
        if(isEmpty())
        throw new QueueException("empty");
        else{
            E returnfirst = this.first.getItem();
            this.first = (Node<E>) this.first.getNext();

            return returnfirst;

        }
    }

    @Override
    public String toString() {
        String  s= "[";
        Node<E> current = this.first;
        while(current != null){
            s = s+current.getItem().toString();
            if (current.getNext()!= null)
            s+=",";
            current = current.getNext();
        }
        return s+ "]";
    

        
    }
    
}
