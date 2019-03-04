package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroyed ... ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean initialized ... ");
    }

    public void customInit(){
        System.out.println("Custom Bean Init method ... ");
    }
    public void customDestroy(){
        System.out.println("Custom Bean Destroy method ... ");
    }
}
