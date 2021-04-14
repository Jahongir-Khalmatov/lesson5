package lesson5.appjwtrealemailauditing.payload;

import lombok.Data;

@Data
public class LoginDto {
    private String email;
    private String password;
}
