package com.drn.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.drn.rest.entity.Passenger;
import com.drn.rest.entity.Train;
import com.drn.rest.exception.ResourceNotFoundException;
import com.drn.rest.exception.ResourceNotModifiedException;
import com.drn.rest.repository.PassengerRepository;

@Service
public class PassengerService
{
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@Transactional(readOnly=true)
	public List<Passenger> getAllPassenger()
	{
		return passengerRepository.findAll();
	}
	
	@Transactional(readOnly=true)
	public Passenger getPassengerById(int passengerId)
	{
		Optional<Passenger> ot = passengerRepository.findById(passengerId);
		if(ot.isPresent())
		{
			Passenger passengers = ot.get();
			Train train = restTemplate.getForEntity("http://localhost:8045/train/"+passengers.getTrainId(),Train.class).getBody();
			passengers.setTrain(train);
			return passengers;
		}
		return null;
	}
	
	@Transactional
	public boolean insertOrModify(Passenger passenger)
	{
		if(passengerRepository.save(passenger) != null)
			return true;
		throw new ResourceNotModifiedException();
	}
	
	@Transactional
	public boolean deletePassengerById(int passengerId)
	{
		long count = passengerRepository.count();
		passengerRepository.deleteById(passengerId);
		if(count > passengerRepository.count())
			return true;
		throw new ResourceNotFoundException();
	}

}
