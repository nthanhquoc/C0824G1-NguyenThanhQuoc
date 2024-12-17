package com.example.tokhaiyte.service;

import com.example.tokhaiyte.model.MedicalDeclaration;
import org.springframework.stereotype.Service;

@Service
public class MedicalDeclarationService implements IMedicalDeclarationService {
    private MedicalDeclaration medicalDeclaration;

    public MedicalDeclarationService() {
        this.medicalDeclaration = new MedicalDeclaration();
    }

    public MedicalDeclaration getMedicalDeclaration() {
        return medicalDeclaration;
    }
    public void setMedicalDeclaration(MedicalDeclaration medicalDeclaration) {
        this.medicalDeclaration.setFullName(medicalDeclaration.getFullName());
        this.medicalDeclaration.setYearBob(medicalDeclaration.getYearBob());
        this.medicalDeclaration.setGender(medicalDeclaration.getGender());
        this.medicalDeclaration.setNationality(medicalDeclaration.getNationality());
        this.medicalDeclaration.setPassportNumber(medicalDeclaration.getPassportNumber());
        this.medicalDeclaration.setInformation(medicalDeclaration.getInformation());

    }
}
