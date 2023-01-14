public class Main {
    public static void main(String[] args) {

        Car lada = new Car();
        lada.Brand = "Lada";
        lada.Model = "Granta";
        lada.EngineVolume = 1.7;
        lada.Color = "Желтый";
        lada.Year = 2015;
        lada.Country = "Россия";
        lada.info();

        Car audi = new Car();
        audi.Brand = "Audi";
        audi.Model = "A8 50 L TDI quattro";
        audi.EngineVolume = 3.0;
        audi.Color = "Черный";
        audi.Year = 2020;
        audi.Country = "Германия";
        audi.info();

        Car bmw = new Car();
        bmw.Brand = "BMW";
        bmw.Model = "Z8";
        bmw.EngineVolume = 3.0;
        bmw.Color = "Черный";
        bmw.Year = 2021;
        bmw.Country = "Германия";
        bmw.info();

        Car kia = new Car();
        kia.Brand = "Kia";
        kia.Model = "Sportage 4-го поколения";
        kia.EngineVolume = 2.4;
        kia.Color = "Красный";
        kia.Year = 2018;
        kia.Country = "Южная Корея";
        kia.info();

        Car hyundai = new Car();
        hyundai.Brand = "Hyundai";
        hyundai.Model = "Avante";
        hyundai.EngineVolume = 1.6;
        hyundai.Color = "Оранжевый";
        hyundai.Year = 2016;
        hyundai.Country = "Южная Корея";
        hyundai.info();
    }
}