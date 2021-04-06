package com.payspec.payspec.rest;

import com.payspec.payspec.domain.model.Customer;
import com.payspec.payspec.domain.model.Employee;
import com.payspec.payspec.domain.model.User;
import com.payspec.payspec.exception.error.ErrorDetail;
import com.payspec.payspec.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Collection;

@RestController
@RequestMapping("api")
public class CustomerRestController {

    private static Logger logger = LoggerFactory.getLogger(CustomerRestController.class);
    @Autowired
    private UserService userService;

   /* @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public ResponseEntity<Collection<Employee>> getAllEmployees(){
        Collection<Employee> empList = userService.findAllUser();
        if(empList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(empList, HttpStatus.OK);
    }*/

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    @ApiOperation(value = "Creates a new customers", notes="The newly created customers Id will be sent in the location response header", response = Void.class)
    @ApiResponses(value = {@ApiResponse(code=201, message="Customer Created Successfully", response=Void.class), @ApiResponse(code=500, message="Error creating User", response= ErrorDetail.class) } )
    public ResponseEntity<Void> createUser(@RequestBody Customer user) throws Exception {

        user = (Customer) userService.saveUser(user);

        // Set the location header for the newly created resource
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newUserUri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        responseHeaders.setLocation(newUserUri);

        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }
}
