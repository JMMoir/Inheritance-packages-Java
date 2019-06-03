import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before

    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Malcolm", "MMA304931", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Malcolm", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("MMA304931", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, databaseAdmin.getSalary(), 1);
    }

    @Test
    public void canGetPayrise() {
        databaseAdmin.raiseSalary(1000);
        assertEquals(26000, databaseAdmin.getSalary(), 1);
    }

    @Test
    public void canGetBonus() {
        assertEquals(250, databaseAdmin.payBonus(),1);
    }
}
