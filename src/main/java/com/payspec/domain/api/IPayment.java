package com.payspec.domain.api;

import java.math.BigDecimal;
import java.util.Date;

public interface IPayment { //<T extends IUser>

	BigDecimal getAmount() ;

	void setAmount(BigDecimal amount) ;

	String getPaymentDescription() ;

	void setPaymentDescription(String paymentDescription) ;

	Date getPaymentDate() ;

	void setPaymentDate(Date paymentDate) ;

}
