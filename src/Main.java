public class Main {
    public static void main(String[] args) {
        //DZ 2.1
        int i = 1;
        byte r = -1;
        short e = 7;
        long b = 100L;
        float g = 12.5f;
        double h = 12.5;
        char n = 36;
        boolean m = i < 5;
        //DZ 2.2
        float m1 = 78.2f;
        float m2 = 82.7f;
        float ves = m2 + m1;
        float ves1 = m2 - m1;
        System.out.println("Общий вес боксеров = " + ves);
        System.out.println("Разница в весе боксеров = " + ves1);
        //DZ 2.3
        int banana = 80;
        int milk100Gr = 105;
        int briquetteIceСream = 100;
        int egg = 70;
        int ves2 = banana * 5 + milk100Gr * 2 + briquetteIceСream * 2 + egg * 4;
        float ves3 = ves2 / 1000f;
        System.out.println("Общий вес завтрака = " + ves2 + " gr");
        System.out.println("Общий вес завтрака в киллограммах = " + ves3 + " kg");
        //DZ 2.4
        int ves7Kg = 7000;
        int numberOfDays = ves7Kg / 250;
        int numberOfDays1 = ves7Kg / 500;
        float numberOfDays2 = ves7Kg / (500 + 250) / 2f;
        System.out.println("Количество дней похудения при 250 грамм в день = " + numberOfDays + " дней");
        System.out.println("Количество дней похудения при 500 грамм в день = " + numberOfDays1 + " дней");
        System.out.println("Количество дней похудения всреднем = " + numberOfDays2 + " дней");
        //DZ 2.5
        int zpM = 67760;
        int zpM1 = zpM + zpM / 10;
        int zpD = 83690;
        int zpD1 = zpD + zpD / 10;
        int zpK = 76230;
        int zpK1 = zpK + zpK / 10;
        System.out.println("Маша теперь получает " + zpM1 + " рублей");
        System.out.println("Годовой доход Маши вырос на " + (zpM1 * 12 - zpM * 12) + " рублей");
        System.out.println("Дима теперь получает " + zpD1 + " рублей");
        System.out.println("Годовой доход Димы вырос на " + (zpD1 * 12 - zpD * 12) + " рублей");
        System.out.println("Кристина теперь получает " + zpK1 + " рубля");
        System.out.println("Годовой доход Кристины вырос на " + (zpK1 * 12 - zpK * 12) + " рублей");



    }
}