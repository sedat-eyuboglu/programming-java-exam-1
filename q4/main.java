
class Q4 {
    public static void main (String[] args) {
        for(int i = 7; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            if(i > 1){
                System.out.print("\n");
            }
        }
    }
}