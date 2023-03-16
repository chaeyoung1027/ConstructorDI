package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);   //TestBean의 객체를 만들 때 그 안에 있던 TestBean의 기본생성자가 출력
        obj1.prData();
        System.out.println(" ============================== ");
        TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
        obj2.prData();
        TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
        obj3.prData();
        System.out.println(" ============================== ");
        TestBean1 obj4 = ctx.getBean("t4", TestBean1.class);
        obj4.prData();

    ctx.close();
}
}