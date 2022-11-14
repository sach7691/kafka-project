package com.ab.kafkaconsumerdatabase.repositories;

import com.ab.kafkaconsumerdatabase.models.WikiData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiDataRepository extends JpaRepository<WikiData,Long> {
}
