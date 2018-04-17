package feign.controller;

import feign.service.MusicServiceByGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("music")
public class MusicController {
    @Autowired
    private MusicServiceByGateway musicService;

    @RequestMapping("genre/{songName}")
    public String genre(@PathVariable("songName") String songName) {
        return musicService.genre(songName);
    }
}
