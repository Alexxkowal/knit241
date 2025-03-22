package org.knit.solutions;

import org.knit.TaskDescription;

@TaskDescription(taskNumber = 17, taskDescription = "Краткое описание задачи 17", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task17 implements Solution {

    @Override
    public void execute() {
        System.out.println("Запущена");
    }
}
