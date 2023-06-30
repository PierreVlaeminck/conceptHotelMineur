package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.repository.TypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Service class for managing Type entities.
 */
@Service
@RequiredArgsConstructor
public class TypeService {

    private final TypeRepository typeRepository;

}