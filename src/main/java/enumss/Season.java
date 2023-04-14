package enumss;

import lombok.*;

public enum Season {
    SUMMER("Літо",35),
    AUTUMN("Осінь",10),
    WINTER("Зима",-25),
    SPRING("Весна",20);
    private String translation;
    private int temperature;



     Season(String translation, int temperature){
        this.translation = translation;
        this.temperature = temperature;


    }
    public String getTranslation(){
         return translation;
    }
    public int getTemperature(){
         return temperature;
    }
    public String getTranslationAndTemperature(){
         return  "Season:" + translation + "\n" + "Temperature:" + temperature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "translation='" + translation + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
