import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentTest {

    public void newStudentTest()
    {
        Student student = new Student("Pino", "Lino");

        Assert.assertEquals("Pino", student.getFirstName());
        Assert.assertEquals("Lino", student.getLastName());

        Assert.assertTrue(student.getExams().isEmpty());

    }

    public void oneExamTest()
    {
        Student student = new Student("Pino", "Lino");

        Exam Esame = new Exam("OOP", new GregorianCalendar(2023, Calendar.JANUARY, 10), 30);
        student.registerExam(Esame);

        Assert.assertEquals(1, student.getExams().size(), 0);
        Assert.assertEquals(30, student.computeAverageGrade(), 0);
    }

    public void TwoExamTest()
    {

        Student student = new Student("Pino", "Lino");

        Exam esame1 = new Exam("SO", new GregorianCalendar(2023, Calendar.JANUARY, 12), 25);

        Exam esame2 = new Exam("BdD", new GregorianCalendar(2023, Calendar.JANUARY, 11), 28);

        student.registerExam(esame1);
        student.registerExam(esame2);

        Assert.assertEquals(2, student.getExams().size(),0);
        Assert.assertEquals(26.5, student.computeAverageGrade(),0);


    }
}