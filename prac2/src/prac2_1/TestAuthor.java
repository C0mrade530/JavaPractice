package prac2_1;

import prac2_1.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author maisie = new Author("Leonid Bakerin", "bakerin12@gmail.com", 'm');
        System.out.println(maisie.toString());
    }
}