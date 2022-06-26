package com.company.ext.lessons4.reader;

import java.awt.print.Book;

public class Reader {
    private String fio;
    private int number;
    private String faculty;
    private String dateOfBirth;
    private int phone;

    public Reader(String fio, int number, String faculty, String dateOfBirth, int phone) {
        this.fio = fio;
        this.number = number;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public Reader() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void takeBook(int number) {
        System.out.print(this.fio + " взял " + number);
        {
            switch (number) {
                case 1:
                    System.out.println(" книгу");
                    break;
                case 2:
                    System.out.println(" книги");
                    break;
                default:
                    System.out.println(" книг");
                    break;
            }
        }System.out.println();
    }
    public void takeBook(String...books){
        System.out.println(this.fio + " взял");
        for (String book : books){
            System.out.println(book);
        }
        System.out.println();
    }
    public void takeBook(Book... books){
        System.out.println(this.fio + " взял");
        for (Book book : books){
            System.out.println(" , автор ");
        }
        System.out.println();
    }
    public void returnBook(int number) {
        System.out.print(this.fio + " вернул " + number);
        {
            switch (number) {
                case 1:
                    System.out.println(" книгу");
                    break;
                case 2:
                    System.out.println(" книги");
                    break;
                default:
                    System.out.println(" книг");
                    break;
            }
        }System.out.println();
    }
    public void returnBook(String...books){
        System.out.println(this.fio + " вернул");
        for (String book : books){
            System.out.println(book);
        }
        System.out.println();
    }
    public void returnBook(Book...books){
        System.out.println(this.fio + " вернул");
        for (Book book : books){
            System.out.println(" , автор ");
        }
        System.out.println();
    }
    @Override
    public String toString() {
        return
                "fio='" + fio + '\'' +
                ", number=" + number +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phone=" + phone;
    }

}
