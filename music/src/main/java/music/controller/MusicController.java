package music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {
    @Autowired
    Environment environment;

    @RequestMapping("music")
    public String music() {
        return "Jazz from: " + environment.getProperty("local.server.port");
    }

}
