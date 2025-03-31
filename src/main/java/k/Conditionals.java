package k;

@SuppressWarnings("unused")
public class Conditionals {

    void simplifyIf() {
        if (someCondition() == true) {
            System.out.println("condition is true");
        }
    }

    boolean simplyReturn(int y) {
        int x = 10;
        if (x > y) {
            return true;
        } else {
            return false;
        }
    }

    int simplySwitchStatementWithExpression(String color) {
        int ret;
        switch(color) {
            case "red":
                ret = 1;
                break;
            case "green":
                ret = 2;
                break;
            case "blue":
                ret = 3;
                break;
            default:
                ret = 0;
                break;
        }
        return ret;
    }

    void simplyInstanceof(Object o) {
        if (o instanceof String) {
            String s = (String) o;
            System.out.println(s.length());
        }
    }

    boolean someCondition() {
        return false;
    }

}
