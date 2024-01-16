package com.singard.unlimitedcopies;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class StartupRunner implements ApplicationRunner  {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
        log.info("Application running");
	}
	 
	
	

}
