import java.util.concurrent.ExecutionException;

class Q5 {
    public static void main (String[] args) {
        int total = 0;
        float index = 0;
        String number = "";
        do{
            number = System.console().readLine("Notunuzu giriniz (Cikmak icin -1 yaziniz) :").trim();
            if(number.equals("-1")){
                break;
            }
            try{
                total += Integer.parseInt(number);
                index++;
            }
            catch(Exception ex){
                continue;
            }
        }while(true);
        if(index > 0){
            System.out.println("Ortalama : " + String.format("%.2f", (total / index)));
        }
    }
}