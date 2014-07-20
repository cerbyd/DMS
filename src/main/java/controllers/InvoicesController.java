package controllers;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import dao.CustomerDao;
import dao.InvoiceDao;
import dto.InvoiceDto;
import java.util.List;
import java.util.Map;
import models.Customer;
import models.Invoice;
import ninja.Context;
import ninja.Result;
import ninja.Results;
import ninja.params.PathParam;
import ninja.utils.NinjaConstant;
import ninja.validation.JSR303Validation;
import ninja.validation.Validation;

/**
 *
 */
@Singleton
public final class InvoicesController {

    @Inject
    InvoiceDao invoiceDao;

    @Inject
    CustomerDao customerDao;

    public Result index() {
        List<Invoice> invoices = invoiceDao.getAll();
        Map<String, Object> map = Maps.newHashMap();
        map.put("invoices", invoices);

        return Results.html().render("invoices", invoices);
    }

    public Result showInvoice(@PathParam("invoiceNumber") String invoiceNumber) {
        Invoice invoice = invoiceDao.getInvoice(invoiceNumber);

        if (invoice != null) {
            return Results.html().render("invoice", invoice);
        } else {
            return Results
                    .notFound()
                    .render("Can't find that Invoice.")
                    .template(NinjaConstant.LOCATION_VIEW_FTL_HTML_NOT_FOUND);
        }

    }

    public Result deleteInvoice(Context context, @PathParam("invoiceNumber") String invoiceNumber) {
        invoiceDao.delete(invoiceNumber);
        context.getFlashScope().success("Invoice delete.");
        return Results.redirect("/invoices/");
    }

    public Result newInvoice() {
        List<Customer> customers = customerDao.getAll();
        Map<String, Object> map = Maps.newHashMap();
        map.put("customers", customers);

        return Results.html().render("customers", customers);
    }

    public Result createInvoice(Context context,
            @JSR303Validation InvoiceDto invoiceDto,
            Validation validation) {

        if (validation.hasViolations()) {
            context.getFlashScope().error("Please correct field.");
            context.getFlashScope().put("invoiceNumber", invoiceDto.invoiceNumber);
            return Results.redirect("/invoices/new");
        } else {
            invoiceDao.createInvoice(invoiceDto);
            context.getFlashScope().success("New Invoice created.");
            return Results.redirect("/invoices/");

        }

    }

}
