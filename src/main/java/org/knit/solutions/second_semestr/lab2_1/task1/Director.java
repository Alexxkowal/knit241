package org.knit.solutions.second_semestr.lab2_1.task1;

public class Director extends  Approver {
    @Override
    protected boolean canApprove(int amount){
        return amount<=100000;
    }
    @Override
    protected void approve(int amount){
        System.out.println("Директор одобрил запрос на $" + amount);
    }
}
