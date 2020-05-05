package Item;

public class Items {

    /*
    Create an Instance variables
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

        if my item = Rose teddy bear
            add 30 to price variable

        if my item = Iphone max
            add 850.23 to price variable

         if my item = laptop mouse
            add 23.50 to price variable

         if my item = Monitor
            add 90.23 to price variable

          if my item = charger
            add 43.20 to price variable

         if my item = hdmi cable
            add 5.90 to price variable

         if my item = mug
            add 15.79 to price variable

     */
    public void ItemName(String myItem){
        switch (myItem){
            case "Rose teddy bear":
                price+=30;
                break;
            case "Iphone max":
                price+=850.23;
                break;
            case "laptop mouse":
                price+=23.50;
                break;
            case "Monitor":
                price+=90.23;
                break;
            case "charger":
                price+=43.20;
                break;
            case "hdmi cable":
                price+=5.90;
                break;
            case "mug":
                price+=15.79;
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
    public void colorPrice(String color){
        switch (color){
            case "Red":
                price+=10;
                break;
            case "Blue":
                price+=6;
                break;
            case "Black":
                price+=4;
                break;
            case "White":
                price+=2;
                break;
        }
    }



    /*
    Create a method name is customText
    return type is double
    parameters are  one boolean and one String

    if boolean true and String length is more then 10
        add 5 to price variable

    if boolean true and String length is more then or equal to 10
        add 3 to price variable

     */
    //TODO what should I return? , typo then*, second condition is redundant why need to check >= ???
    public double customText(boolean b, String s){
        if(b && s.length() > 10){
            price+=5;
        }
        if(b && s.length() >= 10){
            price+=3;
        }

        return price;
    }


    /*
        Create a method name is AddtoAllUserPrice
        return type is void
        no parameter

        add price to allUserPrice

     */

    public void AddtoAllUserPrice(){
        allUserPrice+=price;
    }


    /*
        Create a static method name is getAllUserPrice
        return type is double
        no parameter

        return the allUserPrice
     */
    public static double getAllUserPrice(){
        return allUserPrice;
    }

}
