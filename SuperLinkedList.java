//Max Lee
//12/8/25
import java.util.LinkedList;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
        Iterator<String> iter = this.iterator();
        boolean removed = false;
        while(iter.hasNext()){
            String x = iter.next();
            if("AEIOUaeiou".contains(x))
            {
                iter.remove();
                removed = true;
    
            }
        }
        return removed;
    }

    public boolean removeConsonants() {
        Iterator<String> iter = this.iterator();
        boolean removed = false;
        while(iter.hasNext()){
            String x = iter.next();
            if (!"AEIOUaeiou".contains(x)){
                iter.remove();
                removed = true;
            }
        }
        return removed;
    }

    public LinkedList<String> removeDuplicates() {
        LinkedList<String> dupe = new LinkedList<>();
        Iterator<String> iter = this.iterator();
        while (iter.hasNext()){
            String x = iter.next();
            if (!dupe.contains(x)){
                dupe.add(x);
                    }
            else{
                iter.remove();
                }
                
            }
            return dupe;
        }
       
    

    public LinkedList<String> concatenateStrings() {
        LinkedList<String> concat = new LinkedList<>();
        Iterator<String> iter = this.iterator();
        String running = "";

        while(iter.hasNext()){
            running += iter.next();
            concat.add(running);
        }
        return concat;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {
        LinkedList<String> mixed = new LinkedList<>();
        Iterator<String> iter1 = this.iterator();  
        Iterator<String> iter2 = this.iterator();   

        while(iter1.hasNext() && iter2.hasNext()){
            mixed.add(iter1.next());
            mixed.add(iter2.next());
        }
        return mixed;
    }

    public String toString() {
        String x = "";
        Iterator<String> iter = this.iterator();

        while(iter.hasNext()){
            String y = iter.next();
            x += y + " ";
        }
        if(iter.hasNext()){
            x += ", ";
        }
    
        return x;
    }
} // end SuperLinkedList