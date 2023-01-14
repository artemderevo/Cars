public class Car {
    String Brand;
    String Model;
    double EngineVolume;
    String Color;
    int Year;
    String Country;

    Car(String Brand, String Model, double EngineVolume, String Color, int Year, String Country) {
        this.Brand = Brand;
        this.Model = Model;
        this.EngineVolume = EngineVolume;
        this.Color = Color;
        this.Year = Year;
        this.Country = Country;

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