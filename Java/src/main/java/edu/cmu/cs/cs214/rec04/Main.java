package edu.cmu.cs.cs214.rec04;

public class Main {

    public static void main(String[] args) {

        // IntegerList list1;
        IntegerList list1;
        IntegerList list2;

        // Create instances of InheritanceSortedIntList
        list1 = new InheritanceSortedIntList();
        list2 = new InheritanceSortedIntList();

        // Add 5 elements to our first list.
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        printList(list1);
        // Since list1 is InheritanceSortedIntList, we can cast it to access getTotalAdded
        if (list1 instanceof InheritanceSortedIntList) {
            System.out.println("Total Added in list1: " + ((InheritanceSortedIntList) list1).getTotalAdded());
        }

        // Add 2 elements to the second list.
        list2.add(3);
        list2.add(0);

        // Add all elements from list1 to list2
        list2.addAll(list1);

        printList(list2);
        // Similarly, get the totalAdded for list2
        if (list2 instanceof InheritanceSortedIntList) {
            System.out.println("Total Added in list2: " + ((InheritanceSortedIntList) list2).getTotalAdded());
        }
    }

    /**
     * A helper function that prints out the contents of an IntegerList.
     */
    private static void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }
}
