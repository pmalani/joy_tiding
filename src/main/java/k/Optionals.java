package k;

import java.util.Optional;

@SuppressWarnings("unused")
public class Optionals {

    private Optional<String> name;

    public void processName(Optional<String> name) {
        System.out.println(name);
    }

}
