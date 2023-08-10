package com.drn.rest.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.drn.rest.entity.Train;
import com.drn.rest.exception.ResourceNotFoundException;
import com.drn.rest.exception.ResourceNotModifiedException;
import com.drn.rest.repository.TrainRepository;


@Service
public class TrainService 
{
	@Autowired
	TrainRepository trainRepository;
	
	@Transactional(readOnly=true)
	public List<Train> getAllTrains()
	{
		return trainRepository.findAll();
	}
	
	
	@Transactional(readOnly=true)
	public Train getTrainById(int trainId)
	{
		Optional<Train> ot = trainRepository.findById(trainId);
		if(ot.isPresent())
			return ot.get();
		throw new ResourceNotFoundException();
	}
	

	@Transactional
	public void modifyTrain(Train t)
	{
		if(trainRepository.save(t) == null)
			throw new ResourceNotModifiedException();
	}
	
	@Transactional
	public void updateTrain(Train t)
	{
		if(trainRepository.save(t) == null)
			throw new ResourceNotModifiedException();
	}
	
	@Transactional
	public boolean deleteTrainByTrainId(int trainId)
	{
		long count = trainRepository.count();
		trainRepository.deleteById(trainId);
		if(count > trainRepository.count())
			return true;
		throw new ResourceNotFoundException();
	}
	
	
	
	

}
