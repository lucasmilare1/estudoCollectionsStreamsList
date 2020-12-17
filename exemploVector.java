import java.util.List;
import java.util.Vector;

public class exemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Volei");
        esportes.add("Basquete");
        esportes.add("Tenis de Mesa");

        System.out.println(esportes);

        esportes.set(2, "Ping Pong");

        esportes.remove(2);

        esportes.remove("Tenis de Mesa");

        System.out.println(esportes.get(0));

        for (String esporte: esportes){
            System.out.println(esporte);
        }






    }
}
