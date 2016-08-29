package com.pentahohub.boot.snowflake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootSnowflakeApplication extends SpringBootServletInitializer {

  public static void main( String[] args ) {
    SpringApplication.run( SpringBootSnowflakeApplication.class, args );
  }

}
