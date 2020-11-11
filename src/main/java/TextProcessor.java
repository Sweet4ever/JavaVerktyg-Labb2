public class TextProcessor{

    public TextProcessor(){}

    public String lowerCase(String str){ return str.toLowerCase(); }

    public String upperCase(String str){ return str.toUpperCase(); }

    public String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}