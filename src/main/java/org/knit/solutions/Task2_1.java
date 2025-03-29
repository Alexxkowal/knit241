package org.knit.solutions;

import org.knit.solutions.second_semestr.lab2_1.task1.Approver;
import org.knit.solutions.second_semestr.lab2_1.task1.Director;
import org.knit.solutions.second_semestr.lab2_1.task1.JuniorManager;
import org.knit.solutions.second_semestr.lab2_1.task1.SeniorManager;

public class Task2_1 {
    public void execute(){
        Approver junior = new JuniorManager();
        Approver senior = new SeniorManager();
        Approver director = new Director();

        junior.setNextApprover(senior);
        senior.setNextApprover(director);

        junior.processRequest(500);   // Младший менеджер одобряет
        junior.processRequest(5000);  // Старший менеджер одобряет
        junior.processRequest(20000); // Директор одобряет
        junior.processRequest(100000); // Превышает лимит – запрос отклонен
    }
}
