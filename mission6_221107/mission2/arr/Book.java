package mission6_221107.mission2.arr;

public class Book {
    private String name;
    private String writer;

    protected Book(String name, String writer) {
        this.name = name;
        this.writer = writer;
    }

    protected Boolean isRightName(String name) {
        return name.equals(this.name);
    }

    @Override
    public String toString() {
        return String.format("{%s, %s}", this.name, this.writer);
    }
}
