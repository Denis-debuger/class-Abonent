public class Abonent {
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private double talkTime;
    private String creditCardNumber;
    private Double Debt;

    public Abonent(String id, String name, String surname, String patronymic, String address, double talk_time, String credit_card_number, double debt) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.talkTime = talk_time;
        this.creditCardNumber = creditCardNumber;
        Debt = debt;
    }

    public Abonent(String name, String patronymic, String surname, String address) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.address = address;
    }

    public String generateId() {
        return "ID" + System.currentTimeMillis();
    }

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

    public void settalkTime(double talkTime) {
        this.talkTime = talkTime;
    }

    public void setcreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setDebt(double Debt) {
        this.Debt = Debt;
    }


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

    public double getTalkTime() {
        return talkTime;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public double getDebt() {
        return Debt;
    }
}
