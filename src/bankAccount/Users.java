package bankAccount;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Users {

    /*
        Create String variable name password dateOfBirth marriageStatus  relativeName relativeAge isTransferedSuceesfully
        Create int  accountNumber amountAccount1 accountNumber2 amountAccount2

        all public
     */



    /*
    Create a constructor
    Parameters are String name , passwod , dateOfBirth , marriageStatus
    Int amountAccount1 , amountAccount2

    variable name equal to parameter name
    same for password
    same for amountAccount1
    same for amountAccount2

    Following also in the constructor

    variable accountNumber get the the number from the  randomNumberCreader method
    variable accountNumber2 get the the number from the  randomNumberCreader method
    variable marriageStatus equal to CheckMariageStatus method return
    variable dateOfBirth equal to checkAge return

     */


    /*
        Create method name is  CheckMariageStatus
        parameter is String(marriageStatus)
        return type is String

        if String marriageStatus is married

        Ask to user (use scanner class)
        Do you want to add add your relative?

        if the user say Yes
        Then Add the relative(Use AddRelative class )
        relativeName variable equal to AddRelative class fullName
        relativeAge variable equal to AddRelative class age

        If the user say No
        then no need to add anything.
     */

    /*
        Create a static method name is checkAge
        parameter is one String(myDOB)
        return type is String

        Compare today date to myDOB

        if myDOB compare to today date is 18 then return "You can get a credit card"

        if myDOB compare to today date is less then 18 "You should be at least 18 years old to get a credit card."

        For example today date is 10/05/2020

        if myDOB is 09/05/2002

        return should be  "You can get a credit card"

        if myDOB is 11/05/2002

        return should be  "You should be at least 18 years old to get a credit card."

     */

    /*
        Create a Random number which is returning 8 digit number

            it should be between 10000000 - 99999999

     */

    /*
        Create a method name is transfer
        Parameters are two Users object
        Return type is void

        In this method
             First ask to user "Do you want to transfer between your accounts or different user" (use scanner class)

        if the answer is own
            Call the method transferToOwnAccount in the Account class

        if the answer different
            Call the method transferOtherUser in the Account class
     */

    /*
        Print the object using toString method

        like
         return "\nname: " + name +
                "\npassword: " + password+
                "\ndateOfBirth: " + dateOfBirth+
                ......

     */




}
