import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before

    public void setUp() {
        developer = new Developer("Claire", "CL2343", 40000);
    }

    @Test
    public void hasName() {
        assertEquals("Claire", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("CL2343", developer.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000, developer.getSalary(), 1);
    }

    @Test
    public void canGetPayrise() {
        developer.raiseSalary(1000);
        assertEquals(41000, developer.getSalary(), 1);
    }

    @Test
    public void canGetBonus() {
        assertEquals(400, developer.payBonus(),1);
    }
}
