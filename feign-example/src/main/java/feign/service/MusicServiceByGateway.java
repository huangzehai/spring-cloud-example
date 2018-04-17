package feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("gateway")
public interface MusicServiceByGateway {
    @RequestMapping(method = RequestMethod.GET, value = "/music/music/genre/{songName}")
    String genre(@PathVariable("songName") String songName);
}
