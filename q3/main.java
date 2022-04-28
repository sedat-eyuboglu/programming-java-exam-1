
class Q3 {
    public static void main (String[] args) {
        float total = 0;
        for(float i = 1; i <= 9; i++) {
            total = total + (i / (i + 1));
        }
        System.out.println("Total : " + total);
    }
}