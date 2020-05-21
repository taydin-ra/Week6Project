package bankAccount;

public class Account {

    /*
        Create a static method name is deposit
        parameters are two int(int accountAmount , int amountToAdd)
        return type is int

        add amountToAdd to accountAmount

     */

    public static int deposit(int accountAmount, int amountToAdd) {
        accountAmount += amountToAdd;
        return accountAmount;
    }

//


    /*
         Create a static method name is withDraw
         parameters are two int(int accountAmount , int withdrawAmount)
         return type is int

         remove the withdrawAmount from the  accountAmount

      */
    public static int withDraw(int accountAmount , int withdrawAmount){
        accountAmount-= withdrawAmount;
        return accountAmount;
    }




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

    public static String transferOtherUser(Users sendingUser, Users receivingUser, int transferAmount) {
        String result = "";
        if (transferAmount > sendingUser.amountAccount1) {
            result = "Sender is poor lol :)";
        } else {
            transferAmount = transferAmount - (transferAmount /100*2);
            sendingUser.amountAccount1 = withDraw(sendingUser.amountAccount1, transferAmount);
            receivingUser.amountAccount1 = deposit(receivingUser.amountAccount1, transferAmount);

            result = "Transaction is completed successfully";
        }
        return result;
    }




    /*
       Create a static method name is transferToOwnAccount
       parameter is One Users object(you can put any name) , one int transferAmount
       return type is String

       if the transferAmount is greater than variable amountAccount1 of the object of Users
        return "You need more money dude"

       if the transferAmount is smaller than variable amountAccount1 of the object of Users
           Remove 2 percent from the transferAmount
          remove the transferAmount from variable amountAccount1 of the object of Users  (use withDraw method)
          add transferAmount to variable amountAccount2 of the object of Users   (use deposit method)

        return "Transaction is completed successfully"

     */

    public static String transferToOwnAccount(Users user, int transferAmount) {
        String result = "";
        if (transferAmount > user.amountAccount1) {
            result = "You need more money dude";

        } else {
            transferAmount = transferAmount - (transferAmount /100);
            user.amountAccount1 = withDraw(user.amountAccount1, transferAmount);
            user.amountAccount2 = deposit(user.amountAccount2, transferAmount);
            result = "Transaction is completed successfully";

        }

        return result;
    }

}












