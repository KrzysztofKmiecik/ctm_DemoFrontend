package pl.kmiecik.ctm_demofrontend;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceApiImpl implements ServiceApi {
    @Override
    public List<PackageDiscoveryDTO> findByPackageId(String packageId) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        //   ParameterizedTypeReference<PackageDiscoveryDTO[]> typeRef = new ParameterizedTypeReference<PackageDiscoveryDTO[]>() {};

        final String POSITION_URL = "http://localhost:8888/packages/"+packageId+"/discoveries";
        ResponseEntity<PackageDiscoveryDTO[]> exchange = restTemplate.exchange(POSITION_URL,
                HttpMethod.GET,
                httpEntity,
                PackageDiscoveryDTO[].class);
        return Arrays.stream(exchange.getBody()).toList();
    }

    @Override
    public void deleteByPackageIdDiscoveryID(String packageId, String discoveryId) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<Object> httpEntity = new HttpEntity<Object>(httpHeaders);
        //   ParameterizedTypeReference<PackageDiscoveryDTO[]> typeRef = new ParameterizedTypeReference<PackageDiscoveryDTO[]>() {};

        final String POSITION_URL = "http://localhost:8888/packages/"+packageId+"/discoveries/"+discoveryId;
        ResponseEntity<String> exchange = restTemplate.exchange(POSITION_URL,
                HttpMethod.DELETE,
                httpEntity,
                String.class);

    }

    @Override
    public void createNewDiscoveryForPackageId(String packageId) {
     //   String json = "{\"uri\":\"urissgenerated\",\"buoy_number\":\"buoy\",\"detection_timestamp\": \"2022-05-12T12:34:05.215Z\",\"mission_number\": \"3\",\"detection_rms\": 0,\"created_user\": \"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\"updated_user\": \"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\"created_at\": \"\",\"updated_at\": \"2022-05-12T12:34:05.215Z\",\"tag_8\":\"taggg8\",\"tag_9\":\"taggg9\",\"tag_10\":\"taggg10\"}";
       String json= "{\"uri\":\"uriss4\",\"buoy_number\":\"buoy\",\"detection_timestamp\":\"2022-05-12T12:34:05.215Z\",\"mission_number\":\"3\",\"detection_rms\":0,\"created_user\":\"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\"updated_user\":\"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\"created_at\":\"\",\"updated_at\":\"2022-05-12T12:34:05.215Z\",\"tag_8\":\"taggg8\",\"tag_9\":\"taggg9\",\"tag_10\":\"taggg10\"}";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
     //   httpHeaders.setAcceptCharset();
        HttpEntity<Object> httpEntity = new HttpEntity<Object>(json,httpHeaders);
        //   ParameterizedTypeReference<PackageDiscoveryDTO[]> typeRef = new ParameterizedTypeReference<PackageDiscoveryDTO[]>() {};

        final String POSITION_URL = "http://localhost:8888/packages/"+packageId+"/discoveries";
        ResponseEntity<String> exchange = restTemplate.exchange(POSITION_URL,
                HttpMethod.POST,
                httpEntity,
                String.class);
    }

}
