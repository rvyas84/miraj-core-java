public class Palindrome {
    public boolean isPalindrome(String str) {

        int len = str.length();

        if (len <=1) {
            return true;
        }

        for(int i = 0; i <= len/2 ; i++) {
            if(str.charAt(i) != str.charAt(len-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome pali = new Palindrome();
        System.out.println(pali.isPalindrome("MADAM"));
    }
}
