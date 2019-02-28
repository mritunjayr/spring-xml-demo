//Task 1: Create a Maven project and add required dependency of spring-context5.1.4.RELEASECreate a Main class in package
// com.stackroute and two Spring Beans –  Movie, and Actor in package com.stackroute.domain. Actor has two String properties,
// name and gender, and an age property of type int. An Actor can be initialized with the three properties via the corresponding
// setter methods. Use property based injection in the bean definition file (beans.xml) Movie “has a” Actor that can be initialized
// via the corresponding setter method. Use property based object injection in the bean definition file (beans.xml) The Main class looks
// up Movie bean via three ways to print out actor information: 1.Using XmlBeanFactory2.Using Spring 3.2 BeanDefinitionRegistry and
// BeanDefinitionReader3.Using ApplicationContextCreate a spring-xml-demo repo and push the code to master branch.

package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        // using XmlBeanFactory
        Resource resource=new FileSystemResource("src/main/resources/beans.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        Movie movie=(Movie)factory.getBean("movie");
        System.out.println(movie);

        // using ApplicationContext
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2=(Movie)factory.getBean("movie");
        System.out.println(movie2);

        //using BeanDefinitionRegistry and BeanDefinitionReader

        BeanDefinitionRegistry beanDefinitionRegistry=(BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();

        GenericBeanDefinition definition=new GenericBeanDefinition();
        definition.setBeanClass(Movie.class);
        definition.setAutowireCandidate(true);
        MutablePropertyValues mutablePropertyValues=new MutablePropertyValues();
        beanDefinitionRegistry.registerBeanDefinition("movie2",definition);


        Movie movie1=(Movie)context.getBean("movie2");
        System.out.println(movie1);


        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        Movie movie3=(Movie)factory.getBean("movie");
        System.out.println(movie3);
    }
}
