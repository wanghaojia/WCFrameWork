package org.wcframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wcframework.entity.DemoAnnotationEntity;
import org.wcframework.entity.DemoEntity;

/**
 * @author haojia.wang
 * @version v1.0
 * @Package org.wcframework.test
 * @Description 测试类
 * @date 2018/3/9 11:29
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-context.xml");

        DemoEntity bean = (DemoEntity) context.getBean("bean1");
        DemoAnnotationEntity annotationBean = context.getBean(DemoAnnotationEntity.class);
        System.out.println(bean);
        System.out.println(annotationBean);

        String[] a = new String[]{"","",""};
    }

}
