package k;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class Declarations {

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private Map<Long, String> idToPerson;
    private static int familySize;

    void dontUseInstance() {
        this.familySize = 5;
        System.out.println(Declarations.familySize);
    }

    void useInference() {
        Map<String, String> ssnToName = new HashMap<String, String>();
    }

    void noRedundantCasts() {
        String name = (String) idToPerson.get(1L);
    }

    String noRedundantInitialization() {
        String name = null;
        if (someCondition()) {
            name = "Homer";
        } else {
            name = "Marge";
        }
        return name;
    }

    void avoidRedundantExceptions() throws InterruptedException {

    }

    boolean someCondition() {
        return false;
    }

}

@SuppressWarnings("unused")
interface Buyer {

    public void avoidRedundantModifiers();

}

@SuppressWarnings("unused")
class Person {
    private final String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}