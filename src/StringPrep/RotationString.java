package StringPrep;

public class RotationString {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "adnc";
        boolean isRotation = findRotation(a,b);
        System.out.println("String A is "+ ((isRotation)?"a":"not a") + " rotation of String B");
    }

    private static boolean findRotation(String a, String b) {
        if(a.length() != b.length())
            return false;

        String concat = a + a;
        return concat.contains(b);
    }
}
