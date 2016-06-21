package utilities;

class ListElementSL<D> {
    protected D data;
    protected ListElementSL<D> next;
    
    ListElementSL(D data) {
        this(data,null);
    }
    
    ListElementSL(D data, ListElementSL<D> next) {
        this.data = data;
        this.next = next;
    }
    
    ListElementSL<D> next() {
        return next;
    }
    
    void setNext(ListElementSL<D> next) {
        this.next = next;
    }
    
    D data() {
        return data;
    }
    
    void setData(D data) {
        this.data = data;
    }
    
    public String toString() {
        return "<ListElementSL: "+data()+">";
    }
}

