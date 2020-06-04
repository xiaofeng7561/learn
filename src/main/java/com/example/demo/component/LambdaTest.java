package com.example.demo.component;

import com.baomidou.mybatisplus.core.toolkit.support.SFunction;

import java.util.concurrent.*;

/**
 * @author AFeng
 * @date 2020/6/3 13:36
 */
public class LambdaTest {


    public static void lambdaFunction(SFunction<String,Boolean> lambda,String[] str){
        for (String s : str) {
            lambda.apply(s);
        }
    }

    @FunctionalInterface
    interface ActionFunction<V,O>{
       boolean test(V v,O o);
    }

    public static void test(ActionFunction<String,String> actionFunction,String a,String b){
        System.out.println(actionFunction.test(a,b));
    }

    public static void test2(ActionFunction<SFunction<String,String>,String> action,SFunction<String,String> sf,String a){
        boolean test = action.test(sf, a);
        System.out.println(sf);
    }



    public static void main(String[] args) {


        ThreadPoolExecutor csf = new ThreadPoolExecutor(2, 4, 500, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), r->new Thread(r, "csf"));

       /*  csf.submit(() -> {
            System.out.println("1");
        });*/


        csf.setRejectedExecutionHandler((r,e)->{

        });

        csf.execute(()->{
            String name = Thread.currentThread().getName();
            System.out.println(name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        csf.execute(()->{
            String name = Thread.currentThread().getName();
            System.out.println(name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        csf.execute(()->{
            String name = Thread.currentThread().getName();
            System.out.println(name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        csf.execute(()->{
            String name = Thread.currentThread().getName();
            System.out.println(name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }





}
