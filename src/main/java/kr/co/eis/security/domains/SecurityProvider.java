package kr.co.eis.security.domains;

import kr.co.eis.auth.domains.Role;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.message.AuthException;
import javax.security.auth.message.config.AuthConfigProvider;
import javax.security.auth.message.config.ClientAuthConfig;
import javax.security.auth.message.config.ServerAuthConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

/**
 * packageName: kr.co.eis.security.domains
 * fileName   : SecurtiyProvider
 * author     : MinHye_Sim
 * date       : 2022-05-23
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-23   MinHye_Sim   최초 생성
 */
@Log
@Component
@RequiredArgsConstructor
public class SecurityProvider implements AuthenticationProvider {

    private final UserDetailsServiceImpl service;

    @Value("${security.jwt.token.security-key:secret-key}")
    private String securitykey;

    @Value("${security.jwt.token.expiration-length:3600000}")
    private long validityInMs = 3600000; //1h

    @PostConstruct
    protected void init(){
        securitykey = Base64.getEncoder().encodeToString(securitykey.getBytes());
        log.info("securitykey: "+securitykey);
    }

    public String createToken(String username, List<Role> roles){
        return "";
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
