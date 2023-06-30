package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.repository.BenefitHostelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Service class for managing BenefitHostel entities.
 */
@Service
@RequiredArgsConstructor
public class BenefitHostelService {

    private final BenefitHostelRepository benefitHostelRepository;
}