package k;

@SuppressWarnings("unused")
public class Boxing {

    void unnecessaryBoxing(int i) {
        Integer value = Integer.valueOf(i);
    }

    void unnecessaryUnboxing(Integer i) {
        int value = i.intValue();
    }

}
