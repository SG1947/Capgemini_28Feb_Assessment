package DSA.corejava;

//Q8_LibrarySystem.java

interface BookOperations {
 void issueBook() throws InvalidBookOperationException;
 void returnBook() throws InvalidBookOperationException;
}

abstract class LibraryAccount implements BookOperations {
 private String memberId;
 private String memberName;
 private int issuedBooks;

 protected int getIssuedBooks() {
     return issuedBooks;
 }

 protected void increment() {
     issuedBooks++;
 }

 protected void decrement() {
     issuedBooks--;
 }
}

class StudentMember extends LibraryAccount {
 public void issueBook() throws InvalidBookOperationException {
     if (getIssuedBooks() >= 3)
         throw new BookLimitExceededException("Limit exceeded");
     increment();
 }

 public void returnBook() throws InvalidBookOperationException {
     if (getIssuedBooks() <= 0)
         throw new InvalidBookOperationException("No books to return");
     decrement();
 }
}

class FacultyMember extends LibraryAccount {
 public void issueBook() {
     increment();
 }

 public void returnBook() throws InvalidBookOperationException {
     if (getIssuedBooks() <= 0)
         throw new InvalidBookOperationException("No books");
     decrement();
 }
}

class InvalidBookOperationException extends Exception {
 public InvalidBookOperationException(String msg) {
     super(msg);
 }
}

class BookLimitExceededException extends RuntimeException {
 public BookLimitExceededException(String msg) {
     super(msg);
 }
}

public class Q8_LibrarySystem {
 public static void main(String[] args) throws InvalidBookOperationException {
     BookOperations acc = new StudentMember();
     acc.issueBook();
 }
}
