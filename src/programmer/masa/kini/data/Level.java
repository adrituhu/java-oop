package programmer.masa.kini.data;

import programmer.masa.kini.annotation.Fancy;

@Fancy(name = "Animal App", tags = {"java", "application"})
public enum Level {

    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level (String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}
