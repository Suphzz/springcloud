package springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author superhzh
 * @version 1.0
 * @date 2020/4/28 22:46
 */
@RestController
@Slf4j
public class coachProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/coach/nacos/{id}")
    public String getCoach(@PathVariable("id") Integer id)
    {
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }





}
