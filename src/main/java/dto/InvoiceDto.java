package dto;

import javax.validation.constraints.Size;

/**
 *
 */
public final class InvoiceDto {

    
    
    @Size(min = 1)
    public String invoiceNumber;
    
    
    

}
