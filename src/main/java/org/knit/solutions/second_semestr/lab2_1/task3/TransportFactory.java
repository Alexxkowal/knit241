package org.knit.solutions.second_semestr.lab2_1.task3;

public class TransportFactory {
    Transport transport;
    public Transport createTransport(String type){
        switch (type){
            case "buisness":
                return new BuisnessClass();
            case "family":
                return new FamulyVan();
            case "delivery":
                return new Motorbike();
            default:
                System.out.println("Введите тип");
                return null;
        }
    }
}
