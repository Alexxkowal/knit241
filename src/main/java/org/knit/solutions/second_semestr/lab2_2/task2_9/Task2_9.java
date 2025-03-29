package org.knit.second_semestr.lab2_2.task2_9;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/*
2.9 Задача «Конвейер сборки деталей»
Описание задачи
На заводе работают три типа рабочих, каждый из которых выполняет свою часть работы в конвейерном режиме:

Штамповщик – вырезает заготовку (создает объект детали).
Сборщик – собирает из заготовки готовую деталь.
Оператор контроля качества – проверяет деталь и отправляет на склад.
Каждый рабочий – отдельный поток, и они должны работать последовательно, используя общую очередь для передачи деталей.

Требования к решению
Использовать потоки (Thread или ExecutorService).
Использовать синхронизацию (wait(), notify(), BlockingQueue).
Реализовать конвейерную передачу данных между потоками.
 */
public class Task2_9 {
    public void execute() {
        BlockingQueue<Detail> assemblingQueue = new LinkedBlockingQueue<>();
        BlockingQueue<Detail> stempingQueue = new LinkedBlockingQueue<>();
        BlockingQueue<Detail> checkingQueue = new LinkedBlockingQueue<>();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Stamper(stempingQueue));
        executorService.submit(new Assembler(stempingQueue, assemblingQueue));
        executorService.submit(new Operator(assemblingQueue, checkingQueue));
        executorService.shutdown();
    }


}
