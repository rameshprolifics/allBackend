package com.drn.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drn.rest.entity.Passenger;
import com.drn.rest.exception.ResourceNotModifiedException;
import com.drn.rest.service.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController 
{
	@Autowired
	PassengerService passengerService;
	
	@GetMapping
	public ResponseEntity<List<Passenger>> getAllpassengers()
	{
		List<Passenger> plist = passengerService.getAllPassenger();
		
		if(plist.size()!=0)
			return new ResponseEntity<List<Passenger>>(plist,HttpStatus.OK);
		return new ResponseEntity<List<Passenger>>(plist,HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/{passengerId}")
	public ResponseEntity<Passenger> getAllpassengerById(@PathVariable int passengerId)
	{
		Passenger t = passengerService.getPassengerById(passengerId);
		if(t!=null)
			return new ResponseEntity<Passenger>(t, HttpStatus.OK);
		return new ResponseEntity<Passenger>(t, HttpStatus.NOT_FOUND);
		
			
	}

	@PutMapping(value="/",consumes="application/json")
	public HttpStatus insertOrModify(@RequestBody Passenger p)
	{
		passengerService.insertOrModify(p);
		return HttpStatus.OK;
		
	}
	
	@PostMapping(value="/",consumes="application/json")
	public HttpStatus updatePassenger(@RequestBody Passenger p)
	{
		passengerService.insertOrModify(p);
		return HttpStatus.OK;
		
	}
	
	@DeleteMapping("/{passengerId}")
	public HttpStatus deletePassengerById(@PathVariable int passengerId)
	{
		if(passengerService.deletePassengerById(passengerId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	@ExceptionHandler(ResourceNotModifiedException.class)
	public HttpStatus notFoundException()
	{
		return HttpStatus.NOT_MODIFIED;
	}
	
	
	
	

}
