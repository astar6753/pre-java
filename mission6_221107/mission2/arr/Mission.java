package mission6_221107.mission2.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mission {
    //2. 객체 배열을 사용하여 다음 문제를 구현하세요
    //온마을(A) 도서관에 다음과 같이 책이 5권 있습니다.

    //책에 대한 관리를 목록으로 하고 있는데 혹시 분실 될까 복사본(A-1)을 하나 두었습니다.
    //그리고 같은 책 목록으로 두마을(B)도서관을 개관했습니다.
    //이때 책 목록 A, A-1, B 를 출력하세요
    //두 도서관의 목록이 다음과 같이 변경되었습니다.
    //온마을(A)도서관에 다음과 같이 책 목록이 변경되었습니다.

    //(수정) 3번째 목록
    //[자전거 도둑| 박완서] => [그 많던 싱아는 누가 다 먹었을까| 박완서]
    //두마을(B)도서관에 책이 추가되었습니다.
    //(추가)마지막 목록
    //[사피엔스|유발 하라리]
    //A, A-1, B 목록을 출력하세요

    public static void main(String[] args) {

        Library libraryA = new Library();
        Book[] bookList = {
            new Book("태박산맥","조정래"),
            new Book("이기적 유전자","리처드 도킨즈"),
            new Book("자전거 도둑","박완서"),
            new Book("토지","박경리"),
            new Book("대변동","제레드 다이아몬드")
        };
        libraryA.addBook(bookList);
        Book[] copyA1 = libraryA.makeCopy();

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println(list.toString());

        Library libraryB = new Library();
        libraryB.copyBookList(libraryA);

        libraryA.printBookList();
        System.out.println(Arrays.toString(copyA1));
        libraryB.printBookList();

        libraryA.modifyBook(new Book("그 많던 싱아는 누가 다 먹었을까", "박완서"), 3);
        libraryB.addBook(new Book("사피엔스","유발 하라리"));

        libraryA.printBookList();
        System.out.println(Arrays.toString(copyA1));
        libraryB.printBookList();

        System.out.println(libraryA.findBookByName("그 많던 싱아는 누가 다 먹었을까"));
    }
}
