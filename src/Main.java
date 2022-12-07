public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;                         // стоимсоть билета
        int miles = service.calculate(price);       // бонустные мили

        System.out.println("Здравствуйте!");
        System.out.println("Вас приветствует программа расчёт бесплатных миль.");

        System.out.println("Стоимость вашего билета "+ price +" рублей.");
        System.out.println("При покупке данного билета, вам будет начисленно "+ miles+ " бесплатные(ых) миль!");
    }
}