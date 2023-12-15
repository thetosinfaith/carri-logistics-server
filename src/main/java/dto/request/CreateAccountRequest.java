package dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAccountRequest {
    @Getter
    private String name;
    private String email;




}
