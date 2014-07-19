package controllers;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import dao.InvoiceDao;
import dto.InvoiceDto;
import java.util.List;
import java.util.Map;
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

    public Result newInvoice() {
        return Results.html();
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
