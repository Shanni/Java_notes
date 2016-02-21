public class ZigzagIterator {
        int next;
        int l=0;
        Iterator<Integer> v1, v2;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.v1=v1.iterator();
        this.v2=v2.iterator();
       
    }

    public int next() {
        if (l==0 && v1.hasNext()){
            next=v1.next();
            l=1;
        }
        else if (l==1 && v2.hasNext()){
            next=v2.next();
            l=0;
        }
        else if(l==0 && !v1.hasNext()){
            next=v2.next();
            l=0;
        }
        else if(l==1 && !v2.hasNext()){
            next=v1.next();
            l=1;
        }
        
        return next;
    }

    public boolean hasNext() {
     
        return (v1.hasNext() || v2.hasNext());
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */
