
class Q2 {
    public static void main (String[] args) {
        String number = System.console().readLine("Enter number :").trim();
        try{
            Integer.parseInt(number);
            System.out.println("The length of the umber is " + number.length());
        }
        catch(Exception ex){
            System.out.println("Pleaase enter a number !");
        }
    }
}