package DSA.corejava;

//Q9_ExamEvaluation.java

interface EvaluationService {
 void evaluate(int marks) throws InvalidMarksException;
}

abstract class ExamEvaluation implements EvaluationService {
 private String studentId;
 private String studentName;
 private int marks;

 protected void setMarks(int m) {
     marks = m;
 }
}

class ObjectiveExam extends ExamEvaluation {
 public void evaluate(int marks) throws InvalidMarksException {
     if (marks < 0 || marks > 100)
         throw new InvalidMarksException("Invalid marks");
     setMarks(marks);
 }

 public void evaluate(int marks, boolean recheck)
         throws InvalidMarksException {
     evaluate(marks);
 }
}

class SubjectiveExam extends ExamEvaluation {
 public void evaluate(int marks) throws InvalidMarksException {
     if (marks < 0 || marks > 100)
         throw new InvalidMarksException("Invalid marks");
     setMarks(marks);
 }
}

class InvalidMarksException extends Exception {
 public InvalidMarksException(String msg) {
     super(msg);
 }
}

class ResultTamperingException extends RuntimeException {
 public ResultTamperingException(String msg) {
     super(msg);
 }
}

public class Q9_ExamEvaluation {
 public static void main(String[] args) throws InvalidMarksException {
     EvaluationService exam = new ObjectiveExam();
     exam.evaluate(85);
 }
}

