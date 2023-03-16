package kr.hs.study;

import kr.hs.study.beans.DataBean;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
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
//        System.out.println(" ============================== ");
//        TestBean2 obj5 = ctx.getBean("t5", TestBean2.class);
//        obj5.prData();
//        System.out.println(" ============================== ");

        System.out.println(" ============================== ");
        TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
        obj6.prData();

    ctx.close();
}
}