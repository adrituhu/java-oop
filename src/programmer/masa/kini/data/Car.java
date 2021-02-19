package programmer.masa.kini.data;

import programmer.masa.kini.annotation.Fancy;

@Fancy(name = "Car app", tags = {"java", "application"})
public interface Car extends HasBrand {

    void drive();

    int getTier();

    default boolean isBig() {
        return false;
    }

}
