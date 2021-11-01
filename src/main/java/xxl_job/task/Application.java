package xxl_job.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className Application
 * @author bangmin.mai
 * @description 启动类
 * @updateTime 2021/10/22 23:14
 * @version 1.0
 */

/*
    XXL-JOB 运行需要在调度中心进行相关的配置



 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
