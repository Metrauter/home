package homeworks.lesson10.task4;

public class Pants extends Cloth implements ManCloth, WomanCloth {
    @Override
    public void clotheMan() {
        System.out.println("Одеваем штаны на мужчину");
    }

    @Override
    public void clotheWoman() {
        System.out.println("Одеваем штаны на женщину");
    }
}
