
package com.mycompany.st10251759_poe_p1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LoginTest {
    
    public LoginTest() {
    }

    Login login = new Login("Cameron", "Chetty");

    /**
     * test the validity of the username method --> checkUserName() if it is true
     */
    @Test
    public void testCheckUserNameCorrect() {
    login.setUserName("kyl_1");
        boolean Actual = login.checkUserName();
        boolean Expected = true;
    
        assertEquals(Expected, Actual);
    }

    //test the validity of the username methodm --> checkUserName() if it is false
    @Test
    public void testCheckUserNameInCorrect() {
        login.setUserName("kyle!!!!!");
        boolean Actual = login.checkUserName();
        boolean Expected = false;
    
        assertEquals(Expected, Actual);
    }
     /**
     * Test of checkPasswordComplexity method Correct, of class Login.
     */
    @Test
    public void testCheckPasswordComplexityCorrect() {
       login.setPassword("Ch&&sec@ke99!");
       boolean Actual = login.checkPasswordComplexity();
       boolean Expected = true;
    
        assertEquals(Expected, Actual);
    }
     /**
     * Test of checkPasswordComplexity method InCorrect, of class Login.
     */
    @Test
    public void testCheckPasswordComplexityInCorrect() {
       login.setPassword("password");
       boolean Actual = login.checkPasswordComplexity();
       boolean Expected = false;
    
        assertEquals(Expected, Actual);
    }

    



    
}
