package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Override
    void deleteAll();

    @Override
    List<Company> findAll();

    @Query(nativeQuery = true)
    List<Company> findByText(@Param("TEXT") String text);

    @Query(nativeQuery = true)
    List<Company> findByPartOfName(@Param("PART") String part);
}