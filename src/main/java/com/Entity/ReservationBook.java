package com.Entity;

import java.time.LocalDate;

public class ReservationBook {
    private int id;
    private Student student;
    private Book book;
    private LocalDate nowDate;
    private LocalDate endReservation;
    private boolean stillReserve;



    public ReservationBook(int id, Student student, Book book, LocalDate nowDate, LocalDate endReservation) {
        this.id = id;
        this.student = student;
        this.book = book;
        this.nowDate = nowDate;
        this.endReservation = endReservation;
        this.stillReserve = true;

    }

    public void endReservationThisBook(){
        this.stillReserve = false;
        this.book.setReserved(false);
    }

    public LocalDate getEndReservation() {
        return endReservation;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getNowDate() {
        return nowDate;
    }

    public void setNowDate(LocalDate nowDate) {
        this.nowDate = nowDate;
    }

    public void setEndReservation(LocalDate endReservation) {
        this.endReservation = endReservation;
    }

    public boolean isStillReserve() {
        return stillReserve;
    }

    public void setStillReserve(boolean stillReserve) {
        this.stillReserve = stillReserve;
    }

}
