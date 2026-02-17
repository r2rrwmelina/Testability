public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 10_000;
        int miles = service.calculate(price); // проверка примера из задачи
        System.out.println(miles);

        System.out.println();
        price = 21_100;
        miles = service.calculate(price);
        System.out.println(miles);

        System.out.println();
        price = 33_790;
        miles = service.calculate(price);
        System.out.println(miles);
    }
}