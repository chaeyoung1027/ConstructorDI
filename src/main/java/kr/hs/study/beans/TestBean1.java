package kr.hs.study.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;

    public TestBean1(){
        this.data1 = 0;
        this.data2 = 0.0;
        this.data3 = "spring";
    }

    public TestBean1(int data1){
        System.out.println("TestBean1의 int형 데이터를 갖는 생성자");
        this.data1 = data1;
        this.data2 = 1.1;
        this.data3 = "spring1";
    }

    public TestBean1(double data2){
        System.out.println("TestBean1의 double형 데이터를 갖는 생성자");
        this.data1 = 2;
        this.data2 = data2;
        this.data3 = "spring2";
    }
    public TestBean1(String data3){
        System.out.println("TestBean1의 String형 데이터를 갖는 생성자");
        this.data1 = 2;
        this.data2 = 1.1;
        this.data3 = data3;
    }

    public void prData(){
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        System.out.println("data3 : " + data3);
    }

}
