package lesson5.appjwtrealemailauditing.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;
@Component
public class JwtProvider {
    public static final long expiredTime=10*20*30*40;
    public static final String killingWord="IfSomeOneKnowsYouWillBeKilled";
public String generateToken(String email){
    return Jwts
            .builder()
            .setSubject(email)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis()+expiredTime))
            .signWith(SignatureAlgorithm.HS512,killingWord)
            .compact();

}
public boolean validationToken(String token){
    try {
Jwts
        .parser()
        .setSigningKey(killingWord)
        .parseClaimsJws(token);
return true;
    }catch (Exception e){
     e.printStackTrace();
    return false;
    }

}
public String getUSerNameFromToken(String token){
return Jwts
        .parser()
        .setSigningKey(killingWord)
        .parseClaimsJws(token)
        .getBody()
        .getSubject();
}
}
