package com.payspec.service.impl;

import com.payspec.domain.model.organization.Organization;
import com.payspec.repository.springdatajpa.OrganizationRepository;
import com.payspec.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service("OrganizationService")
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    @Transactional
    public Collection<Organization> findAllOrganizations() throws DataAccessException {
        return organizationRepository.findAll();
    }

    @Override
    @Transactional
    public Organization saveOrganization(Organization organization) throws DataAccessException {
        return organizationRepository.save(organization);
    }
}
