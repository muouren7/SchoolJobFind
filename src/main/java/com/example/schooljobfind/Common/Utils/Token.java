package com.example.schooljobfind.Common.Utils;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class Token {
    Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public String createToken(String subject){

        String jws = Jwts.builder().setSubject(subject).signWith(key).setExpiration(new Date(new Date().getTime() + 5000)).compact();
        return jws;
    }

    public Boolean varity(String jws){
        try {
            String subject = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(jws).getBody().getSubject();
            System.out.println("验证通过");
            System.out.println(subject);
            return true;
        }catch (JwtException e){
            System.out.println("验证失败");
            return false;
        }
    }
}