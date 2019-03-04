**Task 5:** 

From the `aware-interface` branch of `spring-xml-demo` repo create a `bean-lifecyclebranch`.
 
 Add a BeanLifecycleDemoBean class in com.stackroute.demo that implements InitializingBean and DisposableBean. 
 
 Override the required methods to print out messages. Define BeanLifecycleDemoBean as a bean in beans.xml. 
 
 Run the application and observe the result.
 
  
Add two methods customInit() and customDestroy() to the  BeanLifecycleDemoBeanclass and print out custom messages.
 
 In the BeanLifecycleDemoBean bean definition, in beans.xml, set the customInit()and customDestroy() methods to be called.
 
 Run the application. Push the code to bean-lifecycle bran