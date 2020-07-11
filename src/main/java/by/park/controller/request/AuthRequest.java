package by.park.controller.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(description = "Authentication request with login and password")
public class AuthRequest {
    private String username;
    private String password;
}