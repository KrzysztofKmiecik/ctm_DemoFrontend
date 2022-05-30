package pl.kmiecik.ctm_demofrontend.ais;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceAisImpl implements ServiceAis {
    @Value(value = "${serviceAis.url}")
    private String url;

    @Override
    public List<SearchingResult> getLocation() {
        String json = "[{\"key\":\"ATTRIBUTES\",\"operand\":\"LIKE\",\"value\":\"{\\\"key\\\":\\\"key1\\\",\\\"value\\\":\\\"value1\\\"}\"}]";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity httpEntity = new HttpEntity(json, httpHeaders);
        final String POSITION_URL = url;
        ResponseEntity<SearchingResult[]> exchange = restTemplate.exchange(POSITION_URL,
                HttpMethod.POST,
                httpEntity,
                SearchingResult[].class);
        return Arrays.stream(exchange.getBody()).toList();
    }
}
