//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        main(args, (byte) 67);
    }

    public static void main(String[] args, byte k) {

        {
            System.out.println("Задача 1 ");
            int orange1 = 300;
            byte orange2 = 33;
            short orange3 = -33;
            long orange4 = 333L;
            float orange5 = 33.3f;
            double orange6 = 33.33333333;
            System.out.println(" значение переменной orange1 с типом переменной int равно " + orange1);
            System.out.println("значение переменной orange2 с типом переменной byte равно " + orange2);
            System.out.println(" значение переменной orange3 с типом переменной short равно " + orange3);
            System.out.println(" значение переменной orange4 с типом переменной long равно " + orange4);
            System.out.println(" значение переменной orange5 с типом переменной float равно " + orange5);
            System.out.println(" значение переменной orange6 с типом переменной double равно " + orange6);
            System.out.println("Задача 2 ");
            double a = 27.12;
            long b = 987678965549L;
            float c = 2.786f;
            short d = 569;
            short e = -159;
            int g = 27897;
            ;
            int m = 67;
            System.out.println("Задача 3 ");
            int lPstudents = 23;
            int aSstudents = 27;
            int eAstudent = 30;
            int totalPaperSheets = 480;
            int totalStudents = lPstudents + aSstudents + eAstudent;
            int paperStudent = totalPaperSheets / totalStudents;
            System.out.println(" На каждого ученика рассчитано " + paperStudent + " листов бумаги ");
            System.out.println(" Задача 4 ");
            int bottles2Minutes = 16;
            int minutesHour = 60;
            int hoursDay = 24;
            int daysMonth = 30;
            int bottlesMinute = bottles2Minutes / 2;
            int twentyMinutes = 20 * bottlesMinute;
            int oneDay = hoursDay * minutesHour * bottlesMinute;
            int threeDays = 3 * oneDay;
            int oneMonth = daysMonth * oneDay;
            System.out.println(" За 20 минут машины произвела " + twentyMinutes + " штук бутылок ");
            System.out.println(" За сутки машина произвела " + oneDay + " штук бутылок ");
            System.out.println(" За 3 дня машина произвела " + threeDays + " штук бутылок");
            System.out.println(" За месяц машина произвела " + oneMonth + " штук бутылок ");
            System.out.println(" Задача 5 ");
            int totalPaintCans = 120;
            int whitePaintClass = 2;
            int brownPaintClass = 4;
            int paintClass = whitePaintClass + brownPaintClass;
            int totalClasses = totalPaintCans / paintClass;
            int totalWhitePaint = totalClasses * whitePaintClass;
            int totalBrownPaint = totalClasses * brownPaintClass;
            System.out.println(" В школе где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски ");
            System.out.println(" Задача 6 ");
            int bananaWeight = 80;
            int mikkWeight = 105;
            int iceCreamWeight = 70;
            int eggWeight = 70;
            int fiveBananaWeight = bananaWeight * 5;
            int twoMilkWeight = mikkWeight * 2;
            int twoIceCreamWeight = iceCreamWeight * 2;
            int fourEggsWeight = eggWeight * 4;
            int weightSportsBreakfastInGrams = fiveBananaWeight + twoMilkWeight + twoIceCreamWeight + fourEggsWeight;
            int weightSportsBreakfastInKilograms = weightSportsBreakfastInGrams / 1000;
            System.out.println(" Вес такого завтрака в граммах равен " + weightSportsBreakfastInGrams + " грамм, а в килограммах равен " + weightSportsBreakfastInKilograms + "кг ");
            System.out.println(" Задача 7 ");
            int needToResetInKilograms = 7;
            int lose250gramsInDay = 250;
            int lose500gramsInDay = 500;
            int needToResetInGrams = needToResetInKilograms * 1000;
            int needDaysFor250grams = needToResetInGrams / lose250gramsInDay;
            int needDaysFor500grams = needToResetInGrams / lose500gramsInDay;
            System.out.println(" Если спортсмен будет терять каждый день по 250 грамм, то у него уйдет " + needDaysFor250grams + " дней на похудение ");
            System.out.println(" Если спортсмен будет терять каждый день по 500 грамм, то унего уйдет " + needDaysFor500grams + " дней на похудение ");
            int needDaysOnAverage = (needDaysFor250grams + needDaysFor500grams) / 2;
            System.out.println(" В среднем ему потребуется " + needDaysOnAverage + " день на похудение. ");
            System.out.println(" Задача 8 ");
            int salaryMonthMaria = 67760;
            int salaryMonthDenis = 83690;
            int salaryMonthKristina = 76230;
            int salaryAfterPromotionMaria = 67760 / 10 + 67760;
            int salaryAfterPromotionDenis = 83690 / 10 + 83690;
            int salaryAfterPromotionKristina = 76230 / 10 + 76230;
            int MariaSalaryPerYear = 67760 * 12;
            int DenisSalaryPerYear = 83690 * 12;
            int KristinaSalaryPerYear = 76230 * 12;
            int MariaSalaryPerYearAfterTheIncrease = salaryAfterPromotionMaria * 12;
            int DenisSalaryPerYearAfterTheIncrease = salaryAfterPromotionDenis * 12;
            int KristinaSalaryPerYearAfterTheIncrease = salaryAfterPromotionKristina * 12;
            int MariaIncomeDifference = MariaSalaryPerYearAfterTheIncrease - MariaSalaryPerYear;
            int DenisIncomeDifference = DenisSalaryPerYearAfterTheIncrease - DenisSalaryPerYear;
            int KristinaIncomeDifference = KristinaSalaryPerYearAfterTheIncrease - KristinaSalaryPerYear;
            System.out.println(" Маша теперь получает " + salaryAfterPromotionMaria + " рублей в месяц. Годовой доход вырос на " + MariaIncomeDifference + " рублей.");
            System.out.println(" Денис теперь получает " + salaryAfterPromotionDenis + " рублей в месяц. Годовой доход вырос на " + DenisIncomeDifference + " рублей. ");
            System.out.println(" Кристина теперь получает " + salaryAfterPromotionKristina + " рублей в месяц. Годовой доход вырос на " + KristinaIncomeDifference + " рублей. ");


        }
    }
}