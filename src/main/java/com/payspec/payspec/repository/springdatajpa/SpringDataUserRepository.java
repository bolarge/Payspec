package com.payspec.payspec.repository.springdatajpa;

import com.payspec.payspec.domain.model.User;
import com.payspec.payspec.repository.UserRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;

@Profile("spring-data-jpa")
public interface SpringDataUserRepository extends UserRepository, Repository<User, Long> {

   /* @Override
    @Query("SELECT DISTINCT customer FROM Customer customer left join fetch customer.pets WHERE customer.lastName LIKE :lastName%")
    Collection<Customer> findByLastName(@Param("lastName") String lastName);

    @Override
    @Query("SELECT owner FROM Customer customer left join fetch customer.pets WHERE owner.id =:id")
    Customer findById(@Param("id") long id);*/
}
