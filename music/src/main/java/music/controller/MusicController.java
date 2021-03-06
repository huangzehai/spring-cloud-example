package music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("music")
public class MusicController {
    @Autowired
    Environment environment;

    @RequestMapping("genre/{songName}")
    public String genre(@PathVariable("songName") String songName) {
        return songName + " Jazz from: " + environment.getProperty("local.server.port");
    }

}
