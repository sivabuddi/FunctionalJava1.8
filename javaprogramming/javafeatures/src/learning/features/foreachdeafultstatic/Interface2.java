package learning.features.foreachdeafultstatic;

@FunctionalInterface
public interface Interface2 {

    void method2(String str);

    default void log(String str) {
        System.out.println("Interface2 Logging" + str);
    }




}
