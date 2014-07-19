package controllers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import dao.InvoiceDao;
import dto.InvoiceDto;
import ninja.Context;
import ninja.Result;
import ninja.Results;
import ninja.validation.JSR303Validation;
import ninja.validation.Validation;

/**
 *
 */
@Singleton
public final class InvoicesController {
    
    @Inject
    InvoiceDao invoiceDao;

    public Result newInvoice() {
        return Results.html();
    }
    
     public Result createInvoice(Context context,
                                 @JSR303Validation InvoiceDto invoiceDto,
                                 Validation validation) {

        if (validation.hasViolations()) {
            context.getFlashScope().error("Please correct field.");
            context.getFlashScope().put("title", invoiceDto.title);
            context.getFlashScope().put("content", invoiceDto.content);
            return Results.redirect("/invoices/new");
        } else {
            
            invoiceDao.createInvoice(invoiceDto);
            
            context.getFlashScope().success("New Invoice created.");
            
            return Results.redirect("/");

        }

    }

}
