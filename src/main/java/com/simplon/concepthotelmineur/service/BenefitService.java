package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.repository.BenefitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Service class for managing Benefit entities.
 */
@Service
@RequiredArgsConstructor
public class BenefitService {

    private final BenefitRepository benefitRepository;

}
