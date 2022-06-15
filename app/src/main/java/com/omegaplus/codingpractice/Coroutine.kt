package com.omegaplus.codingpractice
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main(){
//    mainThread()
//    workerThread()
//    coroutine()
    suspendFunction()
}

fun suspendFunction() {
    GlobalScope.launch {
        println("Hi First")
        printName()
        println("Hi end")

    }
    Thread.sleep(3000)
}
suspend fun printName(){
    delay(1000)
    println("Raka")
}

fun coroutine() {

    //1. create a background coroutine that runs on a background thread
    /* println("Thread ${Thread.currentThread().name}: Started")
    GlobalScope.launch {
        println("Thread ${Thread.currentThread().name}: Started")
        delay(1000) // For do some work.... may be File uploading
        println("Thread ${Thread.currentThread().name}: End")
    }
    println("Thread ${Thread.currentThread().name}: End") */

    // Output : Application does not wait for finish the coroutine
    /* Thread main: Started
       Thread main: End
       Process finished with exit code 0 */


    //2. create a background coroutine that runs on a background thread
    /* println("Thread ${Thread.currentThread().name}: Started")


    GlobalScope.launch {
        println("Thread ${Thread.currentThread().name}: Started")
        delay(1000)
        println("Thread ${Thread.currentThread().name}: End")
    }
    Thread.sleep(2000) // wait for finish the coroutine but not use this in practically
    println("Thread ${Thread.currentThread().name}: End") */

    // Output
    /* Thread main: Started
        Thread DefaultDispatcher-worker-1: Started
        Thread DefaultDispatcher-worker-1: End
        Thread main: End

        Process finished with exit code 0 */



    // create a thread
    /* thread {
        Thread.sleep(1000)
    } */

    // Operates within a thread
    /* GlobalScope.launch {
        Thread.sleep(1000)
    } */

    // Difference between delay() and Thread.sleep()
    // delay suspend only coroutine but Thread.sleep blocked the thread
    // on a thread multiple coroutine can run

    GlobalScope.launch {  }  // non blocking in nature//
    runBlocking {  } // blocks thread in which it operates

 }

fun workerThread() {
    println("Thread ${Thread.currentThread().name}: Started")

    // This is the worker thread and does not block main thread
    thread {
        println("Thread ${Thread.currentThread().name}: Started")
        Thread.sleep(1000)
        println("Thread ${Thread.currentThread().name}: End")
    }
    println("Thread ${Thread.currentThread().name}: End")

    // Output
        /*  Thread main: Started
        Thread Thread-0: Started
        Thread main: End
        Thread Thread-0: End
        Process finished with exit code 0 => Application wait for finish all the background thread
        */

}

fun mainThread() {
    println("Thread ${Thread.currentThread().name}: Started")
    println("Thread ${Thread.currentThread().name}: End")

    // Output
    /*  Thread main: Started
    Thread main: End
    Process finished with exit code 0
    */
}
