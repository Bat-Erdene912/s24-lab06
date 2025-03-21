package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the InheritanceSortedIntList class.
 *
 * @author Nora Shoemaker
 */
public class InheritanceSortedIntListTest {

    private InheritanceSortedIntList list1;
    private InheritanceSortedIntList list2;

    /**
     * Called before each test.
     */
    @Before
    public void setUp() {
        list1 = new InheritanceSortedIntList();
        list2 = new InheritanceSortedIntList();
    }

    /**
     * Tests for the add() method.
     */
    @Test
    public void testAdd() {
        // add 5 elements to our list.
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        // check that the total number of elements added is 5.
        assertTrue(list1.getTotalAdded() == 5);

        // Optionally, print the list to visually inspect it
        printList(list1);
    }

    /**
     * Tests for the addAll() method.
     */
    @Test
    public void testAddAll() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);
    
        assertTrue(list1.getTotalAdded() == 5);
    
        list2.add(3);
        list2.add(0);
    
        assertTrue(list2.getTotalAdded() == 2);
    
        list2.addAll(list1);
    
       
        assertTrue(list2.getTotalAdded() == 7);
    }
    

    /**
     * A helper function that prints out the contents of an IntegerList.
     * @param list IntegerList to be printed out.
     */
    private void printList(InheritanceSortedIntList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
