package com.payspec.payspec.rest;

import com.payspec.payspec.domain.api.IBankAccount;
import com.payspec.payspec.domain.api.IUser;
import com.payspec.payspec.domain.exception.QuaspecServiceException;
import com.payspec.payspec.rest.model.BankAccountResource;
import com.payspec.payspec.rest.model.UserResource;
import com.payspec.payspec.service.BankAccountService;
import com.payspec.payspec.service.UserService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("api")
@Api(value = "users", tags = "User API")
public class UserRestController {

    private static Logger logger = LoggerFactory.getLogger(UserRestController.class);   

    @Autowired
    private UserService userService;

    //@Secured({"ROLE_ADMIN"})
    @RequestMapping(method = RequestMethod.GET)
    public List<UserResource> search() throws QuaspecServiceException {
        List<UserResource> result = new ArrayList<>();
        List<? extends IUser> userEntities = userService.getAll();
        for (IUser userEntity : userEntities) {
            result.add(new UserResource(userEntity));
        }
        return result;
    }

    //@Secured({"ROLE_ADMIN"})
 /*   @RequestMapping(value="/{userName}/accounts", method = RequestMethod.GET)
    public List<BankAccountResource> getUserBankAccounts(@PathVariable("userName") String userName) throws QuaspecServiceException{
    	List<BankAccountResource> accounts = new ArrayList<>();
    	List<? extends IBankAccount> accountEntities = bankAccountService.getByIUser(userName);
    	for (IBankAccount accountEntity : accountEntities) {
    			accounts.add(new BankAccountResource(accountEntity));
    	}
    	return accounts;
    }*/

    //@Secured({"ROLE_ADMIN", "ROLE_USER"})
    @RequestMapping(method = RequestMethod.POST)
    public UserResource create(@RequestBody UserResource user) throws QuaspecServiceException {
        IUser saved = userService.createUser(user);
        if (saved != null) {
            return new UserResource(user);
        }
        return null;
    }

}
