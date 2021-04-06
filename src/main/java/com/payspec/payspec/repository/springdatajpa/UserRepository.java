package com.payspec.payspec.repository.springdatajpa;

import com.payspec.payspec.domain.model.User;
import com.payspec.payspec.repository.BaseRepository;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public interface UserRepository extends BaseRepository<User, Long> {

   /* @Override
    @Query("SELECT DISTINCT customer FROM Customer customer left join fetch customer.pets WHERE customer.lastName LIKE :lastName%")
    Collection<Customer> findByLastName(@Param("lastName") String lastName);

    @Override
    @Query("SELECT owner FROM Customer customer left join fetch customer.pets WHERE owner.id =:id")
    Customer findById(@Param("id") long id);*/
}
