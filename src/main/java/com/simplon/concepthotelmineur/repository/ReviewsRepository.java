package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long> {

    List<Reviews> getReviewsByHostel(Hostel hostel);
}
