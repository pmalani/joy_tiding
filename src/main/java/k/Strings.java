package k;

@SuppressWarnings("unused")
public class Strings {

    public static final String REPLACE_WITH_TEXT_BLOCK = "select first_name, last_name " +
            "from person p" +
            "where p.person_id = :id";

    public String useStringBuilder() {
        StringBuffer ret = new StringBuffer();
        ret.append("Homer");
        ret.append("Marge");
        return ret.toString();
    }

}
