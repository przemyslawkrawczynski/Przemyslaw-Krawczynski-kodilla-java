package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmploeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@Component
public class CompanyFacade {

    @Autowired
    EmploeeDao emploeeDao;
    @Autowired
    CompanyDao companyDao;

    public List<Employee> getEmployeesByPartOfName(String part) {
        return ofNullable(emploeeDao.findByPartOfName(part)).orElse(new ArrayList<>());
    }

    public List<Company> getCompanysByPartOfName(String part) {
        return ofNullable(companyDao.findByPartOfName(part)).orElse(new ArrayList<>());
    }

}
