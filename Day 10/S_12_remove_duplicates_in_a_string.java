public class S_12_remove_duplicates_in_a_string {

    public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return ;
        }

        char currChar = str.charAt(idx);

        if (map[currChar-'a'] == true) {
            removeDuplicate(str, idx+1, newStr, map);
        }
        
        else {
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String args[]) {
        String str = "shhaafai";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
