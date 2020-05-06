package Item;

public class Items {

     /*
    Create the Instance variables
      private double price
      private static double allUserPrice

     */

    private double price;
    private static double allUserPrice;

    /*
        Create a method name is ItemName
        Return type is void
        Parameter is String(myItem)

        NOTE : USE SWITCH STATEMENT

        if myItem = Rose teddy bear
            add 30 to price variable

        if myItem = Iphone max
            add 850.23 to price variable

         if mmyItem = laptop mouse
            add 23.50 to price variable

         if myItem = Monitor
            add 90.23 to price variable

          if myItem = charger
            add 43.20 to price variable

         if myItem = hdmi cable
            add 5.90 to price variable

         if myItem = mug
            add 15.79 to price variable

     */

    public void ItemName(String myItem) {
        switch (myItem) {
            case "Rose teddy bear":
                price = price + 30;
                break;
            case "Iphone max":
                price = price + 850.23;
                break;
            case "laptop mouse":
                price = price + 23.50;
                break;
            case "Monitor":
                price = price + 90.23;
                break;
            case "charger":
                price = price + 43.20;
                break;
            case "hdmi cable":
                price = price + 5.90;
                break;
            case "mug":
                price = price + 15.79;
                break;

        }

    }

    /*
        Create a method name is colorPrice
        Return type is void
        Parameter is String(color)

        NOTE : USE SWITCH STATEMENT

           if color = Red
            add 10 to price variable

           if color = Blue
            add 6 to price variable

           if color = Black
            add 4 to price variable

           if color = White
            add 2 to price variable
     */


    public void colorPrice(String color) {
        switch (color) {
            case "Red":
                price = price + 10;
                break;
            case "Blue":
                price = price + 6;
                break;
            case "Black":
                price = price + 4;
                break;
            case "White":
                price = price + 2;
                break;
        }

    }
    /*
    Create a method name is customText
    return type is double
    first parameter is boolean and second parameter is String

    if boolean true and String length is more than 10
        add 5 to price variable

    if boolean true and String length is less than and equal to 10
        add 3 to price variable

     */

    public double customText(boolean myCondition, String text) {
        if (myCondition == true && text.length() > 10) {
            price = price + 5;
        } else if (myCondition == true && text.length() <= 10) {
            price = price + 3;
        }
        return price;
    }


    /*
        Create a method name is AddtoAllUserPrice
        return type is void
        no parameter

        add price to allUserPrice

     */

    public void AddtoAllUserPrice() {
        allUserPrice += price;
    }


    /*
        Create a static method name is getAllUserPrice
        return type is double
        no parameter

        return the allUserPrice
     */

    public static double getAllUserPrice() {
        return allUserPrice;
    }

}
