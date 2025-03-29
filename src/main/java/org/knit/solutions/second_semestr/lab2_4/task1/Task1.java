package org.knit.second_semestr.lab2_4.task1;

public class Task1 {
    public static void execute(){
        Stock apple = new Stock("Apple", 150.0);
        Stock google = new Stock("Google", 2800.0);

        MobileApp app = new MobileApp();
        EmailNotifer emailNotifer = new EmailNotifer("aaaa@.com");

        app.buyStock(apple);
        app.buyStock(google);

        try {
            app.subscribeNotify("Apple");
            app.subscribeNotify("Google");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        apple.changePrice(155.0);
        google.changePrice(2700.0);

        try {
            app.unsubscribeNotify("Google");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        apple.changePrice(160.0);
        google.changePrice(2600.0);
    }
}
