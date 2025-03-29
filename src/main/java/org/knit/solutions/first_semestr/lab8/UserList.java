package org.knit.solutions.first_semestr.lab8;

import java.io.*;
import java.util.ArrayList;

public class UserList {
    private ArrayList<User> userArrayList;
    public UserList(){
        this.userArrayList = new ArrayList<>();
    }
    public void addList(User user){
        userArrayList.add(user);
    }
    public void showList(){
        for(User user:userArrayList){
            System.out.println(user.getName());
        }
    }
    public void saveInFile(){
        if (userArrayList.isEmpty()) {
        System.out.println("Список пользователей пуст. Сохранение невозможно.");
        return; // Завершаем метод, если список пуст
    }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))){
            oos.writeObject(userArrayList);
            System.out.println("Успешно");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void loadFromFile(){
        File file = new File("user.ser");

    if (!file.exists()) {
        System.out.println("Файл не найден.");
        return;
    }

    if (file.length() == 0) {
        System.out.println("Файл пуст. Загрузка невозможна.");
        return;
    }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))){
            ArrayList<User> deserArr  = (ArrayList <User>) ois.readObject();
            userArrayList = deserArr;
            System.out.println("Успешно");
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
        catch (EOFException e){
            System.out.println("Файл пустой");
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
