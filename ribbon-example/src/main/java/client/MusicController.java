package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    @Autowired
    private MusicService musicService;

    @RequestMapping("/music")
    public String music() {
        return musicService.music();
    }
}
