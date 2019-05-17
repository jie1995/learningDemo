package ThreadPoolExecuters;

import java.util.concurrent.*;

/**
 * @Author: 微笑天使
 * @Date: 2019/5/13 17:04
 * @Version 1.0
 */
public class ThreadPoolExcecuters {

    public static ExecutorService getExecuteService() {
        //构造参数直接阅读源码此部分
        return new ThreadPoolExecutor(13, 13, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(13));
    }


    public static void main(String[] args) {
        /**
         * FixedThreadPool： 该方法返回一个固定线程数量的线程池。该线程池中的线程数量始终不变。当有一个新的任务提交时，线程池中若有空闲线程，则立即执行。若没有，则新的任务会被暂存在一个任务队列中，待有线程空闲时，便处理在任务队列中的任务。
         * SingleThreadExecutor： 方法返回一个只有一个线程的线程池。若多余一个任务被提交到该线程池，任务会被保存在一个任务队列中，待线程空闲，按先入先出的顺序执行队列中的任务。
         * CachedThreadPool： 该方法返回一个可根据实际情况调整线程数量的线程池。线程池的线程数量不确定，但若有空闲线程可以复用，则会优先使用可复用的线程。若所有线程均在工作，又有新的任务提交，则会创建新的线程处理任务。所有线程在当前任务执行完毕后，将返回线程池进行复用。
         * ScheduledThreadPoolExecutor： 主要用来在给定的延迟后运行任务，或者定期执行任务。ScheduledThreadPoolExecutor又分为：ScheduledThreadPoolExecutor（包含多个线程）和SingleThreadScheduledExecutor （只包含一个线程）两种。
         */
        // 《阿里巴巴Java开发手册》中强制线程池不允许使用 Executors 去创建，而是通过 ThreadPoolExecutor 构造函数 的方式，这样的处理方式让写的同学更加明确线程池的运行规则，规避资源耗尽的风险。
        // ExecutorService e = Executors.newFixedThreadPool(5);
    }
}
