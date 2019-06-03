import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before

    public void setUp() {
        director = new Director("Duncan", "DMM433527", 60000, "software", 500000);
    }

    @Test
    public void hasName() {
        assertEquals("Duncan", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("DMM433527", director.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(60000, director.getSalary(), 1);
    }

    @Test
    public void hasDept() {
        assertEquals("software", director.getDeptName());
    }

    @Test
    public void canGetPayrise() {
        director.raiseSalary(1000);
        assertEquals(61000, director.getSalary(), 1);
    }

    @Test
    public void canGetBonus() {
        assertEquals(600, director.payBonus(),1);
    }

    @Test
    public void canGetBudget() {
        assertEquals(500000, director.getBudget(), 1);
    }

    @Test
    public void fatCatBonus() {
        assertEquals(1200, director.payBonus(), 1);
    }
}
