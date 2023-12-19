// Convert uppercase characters to lowercase using bits

public class S_09_convert_uppercase_to_lowercase_using_bits {
    public static void main(String args[]) {
        for (char ch = 'A' ; ch<= 'Z' ; ch++) {
            System.out.println((char)(ch | ' '));
        }
    }
}
