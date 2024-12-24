package com.example.bt2.service;

import com.example.bt2.model.Phone;
import com.example.bt2.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneService implements IPhoneService {
    @Autowired
    private PhoneRepository PhoneRepository;

    @Override
    public void save(Phone phone) {
        PhoneRepository.save(phone);
    }
}
