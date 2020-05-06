package TestPackage;

import Settings.UserNameAndPassword;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YourTest {

    /*
        Given before class

              Do not change the before class
    */

    @Before
    public void beforeClass(){

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        userNameAndPassword.addUserToList();

    }

    /*

    YOUR CODE IS STARTING HERE

    Test the UserNameAndPassword class setUsername method

    Check all the possible options.

    NOTE :  For each possibility you need to create a different @Test method
    For Example  one of the condition is if the UserNameLists has myusername , you are supposed to create your test case for this.
    You will do the same approach for each condition of the both methods.

     */

}
