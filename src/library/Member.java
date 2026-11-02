package library;

public class Member {
    private String name;
    private int memberNumber;
    Book borrowedBook;

    public Member(String name, int memberNumber) {
        this.name = name;
        this.memberNumber = memberNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", memberNumber=" + memberNumber +
                ", borrowedBook=" + borrowedBook +
                '}';
    }
}
