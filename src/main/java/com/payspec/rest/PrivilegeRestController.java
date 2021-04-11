package com.payspec.rest;

import com.payspec.domain.model.authority.Privilege;
import com.payspec.exception.error.ErrorDetail;
import com.payspec.service.PrivilegeService;
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
@RequestMapping("/api/privileges")
public class PrivilegeRestController {

    private static Logger logger = LoggerFactory.getLogger(PrivilegeRestController.class);

    @Autowired
    private PrivilegeService privilegeService;

    @RequestMapping(value="", method= RequestMethod.GET)
    public ResponseEntity<Collection<Privilege>> getAllUsers() {
        Collection<Privilege> privilegeCollection = privilegeService.findAllPrivileges();
        if(privilegeCollection.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(privilegeCollection, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "Creates a new Privilege", notes="The newly created privilege Id will be sent in the location response header", response = Void.class)
    @ApiResponses(value = {@ApiResponse(code=201, message="Privilege created successfully", response=Void.class), @ApiResponse(code=500, message="Error creating User", response= ErrorDetail.class) } )
    public ResponseEntity<Void> createPrivilege(@RequestBody Privilege privilege) throws Exception {
        privilege = privilegeService.savePrivilege(privilege);
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newUserUri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(privilege.getId()).toUri();
        responseHeaders.setLocation(newUserUri);
        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }
}
