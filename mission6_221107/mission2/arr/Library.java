package mission6_221107.mission2.arr;

import java.util.Arrays;

public class Library {
    private Book[] bookList = new Book[0];

    protected void addBook(Book newBook) {
        Book[] newBookList = new Book[this.bookList.length + 1];
        for (int i = 0; i < this.bookList.length; i++) {
            newBookList[i] = bookList[i];
        }
        newBookList[this.bookList.length] = newBook;
        this.bookList = newBookList;
    }

    protected void addBook(Book[] newBookList) {
        Book[] mergedBookList = new Book[this.bookList.length + newBookList.length];
        for (int i = 0; i < this.bookList.length; i++) {
            mergedBookList[i] = bookList[i];
        }
        for (int i = 0; i < newBookList.length; i++) {
            mergedBookList[i] = newBookList[i];
        }
        this.bookList = mergedBookList;
    }

    protected void copyBookList(Library library) {
        this.bookList = library.bookList.clone();
    }

    protected Book[] makeCopy() {
        return this.bookList;
    }

    protected void modifyBook(Book newBook, int order) {
        this.bookList[order-1] = newBook;
    }

    protected void printBookList() {
        if(bookList.length == 0 ) {
            System.out.println("현재 보관중인 도서가 없습니다.");
            return;
        }
        System.out.println(Arrays.toString(bookList));
    }

    protected Book findBookByName(String name) {
        for(Book book : this.bookList) {
            if(book.isRightName(name)){
                return book;
            }
        }
        System.out.println("목록에 해당하는 장서가 없습니다.");
        return null;
    }
}
