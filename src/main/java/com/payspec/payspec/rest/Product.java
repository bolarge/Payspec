/*
package com.payspec.payspec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/products", produces = {APPLICATION_JSON_VALUE}, consumes = {APPLICATION_JSON_VALUE})
public class Product {

	@Autowired
	@Qualifier("productService")
	private ProductService productService;

	private DataAccessService dataAccessService;

	@Secured({"ROLE_USER"})
    @RequestMapping(method = RequestMethod.GET)
    public List<ProductResource> getAll() throws QuaspecServiceException {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) dataAccessService.getUserRepository().findByUserName(auth.getName());
        List<ProductResource> result = new ArrayList<>();

        if(user != null) {
        	List<? extends IProduct> products = productService.getByIOrganization(user.getOrganization().getName());
        	for (IProduct product : products) {
        		result.add(new ProductResource(product));
        	}
        }
        return result;
    }

    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    @RequestMapping(method = RequestMethod.POST)
    public ProductResource createProduct(@RequestBody ProductResource iProduct) throws QuaspecServiceException {
    	IProduct product = productService.createProduct(iProduct);
    	if(product != null) {
	            return new ProductResource(product);
    	}
        return null;
    }
}
*/
