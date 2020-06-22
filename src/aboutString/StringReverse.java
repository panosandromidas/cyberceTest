package aboutString;

public class StringReverse {
    public  String reverseString (String x) {
        String y = " ";

        for(int i=x.length()-1;i>=0;i--){
            y+=
                    x.charAt(i)
            ;

        }
        return y;
    }
}
