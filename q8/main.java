class Q8 {
    public static void main (String[] args) {
        //Able was I, ere I saw Elba
        String literal = System.console().readLine("Bir cumle girin (Orn. Able was I, ere I saw Elba) :").trim();
        boolean result = isPalindrome(literal);
        if(result){
            System.out.print("'" + literal + "' bir palindromdur :)");
        }
        else{
            System.out.print("'" + literal + "' bir palindrom DEGILDIR :(");
        }
        
    }

    public static boolean isPalindrome(String s){
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        if(!Character.isLetter(s.charAt(0))){
            return isPalindrome(s.substring(1, s.length()));
        }
        if(!Character.isLetter(s.charAt(s.length()-1))){
            return isPalindrome(s.substring(0, s.length()-1));
        }
        
        if(Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length()-1))){
            return isPalindrome(s.substring(1, s.length()-1));
        }
        return false;
    }
}