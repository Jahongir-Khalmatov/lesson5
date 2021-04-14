package lesson5.appjwtrealemailauditing.controller;

import lesson5.appjwtrealemailauditing.payload.LoginDto;
import lesson5.appjwtrealemailauditing.security.JwtProvider;
import lesson5.appjwtrealemailauditing.service.MyAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class AuthController {
@Autowired
    JwtProvider jwtProvider;
@Autowired
    MyAuthService myAuthService;
    @Autowired
    AuthenticationManager authenticationManager;
@PostMapping("/login")
public HttpEntity<?> loginIntoSystem(@RequestBody LoginDto loginDto){
try {


    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword()));
    String token = jwtProvider.generateToken(loginDto.getEmail());
return ResponseEntity.ok(token);
}catch (BadCredentialsException badCredentialsException){
   return ResponseEntity.status(401).body("Login yoki parol xato");


}
}
}
