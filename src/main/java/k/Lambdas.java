package k;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Lambdas {

    void useLambda() {
        List<String> names = makeNames();
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    void useMethodReference() {
        apply(1, i -> System.out.println(i));
    }

    Map<String, Character> useFunctionIdentity() {
        List<String> names = makeNames();
        return names.stream()
                .collect(Collectors.toMap(name -> name, name -> name.charAt(0)));
    }

    List<String> makeNames() {
        return List.of("Homer", "Marge");
    }

    @SuppressWarnings("SameParameterValue")
    void apply(int i, Consumer<Integer> consumer) {
        consumer.accept(i);
    }

}
