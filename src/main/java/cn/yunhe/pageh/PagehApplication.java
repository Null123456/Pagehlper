package cn.yunhe.pageh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.yunhe.pageh.mapper")
public class PagehApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagehApplication.class, args);
    }

}
