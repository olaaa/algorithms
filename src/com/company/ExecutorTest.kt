package com.company

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit


fun main() {
    val i = 10
    val threadPool = Executors.newFixedThreadPool(i)!!

    val tasks = generateSequence(1) { it + 1 }.take(i)
        .map {
            Callable {
                println("start task $it")
                Thread.sleep(TimeUnit.SECONDS.toMillis(12 - it.toLong())) // чем меньше индекс, тем дольше спит. Нужно для
// чтобы понять, таски выполнятся по порядку или сначала самая легкая. Сначала выполняется самая легкая, хоть и добавляется
// в список послденей
                println("complete task $it")
                it
            }
        }
        .toMutableSet()

    val start = System.currentTimeMillis()

    val futures: MutableList<Future<Int>> = threadPool.invokeAll(tasks)
    println("sum " + futures.sumOf {
        val result = it.get()
        println("$result.get() invoked")
        return@sumOf result
    })

    val totalTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start)
    println("totalTime $totalTime") // равно времени выполнения самой долгой таски

    /* invoke all.
        Future.isDone() is true for each element of the returned list.
    Метод вернет результат, когда каждая из тасок таски вернёт результат. Для случая, когда нужно
    дождаться результатов всех вызовов, метод подходит. Но если, допустим, нужно вернуть результат таски, которая
    выполнилась быстрее всех, этот метод не подходит, ибо ждем самую долгую.
                for (int i = 0, size = futures.size(); i < size; i++) {
                Future<T> f = futures.get(i);
                if (!f.isDone()) {
                        f.get(); // блокируемся, если future не готов
                }
            }
     */

    threadPool.shutdownNow(); // завершает программу
}