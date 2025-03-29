package org.knit.solutions.second_semestr.lab2_1.task1;

public class JuniorManager extends Approver {
    @Override
    protected  boolean canApprove(int amount){
        return amount <= 1000;
    }

    @Override
    protected void approve(int amount){
        System.out.println("Запрос на сумму $" + amount + " отклонен: превышает лимит.");
    }

}
