import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest{

    private Manager manager;

    @Before

    public void setUp() {
      manager = new Manager("John", "JHA230931A", 34000, "software");
    }

    @Test
    public void hasName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JHA230931A", manager.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(34000, manager.getSalary(), 1);
    }

    @Test
    public void hasDept() {
        assertEquals("software", manager.getDeptName());
    }

    @Test
    public void canGetPayrise() {
        manager.raiseSalary(1000);
        assertEquals(35000, manager.getSalary(), 1);
    }

    @Test
    public void canGetBonus() {
        assertEquals(340, manager.payBonus(),1);
    }
}
