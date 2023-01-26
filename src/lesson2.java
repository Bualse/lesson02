public class lesson2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        byte a = 1;
        System.out.println("Значение переменной 'a' с типом" + " 'byte' равно " + a);
        short b = 10;
        System.out.println("Значение переменной 'b' с типом" + " 'short' равно " + b);
        int c = 100;
        System.out.println("Значение переменной 'c' с типом" + " 'int' равно " + c);
        long d = 1000L;
        System.out.println("Значение переменной 'd' с типом" + " 'long' равно " + d);
        float e = 1.5f;
        System.out.println("Значение переменной 'e' с типом" + " 'float' равно " + e);
        double h = 3.56;
        System.out.println("Значение переменной 'h' с типом" + " 'double' равно " + h);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float m = 27.12f;
        long v = 987_678_965_549L;
        byte j = 2;
        short k = 786;
        int r = 569;
        short q = -159;
        short u = 27897;
        byte l = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int lP = 23; // Людмила Павловна
        int aS = 27; // Анна Сергеевна
        int eA = 30; // Екатерина Андреевна
        int listEachStudent = 480 / (lP + aS + eA); // листов достанется каждому ученику
        System.out.println("На каждого ученика рассчитано " + listEachStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time = 2;
        int bottlePerOneMinutes = bottle / time;

        byte min = 20;
        int time1 = bottlePerOneMinutes * min; // 20 minutes
        System.out.println("За " + min + " минут, машина произвела " + time1 + " бутылок");

        byte day1 = 24; // часа
        int time2 = bottlePerOneMinutes * day1 * 60; // 1 day, 60 = в 1 часе минут
        System.out.println("За " + day1 + " день, машина произвела " + time2 + " бутылок");

        byte day3 = 3;
        int time3 = 3 * time2; //3 day
        System.out.println("За " + day3 + " дня, машина произвела " + time3 + " бутылок");

        byte oneMonth = 1;
        int time4 = 30 * time2; // 30 day
        System.out.println("За " + oneMonth + " месяц, машина произвела " + time4 + " бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalPaint = 120; // на 1 класс 2 банки белой краски и 4 банки коричневой
        byte whiteColor = 2;
        byte brownColor = 4;
        int totalPaintClass = whiteColor + brownColor; // количество банок на 1 класс
        int totalClass = totalPaint / totalPaintClass; // всего классов в школе
        int totalWhitePaint = totalClass * whiteColor;
        int totalBrownPaint = totalClass * brownColor;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int bananas = 5;
        int weightOneBanan = 80; // gramms
        int totalWeigtsBananas = bananas * weightOneBanan;
        System.out.println("Общий вес бананов " + totalWeigtsBananas + " грамм.");

        int milk = 200; // мл, 100 мл = 105 грамм
        int totalWeigtMilk = milk / 100 * 105;
        System.out.println("Общий вес молока " + totalWeigtMilk + " грамм.");

        int icecreamPlombir = 2; // каждый брикет = 100 грамм
        int totalWeightIcecreamPlombir = icecreamPlombir * 100;
        System.out.println("Общий вес мороженного - пломбир " + totalWeightIcecreamPlombir + " грамм.");

        int eggs = 4; // 1 яйцо = 70 грамм
        int totalWeightEggs = eggs * 70;
        System.out.println("Общий вес яиц " + totalWeightEggs + " грамм.");

        int totalProductWeights = totalWeigtsBananas + totalWeigtMilk + totalWeightIcecreamPlombir + totalWeightEggs;
        System.out.println("Общий вес продуктов " + totalProductWeights + " грамм.");
        // перевести граммы в кг, в 1 кг = 1000 грамм
        int grPerKg = 1000;
        float totalProductWeightsKg = totalProductWeights / (float)grPerKg;

        System.out.println("Общий вес продуктов " + totalProductWeightsKg + " кг.");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int weightKg = 7; // нужно сбросить 7 кг
        int weightGr = weightKg * 1000;
        int days = weightGr / 250; //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе 250 грамм в день.
        System.out.println("Потребуется " + days + " дней, чтоб похудеть на 7 кг.");

        int days2 = weightGr/500; //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе 500 грамм в день.
        System.out.println("Потребуется " + days2 + " дней, чтоб похудеть на 7 кг.");

        int day3 = (days+days2) / 2;
        System.out.println("Потребуется " + day3 + " день в среднем, чтобы добиться результата похудения");
        //может потребоваться дней в среднем, чтобы добиться результата похудения
    }
    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67_760; // рублей в месяц
        int denis = 83_690; //рублей в месяц
        int cristy = 76_230;// рублей в месяц

        // Каждому нужно увеличить зарплату на 10% от текущей месячной
        int procent = 10;
        int salaryIncrease = masha / procent;
        int mashaSalary = masha + salaryIncrease;
        System.out.println("Зарплата Маши после повышения " + mashaSalary + " рублей");

        int salaryIncrease1 = denis / procent;
        int denisSalary = denis + salaryIncrease1;
        System.out.println("Зарплата Дениса после повышения " + denisSalary + " рублей");

        int salaryIncrease2 = cristy / procent;
        int cristySalary = cristy + salaryIncrease2;
        System.out.println("Зарплата Кристины после повышения " + cristySalary + " рублей");

        //   Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения
        int annualProfit = masha*12; // годовой доход до повышения
        int annualProfitNew = mashaSalary*12; // годовой доход после повышения
        int difannualProfit = annualProfitNew - annualProfit;
        System.out.println("Маша теперь получает " + mashaSalary + " рублей. Годовой доход вырос на " + difannualProfit + " рублей.");

        int annualProfitDenis = denis*12; // годовой доход до повышения
        int annualProfitNewDenis = denisSalary*12; // годовой доход после повышения
        int difannualProfitDenis = annualProfitNewDenis - annualProfitDenis;
        System.out.println("Денис теперь получает " + denisSalary + " рублей. Годовой доход вырос на " + difannualProfitDenis + " рублей.");

        int annualProfitCristy = cristy*12; // годовой доход до повышения
        int annualProfitNewCristy = cristySalary*12; // годовой доход после повышения
        int difannualProfitCristy = annualProfitNewCristy - annualProfitCristy;
        System.out.println("Кристина теперь получает " + cristySalary + " рублей. Годовой доход вырос на " + difannualProfitCristy + " рублей.");

    }
}
