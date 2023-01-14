public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "",0,"",0,"");
        lada.info();

        Car audi = new Car("","",0,"",0,"");
        audi.info();

        Car bmw = new Car("BMW","Z8",3.0,"Черный",2021,"Германия");
        bmw.info();

        Car kia = new Car("Kia","Sportage 4-го поколения",2.4,"Красный",2018,"Южная Корея");
        kia.info();

        Car hyundai = new Car("Hyundai","Avante",1.6,"Оранжевый",2016, "Южная Корея");
        hyundai.info();
    }
}