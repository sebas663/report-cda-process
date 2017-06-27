package org.fleni.cda;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 
 * @author sescudero
 *
 */
@SpringBootApplication
@EnableAsync
public class ReportCdaProcessApplication {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ReportCdaProcessApplication.class, args);
	}
	
	/**
	 * 
	 * @return
	 */
	@Bean
	@Qualifier("executorService")
    public ExecutorService asyncExecutorService() {
        return  Executors.newFixedThreadPool(2);
    }
	
	/**
	 * 
	 * @return
	 */
	@Bean
	@Qualifier("executor")
	public Executor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("CdaProcess-");
        executor.initialize();
        return executor;
    }
}
