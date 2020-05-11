package bankAccount;

public class Account {

    /*
        Create a static method name is deposit
        parameters are two int(int accountAmount , int amountToAdd)
        return type is int

        add amountToAdd to accountAmount

     */

//


    /*
         Create a static method name is withDraw
         parameters are two int(int accountAmount , int withdrawAmount)
         return type is int

         remove the withdrawAmount from the  accountAmount

      */



    /*
        Create a method name is transferOtherUser
        Parameters are 2 objects of Users class(Users  sendingUser , Users receivingUser )and one int (transferAmount)

        if the transferAmount is greater  than amountAccount1 variable of the object sendingUser
        Then return Sender is poor lol :)

       if the transferAmount is smaller than amountAccount1 variable of the object sendingUser
            Remove 2 percent from the transferAmount
            remove the transferAmount from the sendingUser amountAccount1( you need to use withDraw method)
            add the transferAmount to the receivingUser  amountAccount1 (you need to use deposit method)
        Then return "Transaction is completed successfully"

        For example:
        SendingUser amountAccount1 has 1000 dollar
        receiving user amountAccount1 has 200 dollar

        transferAmount 100
        After the transaction SendingUser amountAccount1 should have 902 dollor
        After the transaction receivingUser amountAccount1 should have 298 dollor

     */




    /*
       Create a static method name is transferToOwnAccount
       parameter is One Users object(you can put any name) , one int transferAmount
       return type is String

       if the transferAmount is greater than variable amountAccount1 of the object of Users
        return "You need more money dude"

       if the transferAmount is smaller than variable amountAccount1 of the object of Users
          remove the transferAmount from variable amountAccount1 of the object of Users  (use withDraw method)
          add transferAmount to variable amountAccount2 of the object of Users   (use deposit method)

        return "Transaction is completed successfully"

     */


}












