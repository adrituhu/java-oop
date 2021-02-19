package programmer.masa.kini.application;

import static programmer.masa.kini.data.Application.PROCESSORS;
import static programmer.masa.kini.data.Constant.*;
import programmer.masa.kini.data.Country;
import programmer.masa.kini.util.MathUtil;


public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(version);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Maros");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);

    }
}
