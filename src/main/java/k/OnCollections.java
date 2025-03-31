package k;

import java.util.*;

@SuppressWarnings("unused")
public class OnCollections {

    @SuppressWarnings("FieldMayBeFinal")
    private Map<Character, Set<String>> firstAlphabetToNames = new HashMap<>();

    void useIsEmpty(Collection<String> collection) {
        if (collection.size() > 0) {
            System.out.println("collection is empty");
        }
    }

    void useComputeVersions(String name) {
        char c = name.charAt(0);
        Set<String> set = firstAlphabetToNames.get(c);
        if (set == null) {
            set = new HashSet<>();
            firstAlphabetToNames.put(c, set);
        }
        set.add(name);
    }

    void useForEachDirectly() {
        List<String> names = List.of("Homer");
        names.stream()
                .forEach(System.out::println);
    }

}
