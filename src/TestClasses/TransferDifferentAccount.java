package TestClasses;

import bankAccount.Users;
import org.junit.Assert;

public class TransferDifferentAccount {

    public static void main(String[] args) {

        Users u1 = new Users("David" , "Villa", "10/02/2000", "married" ,1000 , 2000);

        Users u2 = new Users("Feti" , "Onal", "11/12/1998", "single" ,3000 , 2000);

        u1.transfer(u1,u2);

        System.out.println(u1.toString());
        System.out.println(u2.toString());

        Assert.assertTrue("result should be 608 but your result is " +u1.amountAccount1 ,u1.amountAccount1==608);
        Assert.assertTrue("result should be 3392 but your result is " +u2.amountAccount1 , u2.amountAccount1==3392 );

    /*
       Need to enter.
       Do you want to add add your relative?
            Yes
            Do you want to transfer between your accounts or different user
            No
            Enter amount of money you want to enter
            400
    */

    }
}
