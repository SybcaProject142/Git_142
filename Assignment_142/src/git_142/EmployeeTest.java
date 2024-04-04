package git_142;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void testCalculateDA() {
        Employee emp = new Employee("Melanie Doel", "Software Engineer", 80000);
        double expectedDA = 5000; // 10% of basic salary (50000)
        emp.calculateAndUpdateSalary();
        assertEquals(expectedDA, emp.getBasicSalary() * 0.10, 0.001);
    }
}
