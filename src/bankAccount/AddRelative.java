package bankAccount;

import org.junit.Assert;

import java.util.Date;

public class AddRelative {

    /*
    Create an instance variable
        String fullName , String age
     */

    String fullName;
    String age;
//

    /*
        Create a constructor AddRelative
            parameters String fullName and  String age

        instance variable fullName equals to parameter fullName

        If the age is greater than  and equal to 18, so the  instance variable age equals to parameter age (use relativeAgeChecker method)
        If the age is less than 18, so the instance variable age equals to "0"

     */
    public AddRelative(String fullName, String age) {
    this.fullName=fullName;
    boolean res=relativeAgeChecker(age);
    if(res==true){
        this.age=age;
    }else{
        this.age="0";
    }
    }

    /*
        Create a method name is relativeAgeChecker
        parameter String(relativeAge)
        return type is boolean

        if the relativeAge more and equal to 18 return true
        else false

        Note: use a Users class checkAge method.
     */
    public boolean relativeAgeChecker(String relativeAge){
        String result = Users.checkAge(relativeAge);
        if(result.equals("You can get a credit card")){
            return true;
        }
        return false;
    }

}
