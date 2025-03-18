package edu.cmu.cs.cs214.rec04;

import java.util.ArrayList;

/**
 * InheritanceSortedIntList -- SortedIntList-ийн удамшсан хувилбар.
 * Нийт хэдэн удаа нэмэх үйлдэл хийгдсэнийг тооцоолно.
 * 
 * @author Nora Shoemaker
 */
public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded; // Нийт нэмэгдсэн элементүүдийн тоо

    /**
     * Шинэ хоосон SortedIntList үүсгэнэ.
     */
    public InheritanceSortedIntList() {
        super(); // Эх классын constructor дуудах
        totalAdded = 0;
    }

    /**
     * Тоог нэмэхдээ нийт оролдсон тоог хадгална.
     *
     * @param num нэмэх гэж буй тоо
     * @return жагсаалт өөрчлөгдсөн эсэх
     */
    @Override
    public boolean add(int num) {
        totalAdded++; // Нийт нэмсэн тоог өсгөнө
        return super.add(num); // Эх SortedIntList-ийн add() дуудаж нэмэх
    }

    /**
     * Нийт хэдэн удаа нэмэлт оролдлого хийгдсэн болохыг буцаана.
     *
     * @return нийт нэмсэн тоо
     */
    public int getTotalAdded() {
        return totalAdded;
    }
}
