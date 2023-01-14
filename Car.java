public class Car {
    String Brand;
    String Model;
    double EngineVolume;
    String Color;
    int Year;
    String Country;


    Car(String Brand, String Model, double EngineVolume, String Color, int Year, String Country) {
        if (Brand.isEmpty() ) {
            this.Brand = "default";
        } else {
            this.Brand = Brand;
        }

        if (Model.isEmpty()) {
            this.Model = "default";
        } else {
            this.Model = Model;
        }

        if (EngineVolume <= 0) {
            this.EngineVolume = 1.5;
        } else {
            this.EngineVolume = EngineVolume;
        }

        if (Color.isEmpty()) {
            this.Color = "Белый";
        } else {
            this.Color = Color;
        }
        if (Year <= 0) {
            this.Year = 2000;
        } else {
            this.Year = Year;
        }

        if (Country.isEmpty()) {
            this.Country = "default";
        } else {
            this.Country = Country;
        }

    }


    void info() {
        System.out.println("Марка автомобиля: " + Brand);
        System.out.println("Модель автомобиля: " + Model);
        System.out.println("Объем двигателя — " + EngineVolume);
        System.out.println("Цвет кузова — " + Color);
        System.out.println("Год выпуска — " + Year);
        System.out.println("Страна сборки: " + Country);
    }


}