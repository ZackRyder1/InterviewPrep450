package StringPrep;

public class MobileSequence {
    public static final String [] str= {"2","22","222",
            "3","33","333",
            "4","44","444",
            "5","55","555",
            "6","66","666",
            "7","77","777","7777",
            "8","88","888",
            "9","99","999","9999"
    };

    public static void main(String[] args) {


        String input = "GEEKSFORGEEKS";
        String seq = findNumericSeq(input);
        System.out.println(seq);

    }

    private static String findNumericSeq(String input) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            char charValue = input.charAt(i);
            if(charValue == ' ')
                result.append('0');
            else
            {
                int position = charValue - 'A';
                result.append(str[position]);
            }
        }
        return result.toString();
    }
}
