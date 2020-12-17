
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class exemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("Roberto");
        nomes.add("Idamis");
        nomes.add("Giovana");


        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(1,"Yukyo");

        System.out.println(nomes);

        nomes.remove(3);

        System.out.println(nomes);

        nomes.remove("Lucas");

        System.out.println(nomes);

        String nome = nomes.get(1);

        int posicao = nomes.indexOf("lucas");

        System.out.println(posicao);

        System.out.println(nome);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Giovana");

        tamanho =nomes.size();

        System.out.println(tamanho);

        boolean  temLucas = nomes.contains("Lucas");

        System.out.println(temLucas);

        boolean temYukyo = nomes.contains("Yukyo");

        System.out.println(temYukyo);

        for (String nomeDoItem: nomes){

            System.out.println(nomeDoItem);
        }

        Iterator<String> iterator =nomes.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

        boolean listaEstaVazia = nome.isEmpty();

        System.out.println(listaEstaVazia);

        }



    }

