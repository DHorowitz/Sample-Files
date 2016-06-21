package utilities;
import java.util.Iterator;

public class ListSL<D> implements List<D> {
    protected int count;
    protected ListElementSL<D> head;
    protected ListElementSL<D> tail;
    
    public ListSL() {
        head = null;
        tail = null;
        count = 0;
    }
    
    public void add(D data) {
        addToTail(data);
    }
    
    public void addToHead(D data) {
        head = new ListElementSL<D>(data, head);
        if (tail==null) {
            tail = head;
        }
        count++;
    }
    
    public D removeFromHead() {
        ListElementSL<D> temp = head;
        head = head.next();
        if (head==null) {
            tail = null;
        }
        count--;
        return temp.data();
    }
    
    public void addToTail(D data) {
        ListElementSL<D> newTail = new ListElementSL<D>(data);
        if (tail!=null) {
            tail.setNext(newTail);
        } else {
           head = newTail; 
        }
        tail = newTail;
        count++;
    }
    
    public D removeFromTail() {
        ListElementSL<D> current = head;
        ListElementSL<D> previous = null;
        while (current!=tail) {
            previous = current;
            current = current.next();
        }
        if (previous == null) {
            head = null;
            tail = null;
        } else {
            previous.setNext(null);
            tail = previous;
        }
        count--;
        return current.data();
    }
    
    public D headPeek() {
        return head.data();
    }
    
    public D tailPeek() {
        return tail.data();
    }
    
//    public boolean contains(D data) {
//        ListElementSL<D> current = head;
//        while (current != null && !current.data().equals(data)) {
//            current = current.next();
//        }
//        return current != null;
//    }
    
    public boolean contains(D data) {
        return containsHelper(data,head);
    }   
    
    private boolean containsHelper(D data, ListElementSL<D> node) {
        if (node==null) 
            return false;
        else if (node.data().equals(data)) 
            return true;
        else return containsHelper(data,node.next());
    }
    
    public D remove(D data) {
        ListElementSL<D> current = head;
        ListElementSL<D> previous = null;
        while (current != null && !current.data().equals(data)) {
            previous = current;
            current = current.next();
        }
        if (current != null) {
            if (current == head) { // Deleting head.
                head = current.next();
                if (current == tail) {   // Deleting head and tail.
                    tail = null;
                }
            } else {
                if (current == tail) { // Deleting tail.
                    tail = previous;
                    tail.next = null;
                } else {
                    previous.setNext(current.next()); // Deleting in middle.
                }
            }
            count--;
            return current.data();
        }
        return null;
    }
      
    public int size() {
        return count;
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public void clear() {
        head = null;
        count = 0;
    }
    
    public void append(ListSL<D> otherList) {
        while (!otherList.isEmpty()) {
            this.addToTail(otherList.removeFromHead());
        }
    }
    

    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("<ListSL:");
        ListElementSL<D> current = head;
        while (current!=null) {
            s.append(" "+current.data()+"");
            current = current.next();
        }
        s.append(">");
        return s.toString();
    }
   
    public ListSL<D> comprehension(Predicate<D> pred)
    {
        ListElementSL<D> holder = head;
        ListSL<D> temp = new ListSL<D>();
        if(pred.satisfies(this.headPeek())){temp.addToHead(this.headPeek());}
        do{
            if(pred.satisfies(head.next.data())){temp.addToTail(head.next.data());}
            head = head.next();
        } while(head != tail);
        head = holder;
        return temp;
    }
    
}





