public class Criteria {
    public static void main(String[] args) {
        String[] names = {"Barry", "Brendan", "uri", "Kiana", "kellin"};
        
        
        int count = 0;

        for (String name : names) {

            if (name.length() == 4) {
                
                count++;
            }
        }

        System.out.println(count);
    }
}