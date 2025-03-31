package k;

import java.util.List;

@SuppressWarnings("unused")
public class Loops {

    void changeToEnhanced() {
        List<String> names = List.of("Homer", "Marge", "Bart", "Lisa", "Maggie");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

}
