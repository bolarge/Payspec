/*
package com.payspec.payspec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/payments", produces = {APPLICATION_JSON_VALUE}, consumes = {APPLICATION_JSON_VALUE})
public class Payment {

	@Autowired
    @Qualifier("paymentService")
	private PaymentService paymentService;

	@Secured({"ROLE_USER"})
	@RequestMapping(method = RequestMethod.GET)
	public List<PaymentResource> getAll() throws QuaspecServiceException {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		List<PaymentResource> result = new ArrayList<>();
		List<? extends IPayment> paymentEntities = paymentService.getByIUser(name);
		for (IPayment paymentEntity : paymentEntities) {
			result.add(new PaymentResource(paymentEntity));
		}
		return result;
	}

	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@RequestMapping(method = RequestMethod.POST)
	public PaymentResource initiatePayment(@RequestBody PaymentResource iPaymentRequest) {
		System.out.println("Product amount sold is " + iPaymentRequest.getProducts().size());
			IPayment paymentRequestOutcome = paymentService.processPayment(iPaymentRequest);
			if (paymentRequestOutcome != null) {
				return new PaymentResource(paymentRequestOutcome);
			}
		return null;
	}

	*/
/*@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@RequestMapping(method = RequestMethod.POST)
	public IPaymentResource initiatePayment(@RequestBody IInvoiceResource iPaymentRequest) {
		System.out.println("Product amount sold is " + iPaymentRequest.getProducts().size());
			IPayment paymentRequestOutcome = paymentService.processPayment(iPaymentRequest);
			if (paymentRequestOutcome != null) {
				return new IPaymentResource(paymentRequestOutcome);
			}
		return null;
	}*//*

}
*/
