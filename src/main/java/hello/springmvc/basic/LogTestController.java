package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass());


    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // log.trace("trace my log = " + name); 호출이 일어나지 않아도  + 연산이 일어나 메모리를 사용한다.
        log.trace("trace log = {}",name);
        log.debug("debug log = {}",name);
        log.info("info log = {}",name);
        log.warn("warn log = {}",name);
        log.error("error log = {}",name);

        return "ok";

    }
}
