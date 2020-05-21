package bankAccount;


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Users {

    public String name;
    public String password;
    public String dateOfBirth; // format should be MM-dd-yyyy
    public String marriageStatus;
    public int accountNumber;
    public int amountAccount1;
    public int accountNumber2;
    public int amountAccount2;
    String relativeName;
    String relativeAge;

    String isTransferedSuceesfully;

    /*
        Create instance variables String ( name, password ,dateOfBirth, marriageStatus,  relativeName, relativeAge, isTransferedSuceesfully)
        Create int  variables (accountNumber ,amountAccount1, accountNumber2, amountAccount2)

        all public
     */


    /*
    NOTE:
    Before the constructor create the methods which given under the constructor and than come back to create the constructor
     */
//
    /*
    Create a constructor
    Parameters are String name , password , dateOfBirth , marriageStatus
    int amountAccount1 , amountAccount2

    instance variable name equals to parameter name
    same for password
    same for amountAccount1
    same for amountAccount2

    Following also in the constructor

    variable accountNumber get the the number from the  randomNumberCreader method
    variable accountNumber2 get the the number from the  randomNumberCreader method
    variable marriageStatus equals to CheckMariageStatus method return
    variable dateOfBirth equals to checkAge method return

     */

    public Users(String name, String password,String dateOfBirth ,String marriageStatus,int amountAccount1 ,int  amountAccount2){
        this.name=name;
        this.password=password;
        this.amountAccount1=amountAccount1;
        this.amountAccount2=amountAccount2;
        this.accountNumber=randomNumberCreader();
        this.accountNumber2=randomNumberCreader();
        this.marriageStatus=CheckMariageStatus(marriageStatus);
        this.dateOfBirth=checkAge(dateOfBirth);

    }


    /*
        Create method name is  CheckMariageStatus
        parameter is String(marriageStatus)
        return type is String

        if String marriageStatus equals married

        Ask to user (use scanner class)
        Do you want to add add your relative?

        if the user says Yes
        Ask to user
        What is your relative name?
        Ask to user
        Date of birth relative?

        Then Add the relative(Use AddRelative class ) (Hint create an object of AddRelative class)
        relativeName variable equals to AddRelative class fullName
        relativeAge variable equals to AddRelative class age

            if relativeAge equals to "0"
                then change the relativeName to "Relative should be more then 18 years old";
                then change the relativeAge to "Relative should be more then 18 years old";
                return the "Relative should be more then 18 years old";
            if the relativeAge is not equal to "0"
               return "Transaction done successfully"

        If the user say No
        then return no need to add relative.
     */


    public String CheckMariageStatus(String marriageStatus) {

        String res = "";
        if (marriageStatus.equals("married")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to add add your relative?");
            String answer = scan.nextLine();
            if (answer.equals("Yes")) {
                System.out.println("What is your relative name?");
                String rname = scan.nextLine();
                System.out.println("Date of birth relative?");
                String dob = scan.nextLine();
                AddRelative ad = new AddRelative(rname,dob);
                relativeName = ad.fullName;
                relativeAge = ad.age;
                if (relativeAge.equals("0")) {
                    relativeName = "Relative should be more then 18 years old";
                    relativeAge = "Relative should be more then 18 years old";
                    res="Relative should be more then 18 years old";
                } else {
                    res = "Transaction done successfully";
                }
            } else {
                res = "no need to add relative.";
            }

        }
        return res;
    }

    /*
        Create a static method name is checkAge
        parameter is one String(myDOB)
        return type is String

        Compare today's date to myDOB

        if myDOB compare to today date is greater than  18 then return "You can get a credit card"

        if myDOB compare to today date is less then 18 "You should be at least 18 years old to get a credit card."

        if myDOB compare to today date equals 18 then you need to compare the months.(use nested if)

        if today's monthvalue is greater than myDOB's monthvalue return "You can get a credit card"

        if today's monthvalue is less than myDOB's monthvalue return "You should be at least 18 years old to get a credit card."

        if today's monthvalue is equal to myDOB's monthvalue , you need to compare day of the months. (use nested if)

        If today's amount of day is greater than myDOB's amount of days return "You can get a credit card"

        else return "You should be at least 18 years old to get a credit card."


        For example today date is 10/05/2020

        if myDOB is 09/05/2002

        return should be  "You can get a credit card"

        if myDOB is 11/05/2002

        return should be  "You should be at least 18 years old to get a credit card."

        Hint: Use LocalDate and Period classes,

     */
    public static String checkAge(String age) {

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
        String text = date.format(formatters);
        LocalDate today = LocalDate.parse(text, formatters);

        LocalDate myAge = LocalDate.parse(age, formatters);

        int num = today.compareTo(LocalDate.parse(age, formatters));

        String result = "";

        if (num > 18) {

            result = "You can get a credit card";

        } else if (num < 18) {

            result = "You should be at least 18 years old to get a credit card.";

        } else if (num == 18) {

            if (today.getMonthValue() > myAge.getMonthValue()) {

                result = "You can get a credit card";

            } else if (today.getMonthValue() < myAge.getMonthValue()) {

                result = "You should be at least 18 years old to get a credit card.";

            } else if (today.getMonthValue() == myAge.getMonthValue()) {

                if (today.getDayOfMonth() > myAge.getDayOfMonth()) {

                    result = "You can get a credit card";

                } else {

                    result = "You should be at least 18 years old to get a credit card.";
                }
            }
        }

        return result;

    }



    /*
        Create a Random number which is returning 8 digit number

            it should be between 10000000 - 99999999

            return type is int


     */

    public int randomNumberCreader(){
        Random rnd = new Random();

        int random = rnd.nextInt(99999999 - 10000000) + 10000000;

        return random;
    }



    /*
        Create a method name is transfer
        Parameters are two Users object
        Return type is void

        In this method
            First ask to user "Do you want to transfer between your accounts or different user" (use scanner class)

        if the answer is own
           instance variable isTransferedSuceesfully eaguals to the the method transferToOwnAccount in the Account class

        if the answer different
         instance variable isTransferedSuceesfully eaguals to the the method transferOtherUser in the Account class


     */

    public void transfer(Users user, Users user2){
        Scanner ssan= new Scanner(System.in);
        System.out.println("Do you want to transfer between your accounts or different user");
        String answer= ssan.nextLine();
        if(answer.equals("own")){
            System.out.println("Enter amount of money you want to enter");

            int transferAmount = ssan.nextInt();

            isTransferedSuceesfully=Account.transferToOwnAccount(user,transferAmount);
        }else{
            System.out.println("Enter amount of money you want to enter");

            int transferAmount = ssan.nextInt();

            isTransferedSuceesfully=Account.transferOtherUser(user,user2,transferAmount);
        }
    }


    /*
        Print the objects using toString method

        like
         return "\nname: " + name +
                "\npassword: " + password+
                "\ndateOfBirth: " + dateOfBirth+
                ......

     */
    public String toString() {
        return "\nname: " + name +
                "\npassword: " + password +
                "\ndateOfBirth: " + dateOfBirth +
                "\nmarriageStatus: " + marriageStatus +
                "\naccountNumber: " + accountNumber +
                "\namount in account 1 : " + amountAccount1 +
                "\naccountNumber2: " + accountNumber2 +
                "\namount in account 2 : " + amountAccount2 +
                "\nrelativeName: " + relativeName +
                "\nrelativeAge: " + relativeAge;
    }


}
