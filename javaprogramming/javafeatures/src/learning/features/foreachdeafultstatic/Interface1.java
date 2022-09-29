package learning.features.foreachdeafultstatic;

@FunctionalInterface
public interface Interface1 {

    void method1(String str);

    default void log(String str) {
        System.out.println("Interface1 Logging" + str);
    }

    static void print(String str) {
        System.out.println("Printing" + str);
    }


}
