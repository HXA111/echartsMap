package org.example.service.impl;

import org.example.dao.ICityStuDAO;
import org.example.service.ICityStuService;
import org.example.vo.cityStu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class cityStuServiceImpl implements ICityStuService {
    @Autowired
    private ICityStuDAO cityStuDAO;

    @Override
    public List<cityStu> dataSet() {
        List<cityStu> cityStuList=new ArrayList<>();
        cityStuList=cityStuDAO.get();
        return cityStuList;
    }
}
