package com.example.tasktime.tasktime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sun.tools.jar.CommandLine;

import java.util.Arrays;

/**
 * @author zhangtao
 * @date  创建时间 2019/11/27
 */
public class CommandLines {

  private static final Logger logger = LoggerFactory.getLogger(CommandLines.class);

    /**
     *
     * @author
     * @since
     */
    @Component
  @Order(1)
  public static   class CommandLineAppStartuRunner implements CommandLineRunner{

      @Override
      public void run(String... args) throws Exception {
        logger.info("[CommandLineRunner]Application started with command-line arguments: {} .To kill this application, press Ctrl + C.", Arrays.toString(args));
      }


    }

  /**
   *
   * @author
   * @since
   */
  @Component
  @Order(2)
  public static class AppStartupRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
      logger.info("[ApplicationRunner]Your application started with option names : {}", args.getOptionNames());
    }


  }

  public static void main(String[] args) {

  }


}
