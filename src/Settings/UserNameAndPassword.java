package Settings;

import org.junit.Assert;

import java.util.ArrayList;

public class UserNameAndPassword {

    /*
        DO NOT CHANGE THE addUserToList METHOD

        addUserToList is adding default email address to the UserNameLists

     */

    public void addUserToList(){
        UserNameLists.add("Steven@gmail.com");
        UserNameLists.add("James@hotmail.com");
        UserNameLists.add("David@gmail.com");
        UserNameLists.add("Jerry@hotmail.com");
        UserNameLists.add("Emily@yahoo.com");
        UserNameLists.add("Barbara@gmail.com");
    }


    /*
        Given constructor. Parameter is String Username , String Password. This constructor calling the setUsername and setPassword methods.

     */
    public UserNameAndPassword(String Username , String Password){
        setUsername(Username);
        setPassword(Password);
    }

    /*
        Given default constructor.
     */

    public UserNameAndPassword(){

    }

     /*
        Create a private String userName and password

        Create a Arraylist . Arraylist type should be String. ArrayList should be static . Name is UserNameLists

     */



    /*
        Create a method name is setUsername
        return type is String
        parameter is String(myUsername)

        if the myUsername length is less then 6
        return Username length should be more then 6

        if the myUsername contains space(" ")
        return  Username should not contain space

        if the myUsername does NOT contains @
        return Username should contain @ symbol

        if the UserNameLists has myusername
        return Username should be unique

        if all these are false
        private userName = myUsername

        and return the username

    */


    /*
    Create a method name is setPassword
    Return type is String
    Parameter is String(myPassword)

    if myPassword length is less or equal then 5
    return  Password length more then 5 character

    if first condition is false
    private password variable is equal to myPassword

    and return the myPassword

     */



}
