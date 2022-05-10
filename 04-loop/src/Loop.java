import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Loop {

    public static void main(String[] args) {


        // While
       // boolean condition = false;
        //while (condition) {
            // code block to be executed
        //}

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i ++;
        }


        // Do - While
        //do {
            // code block to be executed
        //}
        //while (condition);


        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);


        // For loop

        for (int j=1; j<=10; j++) {
            System.out.println(j);
        }

        //for (statement 1; statement 2; statement 3) {
            // code block to be executed
        //}

        for ( i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // For-Each
        String[] heroes = {"Capitan America", "Thor", "Wolverine", "Iron man"};
        for (String h : heroes) {
            System.out.println(h);
        }

        // Break
        for ( i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }


        // Continue
        for ( i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }


        i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Thor");
        cars.add("Wolverine");
        cars.add("Iron man");
        cars.add("Marvel");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        //System.out.println(it.next());

       // while(it.hasNext()) {
       //     System.out.println(it.next());
       // }

        while(it.hasNext()) {
            String index = it.next();
            if(index.equals("Marvel")) {
                it.remove();
            }
        }

        List<String> list = new ArrayList<String>();

        list.add("Thor");
        list.add("TWolverine");
        list.add("Iron man");
        list.add("TMarvel");

        list.forEach( h -> {
            if (h.equals("Thor")) {
                System.out.println(h);
            }
        });
        List<String> result = list.stream().filter( h -> h.startsWith("T")).collect(Collectors.toList());
        System.out.println(result);

        list.removeIf(h -> h.equals("Wolverine"));
        System.out.println(list);
    }
}
