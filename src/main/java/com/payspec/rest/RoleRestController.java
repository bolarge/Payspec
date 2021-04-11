package com.payspec.rest;

import com.payspec.domain.model.authority.Privilege;
import com.payspec.domain.model.authority.Role;
import com.payspec.exception.BindingErrorsResponse;
import com.payspec.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Collection;

@RestController
@RequestMapping(value = "/api/roles")
public class RoleRestController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Collection<Role>> getAllRoles(){
        Collection<Role> roleCollection = roleService.findAllRoles();
        if(roleCollection.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(roleCollection, HttpStatus.OK);
    }

    @RequestMapping(value="", method= RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Void> createRole(@RequestBody Role role) throws Exception {
        role = roleService.saveRole(role);
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newUserUri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(role.getId()).toUri();
        responseHeaders.setLocation(newUserUri);
        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{roleId}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<Role> updateRole(@PathVariable("roleId") Long roleId, @RequestBody Role role) throws Exception {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        if(role == null) {
            return new ResponseEntity<Role>(headers, HttpStatus.BAD_REQUEST);
        }
        Role currentRole = this.roleService.findRoleById(roleId);
        if(currentRole == null){
            return new ResponseEntity<Role>(HttpStatus.NOT_FOUND);
        }
        this.roleService.saveRole(currentRole);
        return new ResponseEntity<Role>(currentRole, HttpStatus.NO_CONTENT);
    }
}
