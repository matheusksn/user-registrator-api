package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class PhoneType {

    HOME( description:"Home"),
    MOBILE(description: "Mobile");

    private final String description;
}

