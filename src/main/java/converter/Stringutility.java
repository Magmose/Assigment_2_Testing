package converter;

public class Stringutility {
    public String ReverseString(String input) {
        if(input == null) new NullPointerException() ;
        char[] charArray = input.toCharArray();
        String output = "";
        for (int i = charArray.length; i > 0; i--) {
            output += charArray[i - 1];
        }

        return output;
    }

    public String capitalizeString(String input) throws NullPointerException{
        return  input.toUpperCase();
    }

    public String lowercaseString(String input) throws NullPointerException{
        return  input.toLowerCase();
    }

}

