public class Duplicate {
        public static void main(String[]args){
        String [] classes = {"chemistry","math","history","lunch","computer science","Ela","studio Art","French"};
        System.out.println(containsDuplicate(classes));

        }
        public static boolean containsDuplicate(String[] arr ){
                    
                int count = 0;
                while ( count < arr.length - 1){
                    for(int i = count + 1; i < arr.length-1;i++){
                        if(arr[i].equals(arr[i])){
                            return true;
                        }
                        
                    }
                    count++;
                }

                    
                                    return false;


    
}
            }
                
