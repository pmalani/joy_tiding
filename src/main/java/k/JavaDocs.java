package k;

@SuppressWarnings("unused")
public class JavaDocs {

    /**
     *
     * @param name
     * @return
     */
    int getNameLength(String name) {
        return name.length();
    }

    void danglingJavaDoc() {
        /**
         * the code and comment are not related
         */
        System.out.println("hello?");
    }

}
