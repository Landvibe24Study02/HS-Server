package landvibe.serverstudy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {

    AtomicInteger num = new AtomicInteger(0);
    @GetMapping("/incr")

    public String incrCnt() {
        num.getAndIncrement();
        return "a 증가";
    }
    @GetMapping
    public String getCount() {
        return "현재 숫자는 " + num.get();
    }

}

