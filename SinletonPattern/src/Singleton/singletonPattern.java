package Singleton;

public class singletonPattern {
    public static void main(String[] args) {

        //singleton to make sure that we have only one instance of a certain class in our program

        Dtabase database = Dtabase.getInstance("db_music");
        System.out.println(database.toString());
    }
}
