package dto;

import javax.validation.constraints.Size;

/**
 *
 */
public final class CustomerDto {

    @Size(min = 1)
    public String reference;

}
