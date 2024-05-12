import org.example.javaqahw.services.HoliService;

public class Main {
    public static void main(String[] args) {
        HoliService service = new HoliService();
        int count = service.calculate(10000, 3000, 20000);
        System.out.println(count);
    }
}
