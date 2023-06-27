package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.repository.BenefitRepository;
import com.simplon.concepthotelmineur.entity.Benefit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BenefitService {

    private final BenefitRepository benefitRepository;

    public List<Benefit> getServicesByHostel(Hostel hostel){
        return benefitRepository.getServicesByHostel(hostel);
    }
}
