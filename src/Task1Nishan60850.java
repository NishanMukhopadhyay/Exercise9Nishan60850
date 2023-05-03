public class Task1Nishan60850 {

    public static void NullPointerExe(String word){
        word=null;
        if(word.equals("Nishan")){
            System.out.println("Same word");
        } else{
            System.out.println("Different word");
        }


    }
}

class TesterNishan1 {
    public static void main(String[] args) {

        try {
            Task1Nishan60850.NullPointerExe("Nishan 60850");

        } catch (NullPointerException ex) {
            System.out.println("NullPointer error was found!");
            System.out.println("\n" + ex);
            ex.printStackTrace();
        }
    }
}