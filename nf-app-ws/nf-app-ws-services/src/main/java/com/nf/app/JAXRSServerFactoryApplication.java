/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.nf.app;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.provider.JAXBElementProvider;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.nf.app.bean.pojo.Hylb;
import com.nf.app.dao.system.SystemDao;
import com.nf.app.rest.impl.SystemRestServiceImpl;


//@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan({"com.nf.app"})
public class JAXRSServerFactoryApplication implements CommandLineRunner{
    @Autowired
    private Bus bus;

    private final SystemDao systemDao;

	public JAXRSServerFactoryApplication(SystemDao systemDao) {
		this.systemDao = systemDao;
	}
    
    public static void main(String[] args) {
        SpringApplication.run(new Object[] {JAXRSServerFactoryApplication.class}, args);//,MyBatisApplication.class
    }
 
    @Bean
    public Server rsServer() {
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setBus(bus);
        endpoint.setServiceBeans(Arrays.<Object>asList(new SystemRestServiceImpl()));//getRestClasses()
        endpoint.setAddress("/");
        endpoint.setFeatures(Arrays.asList(new Swagger2Feature()));
        endpoint.setProviders(Arrays.<Object>asList(new JacksonJaxbJsonProvider(),new JAXBElementProvider<Object>(){}));
        endpoint.getInInterceptors().add(new LoggingInInterceptor());
        endpoint.getOutInterceptors().add(new LoggingOutInterceptor());

        return endpoint.create();
    }
    
    private static List<Object> getRestClasses() {
    	List<Object> list = new ArrayList<Object>();
    	ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		try {
			Resource resources[] = resolver.getResources("classpath*:com/**/rest/*/*Impl.class");
			for(Resource resource:resources) {
				String className=resource.getURL().getPath();
				int start = className.indexOf("classes");
				int end = className.lastIndexOf(".class");
				className=className.substring(start, end).replaceAll("/", ".");
				className=className.substring(className.indexOf(".")+1);
				Class<?> cls =Class.forName(className);
				Object restService = cls.getDeclaredConstructors()[0].newInstance();
				list.add(restService);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		return list;
    	
    }
    
	public void run(String... argv) {
		System.out.println(this.systemDao.selectByDlmc("0009").getHymc());
		Map map = new HashMap();
		map.put("tjrq", "20161230");
		map.put("khdxdh", 203);
		List<Hylb> lbs = this.systemDao.selectHylb(map);
		for(Hylb lb :lbs ) {
			System.out.println("lbdh:"+lb.getLbdh()+";lbmc:"+lb.getLbmc());
		}
	}
	
}
