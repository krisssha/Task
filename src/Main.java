
public class Main {
    public static void main ( String [] argos) {
        String book [] = {"Пушкин А.С." , "Золотая рыбка", "Толстой Л.Н.", "Война и мир"} ;
        for ( int i = 0; i < book.length; i+=2) {
            System.out.println (book[i] + " " + book[i + 1]);
        }
    }
}
