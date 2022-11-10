package JavaTutorialForBeginners;

import java.lang.StringBuilder;

public class StringBuilderGuide {
    public static void main(String[] args) {
        String a = "";
        a = "hello";
        //String didn't change, the pointer 'a' now points not to string "", but to string "hello"
        //In Java strings are immutable, you can't change them
        //But you can use StringBuilder, Java library that constructs mutable sequence of characters,
        //so you can append new characters to String Builder and change it


        StringBuilder str = new StringBuilder(); //StringBuilder with no characters, initial capacity of 16 characters

        System.out.println(str.capacity()); //shows capacity of String Builder

        str.append("hello")
                .append(" ")
                .append("world"); //chain of methods that applies to StringBuilder 'str' object.
        //by using method 'append' you add new sequence of characters to the end of the StringBuilder object

        System.out.println("My SB: " + str); //you can use 'toString' method if needed

        StringBuilder str2 = new StringBuilder("ABRA"); //StringBuilder constructor with character sequence as an argument

        System.out.println(str2.capacity()); //capacity equals to 16 + length of the argument character sequence (16 default number)

        System.out.println(str2.append("KADABRA").capacity()); //capacity is still 20, because the length is 11, so we have 9 free characters
        System.out.println(str2.append("BLABLABLA").capacity()); //now we have 0 free characters
        System.out.println(str2.append("B").capacity()); //now the length is 21, so the formula of the new capacity is
                                                        //newCapacity = oldCapacity*2+2, so new equals to 42

        StringBuilder str3 = new StringBuilder(10); //StringBuilder constructor with no characters, capacity as an argument
        System.out.println(str3.capacity());

        String myString = "shalom";
        StringBuilder str4 = new StringBuilder(myString.toString()); //StringBuilder constructor with String as an argument
        System.out.println(str4.capacity()); //16 + length of the string


        StringBuilder test = new StringBuilder();
        int b = 42;
        System.out.println(test.append("The number is ").append(b));


        test.delete(0, test.capacity()); //method deletes characters with start and end arguments
        test.appendCodePoint(97); //appends string representation of Unicode encoded character (e.g. a = 97)

        test.delete(0, test.length()); //deletes all characters (not length of capacity, but of characters)

        test.append("MAMA MIA");
        System.out.println(test.reverse());//you can understand from the name
        test.reverse();

        test.replace(5, test.length(), "MASHA"); //replacement of charSequence with another one
                                                        //arguments: int start, int end, int String(charSequence)
        System.out.println(test);
    }
}
