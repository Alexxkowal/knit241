package org.knit.solutions.second_semestr.lab2_1.task1;

public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover;
    }

    public void processRequest(int amount){
        if (canApprove(amount)){
            approve(amount);
        }
        else if (nextApprover != null){
            nextApprover.processRequest(amount);
        }
        else{
            System.out.println("Запрос на сумму $" + amount + " отклонен: превышает лимит.");
        }
    }
    protected abstract boolean canApprove(int amount);
    protected abstract void approve(int amount);
}
