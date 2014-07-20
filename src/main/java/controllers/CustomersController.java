package controllers;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import dao.CustomerDao;
import dto.CustomerDto;
import java.util.List;
import java.util.Map;
import models.Customer;
import models.Invoice;
import ninja.Context;
import ninja.Result;
import ninja.Results;
import ninja.params.PathParam;
import ninja.validation.JSR303Validation;
import ninja.validation.Validation;

public class CustomersController {

    @Inject
    CustomerDao customerDao;
    
     public Result index() {
        List<Customer> customers = customerDao.getAll();
        Map<String, Object> map = Maps.newHashMap();
        map.put("customers", customers);

        return Results.html().render("customers", customers);
    }
    
    public Result newCustomer() {
        return Results.html();
    }

    public Result createCustomer(Context context,
            @JSR303Validation CustomerDto customerDto,
            Validation validation) {

        if (validation.hasViolations()) {
            context.getFlashScope().error("Please correct field.");
            context.getFlashScope().put("reference", customerDto.reference);
            return Results.redirect("/customers/new");
        } else {
            customerDao.createCustomer(customerDto);
            context.getFlashScope().success("New Customer created.");
            return Results.redirect("/customers/");

        }

    }
    
    
    public Result deleteCustomer(Context context, @PathParam("reference") String reference) {
        customerDao.delete(reference);
        context.getFlashScope().success("Customer deleted.");
        return Results.redirect("/customers/");
    }

}
