public class search{
public static void main(String[] args) {
        String[] names = {"Barry", "Brendan", "uri", "Kiana", "kellin"};
    for(String name : names){
        if(name.indexOf("k") == 0){
            System.out.println(name);
        }
    }
}
}