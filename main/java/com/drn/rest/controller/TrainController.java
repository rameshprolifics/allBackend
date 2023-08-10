package com.drn.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.drn.rest.entity.Train;
import com.drn.rest.exception.ResourceNotModifiedException;
import com.drn.rest.service.TrainService;

//@Controller
//@ResponseBody
@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/train")
public class TrainController 
{
	@Autowired
	TrainService trainService;
	
	@GetMapping
	public ResponseEntity<List<Train>> getAllTrains()
	{
		List<Train> t = trainService.getAllTrains();
		if(t!=null)
			return new ResponseEntity<List<Train>>(t, HttpStatus.OK);
		return new ResponseEntity<List<Train>>(t, HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/{trainId}")
	public ResponseEntity<Train> getTrainByTrainId(@PathVariable int trainId)
	{
		Train t = trainService.getTrainById(trainId);
		if(t!=null)
			return new ResponseEntity<Train>(t, HttpStatus.OK);
		return new ResponseEntity<Train>(t, HttpStatus.NOT_FOUND); 
	}
	
	
	@PutMapping(value="/",consumes="application/json")
	public HttpStatus updateTrain2(@RequestBody Train train)
	{
		trainService.modifyTrain(train);
		return HttpStatus.OK;
	}
	
	@PostMapping(value="/",consumes="application/json")
	public HttpStatus updateTrain(@RequestBody Train train)
	{
		trainService.updateTrain(train);
		return HttpStatus.OK;

	}
	
	@DeleteMapping("/{trainId}")
	public HttpStatus deleteTrainByTrainId(@PathVariable int trainId)
	{
		if(trainService.deleteTrainByTrainId(trainId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	
	@ExceptionHandler(ResourceNotModifiedException.class)
	public HttpStatus notFoundException()
	{
		return HttpStatus.NOT_MODIFIED;
	}
	

}
