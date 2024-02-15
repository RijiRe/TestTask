public class Sotrudniki {
    public static void main(String[] args) {
        Sotrudnik[] sotrudniks = new Sotrudnik[5];
        sotrudniks[0] = new Sotrudnik("Джон Уилл", "Manager", "john@google.com", "1234567890", 5000000, 45);
        sotrudniks[1] = new Sotrudnik("Джейн Смит", "Developer", "jane@google.com", "9876543210", 6000000, 28);
        sotrudniks[2] = new Sotrudnik("Майк Джордан", "Designer", "mike@google.com", "456789123", 5500000, 42);
        sotrudniks[3] = new Sotrudnik("Эмили Браун", "HR Specialist", "emily@google.com", "789123456", 4500000, 50);
        sotrudniks[4] = new Sotrudnik("Алекса Грин", "Accountant", "alexa@google.com", "321654987", 4800000, 35);
        for (Sotrudnik sotr : sotrudniks) {
            if (sotr.age > 40) {
                sotr.displayInfo();
            }
        }
    }
    public static class Sotrudnik {
        private String fullName;
        private String dolzhnost;
        private String email;
        private String phone;
        private double zp;
        private int age;
        public Sotrudnik (String fullName, String dolzhnost, String email, String phone, double zp, int age) {
            this.fullName = fullName;
            this.dolzhnost = dolzhnost;
            this.email = email;
            this.phone = phone;
            this.zp = zp;
            this.age = age;
        }
        public void displayInfo() {
            System.out.println("ФИО: " + fullName);
            System.out.println("Должность: " + dolzhnost);
            System.out.println("Почта: " + email);
            System.out.println("Телефон: " + phone);
            System.out.println("Зарплата: " + zp);
            System.out.println("Возраст: " + age);
            System.out.println("------------------");
        }
    }
}