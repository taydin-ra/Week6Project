package Settings;

import java.util.ArrayList;

public class Address {



     private static ArrayList<String> cityList = new ArrayList<>();

     public void SetCity(){

         cityList.add("New York");
         cityList.add("New Jersey");
         cityList.add("Ohio");
         cityList.add("Pennsylvania");
         cityList.add("Washington");
         cityList.add("Atlanta");
     }

    /*
        Create three private  String variables
        Address1
        City
        ZipCode
     */



    /*
    Create a method name is Address1
    Return type is String
    Parameter is String(myAddress)

    private Address1 equal to myAddress

     */


    /*
        Create a method name is City
        return type is String
        parameter is String(myCity)

        if cityList does NOT contains myCity
        return We are not able to ship to your location

        if the first condition is false
        private City equal to myCity


     */


    /*
        Create a method name is Zipcode
        Return type is String
        Parameter is String(myZipcode)

        if myZipcode length is NOT 5
        return Zip code length should be 5

        If the first condition is false
        private ZipCode equal to myZipcode

     */


}
