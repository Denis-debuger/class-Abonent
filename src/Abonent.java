import java.util.ArrayList;
import java.util.List;

public class Abonent {
    // Поля, доступные только внутри класса
    private String id;                // Идентификационный номер
    private String surname;           // Фамилия
    private String name;              // Имя
    private String patronymic;        // Отчество
    private String address;           // Адрес
    private double totalTalkTime;     // Общее время разговора
    private String creditCardNumber;  // Номер кредитной карточки
    private double debit;             // Дебет (Задолженность)

    // Конструктор с полным набором полей
    public Abonent(String id, String surname, String name, String patronymic, String address,
                   double totalTalkTime, String creditCardNumber, double debit) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.totalTalkTime = totalTalkTime;
        this.creditCardNumber = creditCardNumber;
        this.debit = debit;
    }

    // Конструктор с минимальным набором полей (ФИО и адрес)
    public Abonent(String surname, String name, String patronymic, String address) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.totalTalkTime = 0;  // Изначально время разговора 0
        this.debit = 0;          // Изначально задолженность 0
        this.creditCardNumber = ""; // Изначально пустой номер карты
        this.id = generateId();  // Идентификатор генерируется автоматически
    }

    // Генерация идентификационного номера (например, уникальный ID)
    private String generateId() {
        return "ID" + System.currentTimeMillis();
    }

    // Методы для установки значений атрибутов
    public void setId(String id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTotalTalkTime(double totalTalkTime) {
        this.totalTalkTime = totalTalkTime;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    // Методы для получения значений атрибутов
    public String getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public double getTotalTalkTime() {
        return totalTalkTime;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public double getDebit() {
        return debit;
    }

    // Метод для вывода информации об абоненте
    @Override
    public String toString() {
        return "Абонент: " + surname + " " + name + " " + patronymic + "\n" +
                "Адрес: " + address + "\n" +
                "Время разговоров: " + totalTalkTime + " мин\n" +
                "Задолженность: " + debit + "\n" +
                "Номер карты: " + (creditCardNumber.isEmpty() ? "Не указан" : creditCardNumber);
    }

    // Главный метод для тестирования
    public static void main(String[] args) {
        // Создание нескольких абонентов
        Abonent abonent1 = new Abonent("123", "Иванов", "Иван", "Иванович", "Москва", 120.5, "1234-5678-9101-1121", 500.0);
        Abonent abonent2 = new Abonent("124", "Петров", "Петр", "Петрович", "Санкт-Петербург", 45.0, "2234-5678-9101-1122", 100.0);
        Abonent abonent3 = new Abonent("125", "Сидоров", "Сидор", "Сидорович", "Екатеринбург", 200.0, "3234-5678-9101-1123", 200.0);

        // Создание списка абонентов
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(abonent1);
        abonents.add(abonent2);
        abonents.add(abonent3);

        // Заданный порог времени разговоров
        double timeThreshold = 100.0;

        // Вывод информации об абонентах, у которых время разговоров превышает заданный порог
        System.out.println("Абоненты с временем разговоров больше " + timeThreshold + " минут:");
        for (Abonent abonent : abonents) {
            if (abonent.getTotalTalkTime() > timeThreshold) {
                System.out.println(abonent);
                System.out.println();
            }
        }
    }
}

