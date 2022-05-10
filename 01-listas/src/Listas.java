import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Listas {
    public static void main(String[] args) {
        //arrays [0,0,0,0,0,0,0,0,0,0]
        int[] arrayNumeros = new int[10];
        System.out.println(Arrays.toString(arrayNumeros));
        //arrays [0.0,0.0,0.0]
        Float[] arrayPorcentaje = new Float[3];
        System.out.println(Arrays.toString(arrayPorcentaje));
        // Inicializar Array
        int[] age = {12, 4, 5, 2, 5};
        System.out.println(Arrays.toString(age));
        age[0] = 100;
        System.out.println(Arrays.toString(age));

        // Explicar stack
        // Explicar queue

        // EXPLICAR INTERFACES JAVA

        // Explicar Set y Map
        Set<String> marvel_movies = new HashSet<>();

        marvel_movies.add("Captain Marvel");
        marvel_movies.add("Thor: Ragnarok");
        marvel_movies.add("Captain America: The Winter Soldier");
        marvel_movies.add("Ant-Man and the Wasp");

        System.out.println(marvel_movies);

        Map<Integer,String> marvel_movies2 = new HashMap();

        marvel_movies2.put(4,"Captain Marvel");
        marvel_movies2.put(2,"Thor: Ragnarok");
        marvel_movies2.put(3,"Captain America: The Winter Soldier");
        marvel_movies2.put(1,"Ant-Man and the Wasp");

        Set set=marvel_movies2.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry) itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        // Explicar List

        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Cristian");
        listaNombres.add("Angello");
        listaNombres.add("Mauricio");
        listaNombres.add("Eduardo");

        System.out.println(Arrays.toString(listaNombres.toArray()));

        List<Integer> listaNumeros = new ArrayList(){{
            add(1);
            add(2);
            add(3);
        }};

        System.out.println(Arrays.toString(listaNumeros.toArray()));

        System.out.println(listaNumeros.get(2));

        Iterator<String> iterator = listaNombres.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<Integer> oddlist = Arrays.asList(1,3,5,7,9,11);
        System.out.println(Arrays.toString(oddlist.toArray()));

        List<Integer> listB = IntStream.range(10, 20).boxed().collect(Collectors.toList());
        System.out.println(Arrays.toString(listB.toArray()));

        List<Double> listC = DoubleStream.generate(() -> new Random().nextDouble())
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(listC.toArray()));

    }
}
