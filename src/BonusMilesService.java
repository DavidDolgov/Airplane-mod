public class BonusMilesService {

    public int calculate(int cost) {
        int couter = 20;                   // делитель для вычисления миль
        int result = cost / couter;
        return result;
    }

}
