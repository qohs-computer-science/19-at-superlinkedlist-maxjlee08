import java.util.Iterator;

class SLLTester {
  public static void main(String[] args) {
    SuperLinkedList list1 = new SuperLinkedList();
    SuperLinkedList list2 = new SuperLinkedList();
    
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

    System.out.println("Remove the first list's vowels:");
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

    System.out.println("Remove the second list's consonants:");
    boolean removeConsonants = list2.removeConsonants();
    System.out.println("Are the vowels removed? " + removeConsonants);
    Iterator <String> remConst = list2.iterator();
    while(remConst.hasNext()){
      System.out.println(remConst.next());
    }
  } // end main
} // end class