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
import java.util.Collections;

import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.MetricReaderPublicMetrics;
import org.springframework.boot.actuate.endpoint.MetricsEndpoint;
import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.actuate.metrics.reader.MetricRegistryMetricReader;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.codahale.metrics.MetricRegistry;


@SpringBootApplication
@EnableAutoConfiguration
public class MetricRegistryApplication implements CommandLineRunner{
	            
    @Bean
    public MetricRegistry metricRegistry() {
        return new MetricRegistry();
    }

    @Bean
    public MetricsEndpoint metricsEndpoint(final MetricRegistry registry) {
        PublicMetrics pm = new MetricReaderPublicMetrics(new MetricRegistryMetricReader(registry));
        MetricsEndpoint endPoint = new MetricsEndpoint(Collections.singleton(pm));
                
		return endPoint;
    }
    
    
    public static void main(String[] args) {
        SpringApplication.run(new Object[] {MetricRegistryApplication.class}, args);//,MyBatisApplication.class
    }
 

	public void run(String... argv) {
		
	}
	
}
