import ru.netology.services.CalcService;

public class Main {

    public static void main(String[] args) {
        CalcService service = new CalcService();
        int expected = 3;
        int actual = service.calculate(10_000,3_000, 20_000);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 2;
        actual = service.calculate(100_000,60_000, 150_000);
        System.out.println("2. " + expected + " == ? == " + actual);
    }
}
