import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    Abonent[] abonents = new Abonent[3];
    abonents[0] = new Abonent("123", "Иванов", "Иван", "Иванович", "Москва", 120.5, "1234-5678-9101-1121", 500.0);
    abonents[1] = new Abonent("124", "Петров", "Петр", "Петрович", "Санкт-Петербург", 45.0, "2234-5678-9101-1122", 100.0);
    abonents[2] = new Abonent("125", "Сидоров", "Сидор", "Сидорович", "Екатеринбург", 200.0, "3234-5678-9101-1123", 200.0);
    System.out.println(abonents[0].toString());

    int TalkTime = 100;

    for (Abonent abonent : abonents) {
        if(abonent.getTalkTime() > TalkTime){
            System.out.println("Абонент: " + abonent.generateId() + " занят");
            System.out.println("Адресс: "+ abonent.getAddress());
            System.out.println("Время разговора: "+ abonent.getTalkTime());
        }
    }

    }
}
