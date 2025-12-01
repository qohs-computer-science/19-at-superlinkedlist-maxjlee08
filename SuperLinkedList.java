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
        return null;
    }

    public LinkedList<String> concatenateStrings() {

        return null;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {

        return null;
    }

    public String toString() {

        return "";
    }
} // end SuperLinkedList