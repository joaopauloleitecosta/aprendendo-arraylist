import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Aprendendo ArrayList
        ArrayList<String> people = new ArrayList<>(){{
            add("João");
            add("Karol");
            add("Maria Luz");
        }};

        people.add("Gilma");
        people.add("Teresa");
        people.add("Alexa");

        //Imprimindo todos os elementos
        System.out.println(people);
        //Acessando pelo índice
        System.out.println(people.get(3));
        //Modificando um elemento
        people.set(4, "Ana Teresa");
        //Removendo um elemento
        people.remove(5);
        //Imprimindo todos os elementos
        System.out.println(people);

    }
}