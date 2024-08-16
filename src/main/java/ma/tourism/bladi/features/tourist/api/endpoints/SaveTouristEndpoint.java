package ma.tourism.bladi.features.tourist.api.endpoints;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveTouristEndpoint {
    @PostMapping("tourists")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity saveTourist(){
        return ResponseEntity.ok().build();
    }
}
