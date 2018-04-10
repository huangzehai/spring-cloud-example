package feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("music")
public interface MusicService {
    @RequestMapping(method = RequestMethod.GET, value = "/music/genre/{songName}")
    String genre(@PathVariable("songName") String songName);
}
