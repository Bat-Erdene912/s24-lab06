package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- SortedIntList-ийг дотор нь агуулж, нэмэлт функцийг гүйцэтгэнэ.
 * Нийт хэдэн удаа нэмэх үйлдэл хийгдсэнийг тооцоолно.
 *
 * @author Nora Shoemaker
 */
public class DelegationSortedIntList implements IntegerList {
    private SortedIntList list; // Бүрдмэл байдлаар ашиглах үндсэн жагсаалт
    private int totalAdded;

    /**
     * Шинэ хоосон SortedIntList үүсгэнэ.
     */
    public DelegationSortedIntList() {
        list = new SortedIntList(); // Дотор нь хадгалах
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
        totalAdded++;
        return list.add(num); // Бүрдмэл байдлаар дуудаж нэмэх
    }

    /**
     * Нийт хэдэн удаа нэмэлт оролдлого хийгдсэн болохыг буцаана.
     *
     * @return нийт нэмсэн тоо
     */
    public int getTotalAdded() {
        return totalAdded;
    }

    // IntegerList интерфэйсийн бусад функцуудыг SortedIntList-ээр дамжуулж гүйцэтгэх
    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public boolean remove(int num) {
        return list.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList otherList) {
        return list.removeAll(otherList);
    }

    @Override
    public boolean addAll(IntegerList otherList) {
        return list.addAll(otherList);
    }

    @Override
    public int size() {
        return list.size();
    }
}
