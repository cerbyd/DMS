package dto;

import javax.validation.constraints.Size;

/**
 *
 */
public final class InvoiceDto {
  @Size(min = 5)
    public String title;
    
    @Size(min = 5)
    public String content;
}
