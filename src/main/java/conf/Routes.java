/**
 * Copyright (C) 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package conf;

import controllers.ApplicationController;
import controllers.CustomersController;
import controllers.InvoicesController;
import ninja.AssetsController;
import ninja.Router;
import ninja.application.ApplicationRoutes;

public class Routes implements ApplicationRoutes {

    @Override
    public void init(Router router) {

        router.GET().route("/").with(ApplicationController.class, "index");

        router.GET().route("/invoices/").with(InvoicesController.class, "index");
        router.GET().route("/invoices/new").with(InvoicesController.class, "newInvoice");
        router.POST().route("/invoices/{invoiceNumber}/delete").with(InvoicesController.class, "deleteInvoice");
        router.POST().route("/invoices/").with(InvoicesController.class, "createInvoice");
        router.GET().route("/invoices/{invoiceNumber}").with(InvoicesController.class, "showInvoice");

        router.GET().route("/customers/").with(CustomersController.class, "index");
        router.GET().route("/customers/new").with(CustomersController.class, "newCustomer");
        router.POST().route("/customers/{customerReference}/delete").with(CustomersController.class, "deleteCustomer");
        router.POST().route("/customers/").with(CustomersController.class, "createCustomer");
        
        ///////////////////////////////////////////////////////////////////////
        // Assets (pictures / javascript)
        ///////////////////////////////////////////////////////////////////////    
        router.GET().route("/assets/webjars/{fileName: .*}").with(AssetsController.class, "serveWebJars");
        router.GET().route("/assets/{fileName: .*}").with(AssetsController.class, "serveStatic");

        ///////////////////////////////////////////////////////////////////////
        // Index / Catchall shows index page
        ///////////////////////////////////////////////////////////////////////
        router.GET().route("/.*").with(ApplicationController.class, "index");
    }

}
