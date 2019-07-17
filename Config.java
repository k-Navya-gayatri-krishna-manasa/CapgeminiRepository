package com.cg.withAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Tyre tyre() {
		return new Tyre("MRF Tyres","black");
	}
	@Bean(initMethod="setUp",destroyMethod="cleanUp")
	public BMW bwm() {
		return new BMW(321,"Sai",tyre());
	}
	@Bean(initMethod="setUp",destroyMethod="cleanUp")
	public Benz benz(){
		Benz benz=new Benz();
		benz.setCarNo(456);
		benz.setCustomerName("Chitti");
		benz.setTyre(tyre());
		return benz;	
	}
}
