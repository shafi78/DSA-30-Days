public class S_04_Finding_Substring {

    public static String getSubString(String str,int startIndex,int endIndex) {
        String subString = "" ;
        for (int i=startIndex ; i<endIndex ; i++) {
            subString += str.charAt(i);
        }

        return subString ;
    }
    public static void main(String args[]) {
        String str = "Shafi Attar" ;

        System.out.println(getSubString(str, 0, 3));

    }
}
