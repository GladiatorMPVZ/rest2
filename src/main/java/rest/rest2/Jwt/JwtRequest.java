package rest.rest2.Jwt;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}
