import java.util.Iterator;
import java.util.LinkedList;

class SLLTester {
  public static void main(String[] args) {
    SuperLinkedList list1 = new SuperLinkedList();
    SuperLinkedList list2 = new SuperLinkedList();
    SuperLinkedList list3 = new SuperLinkedList();

    
    list1.add("A");
    list1.add("B");
    list1.add("C");
    list1.add("D");
    list1.add("E");
    list1.add("F");

    System.out.println("List 1:");
    Iterator <String> it1 = list1.iterator();
    while(it1.hasNext()){
      System.out.println(it1.next());
    }

    System.out.println("Remove list 1's vowels:");
    boolean removedVowels = list1.removeVowels();
    System.out.println("Are the vowels removed? " + removedVowels);
    Iterator <String> remVowel = list1.iterator();
    while(remVowel.hasNext()){
      System.out.println(remVowel.next());
    }

    list2.add("A");
    list2.add("B");
    list2.add("C");
    list2.add("D");
    list2.add("E");
    list2.add("F");

    System.out.println("___________________________________________________________________________________________");
    System.out.println("List 2:");
    Iterator <String> it2 = list2.iterator();
    while(it2.hasNext()){
      System.out.println(it2.next());
    }

    System.out.println("Remove list 2's consonants:");
    boolean removeConsonants = list2.removeConsonants();
    System.out.println("Are the consonants removed? " + removeConsonants);
    Iterator <String> remConst = list2.iterator();
    while(remConst.hasNext()){
      System.out.println(remConst.next());
    }
    
    list3.add("A");
    list3.add("A");
    list3.add("B");
    list3.add("C");
    list3.add("C");


    System.out.println("___________________________________________________________________________________________");
    System.out.println("List 3:");
    Iterator <String> it3 = list3.iterator();
    while(it3.hasNext()){
      System.out.println(it3.next());
    }

    System.out.println("Remove duplicates from list 3:");
    LinkedList<String> duplicates = list3.removeDuplicates();
    System.out.println("Duplicates removed:");
    Iterator <String> dupe = duplicates.iterator();
    while(dupe.hasNext()){
      System.out.println(dupe.next());
    }
    
    System.out.println("___________________________________________________________________________________________");
    System.out.println("Concatenate List 1:");
    LinkedList <String> concatenate = list1.concatenateStrings();
    Iterator <String> concat = concatenate.iterator();
    while(concat.hasNext()){
      System.out.println(concat.next());
    }

    System.out.println("___________________________________________________________________________________________");
    System.out.println("Mix List 1 and 2:");
    LinkedList<String> mixed = list1.mix(list2);
    Iterator<String> mix = mixed.iterator();
    while(mix.hasNext()){
      System.out.println(mix.next());
    }
    

    
  } // end main
} // end class