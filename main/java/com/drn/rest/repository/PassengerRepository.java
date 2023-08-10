package com.drn.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drn.rest.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>
{

}
