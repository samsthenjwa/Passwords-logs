import org.junit.Assert;
import org.junit.Test;

public class PasswordTester {
    @Test
    public void PasswordLength() {// We test if we have a password that meet our requirements
        Validator passwordChecker = new Validator();
        String password="Mhalt4@y";
        Assert.assertEquals(passwordChecker.passwordIsValid(password),"The password is correct");
    }

    @Test
    public void PasswordUpperCase() {// We test if we have a password that doesn't have upper cases
        Validator passwordChecker = new Validator();
        String password="mhalt4@y";
        Assert.assertEquals(passwordChecker.passwordIsValid(password),"Password requirements not me");
    }

    @Test
    public void PasswordLowerCase() {// We test if we have a password that doesn't have lower cases
        Validator passwordChecker = new Validator();
        String password="MHALT4@Y";
        Assert.assertEquals(passwordChecker.passwordIsValid(password),"Password requirements not me");
    }

    @Test
    public void PasswordSpecialChar() {// We test if we have a password that doesn't have special character
        Validator passwordChecker = new Validator();
        String password="mhalt4ay";
        Assert.assertEquals(passwordChecker.passwordIsValid(password),"Password requirements not me");
    }

    @Test
    public void PasswordDigit() {// We test if we have a password that doesn't have digits
        Validator passwordChecker = new Validator();
        String password="Mhaltu@y";
        Assert.assertEquals(passwordChecker.passwordIsValid(password),"Password requirements not me");
    }
}
