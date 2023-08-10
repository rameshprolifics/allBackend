package com.drn.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.drn.rest.entity.Train;

public interface TrainRepository extends JpaRepository<Train,Integer>
{

}
