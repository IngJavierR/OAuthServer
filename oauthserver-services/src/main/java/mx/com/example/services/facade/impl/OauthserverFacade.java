package mx.com.example.services.facade.impl;

import mx.com.example.commons.to.UserTO;
import mx.com.example.services.facade.IOauthserverFacade;
import mx.com.example.services.service.IOauthserverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class OauthserverFacade implements IOauthserverFacade {

    @Autowired
    private IOauthserverService oauthserverService;

    public List<UserTO> getAllUsers() {
        return this.oauthserverService.getUsers();
    }
}
