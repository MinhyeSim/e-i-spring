package kr.co.eis.auth.domains;

import io.jsonwebtoken.*;
import lombok.extern.java.Log;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName: kr.co.eis.security.domains
 * fileName   : SecurityToken
 * author     : MinHye_Sim
 * date       : 2022-05-23
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-23   MinHye_Sim   최초 생성
 */
@Log
public class AuthToken {
    private String token;
    private String key;

    public AuthToken(String key){
        this.key = key;
        this.token = createToken();
    }

    private String createToken(){
        try{
            Map<String, Object> headers = new HashMap<>();
                    //해시맵
            headers.put("typ","JWT");
            headers.put("alg","HS256");
            Map<String, Object> payload = new HashMap<>();
            headers.put("data","blahblah");
            Date ext = new Date();
            return Jwts.builder()
                    .setHeader(headers)
                    .setPayload("user")
                    .setSubject(ext)
                    .sigWith(SignatureAlgorithm.HS256, key.getBytes())
                    .compact();
        }
        catch (SecurityException e){log.info("SecurityException JWT");}
        catch (MalformedJwtException e){log.info("MalformedJwtException JWT");}
        catch (ExpiredJwtException e){log.info("ExpiredJwtException JWT");}
        catch (UnsupportedJwtException e){log.info("UnsupportedJwtException JWT");}
        catch (IllegalAccessError e){log.info("IllegalAccessError JWT");}
        return null;
    }
}
