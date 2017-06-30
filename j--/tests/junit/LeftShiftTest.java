package junit;

import junit.framework.TestCase;
import pass.LeftShift;

public class LeftShiftTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testLeftShift() {
        this.assertEquals(LeftShift.lshift(10, 3), 80);
		this.assertEquals(LeftShift.lshift(0, 0), 0);
		this.assertEquals(LeftShift.lshift(1, 1), 2);
		this.assertEquals(LeftShift.lshift(1, 2), 4);
		this.assertEquals(LeftShift.lshift(1, 0), 1);	
		this.assertEquals(LeftShift.lshift(1, 3), 8);	
    }

}
