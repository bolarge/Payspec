package com.payspec.repository.springdatajpa;

import com.payspec.domain.model.user.User;
import com.payspec.repository.BaseRepository;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public interface UserRepository extends BaseRepository<User> {

   /* @Override
    @Query("SELECT DISTINCT customer FROM Customer customer left join fetch customer.pets WHERE customer.lastName LIKE :lastName%")
    Collection<Customer> findByLastName(@Param("lastName") String lastName);

    @Override
    @Query("SELECT owner FROM Customer customer left join fetch customer.pets WHERE owner.id =:id")
    Customer findById(@Param("id") long id);*/
}
