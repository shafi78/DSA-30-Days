public class S_02_find_subset_of_a_string {

    public static void findSubsets(String str,String ans,int i) {
        // base case

        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }

        // recursion

        // Yes
        findSubsets(str, ans+str.charAt(i), i+1);

        // no
        findSubsets(str, ans, i+1);
    }

    public static void main(String args[]) {
        String str = "abc" ;
        findSubsets(str, "", 0);
    }
}


// Time complexity: O(n*2^n)
// Space complexity: O(n)