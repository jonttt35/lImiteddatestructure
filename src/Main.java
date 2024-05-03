public class Main {
    public static void main(String[] args) {
       data myData = new data();

       for (int i = 800; i < 900; i= i+1) {

          Object value = myData.get();
          System.out.println(value);
       }

       for (int i = 500; i < 600; i= i+1) {

          myData.put(i);
       }

       for (int i = 500; i < 600; i= i+1) {

          Object value = myData.get();
          System.out.println(value);
       }
    }
}
