package k;

@SuppressWarnings("unused")
public class JavaDocs {

    /**
     * @param age
     * @param name
     * @return
     */
    int getNameLength(String name) {
        return name.length();
    }

    void danglingJavaDoc() {
        /**
         * remove or convert to
         * normal multi-line comment
         */
        System.out.println("hello?");
    }

}
