package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MusicService {
    @Autowired
    RestTemplate restTemplate;

    public String music() {
        return restTemplate.getForObject("http://music/music/genre",String.class);
    }
}
