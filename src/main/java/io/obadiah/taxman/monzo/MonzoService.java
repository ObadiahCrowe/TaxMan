package io.obadiah.taxman.monzo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonzoService {

    private final String userId;
    private final String accessToken;

    @Autowired
    public MonzoService() {
        this.userId = System.getenv("MONZO_USER_ID");
        this.accessToken = System.getenv("MONZO_ACCESS_TOKEN");
    }
}
