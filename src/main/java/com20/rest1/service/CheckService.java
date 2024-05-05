package com20.rest1.service;

import com20.rest1.dto.SimpleResponse;
import com20.rest1.dto.checkDto.CheckRequest;
import com20.rest1.dto.checkDto.CheckResponse;

import java.util.List;

public interface CheckService {


    List<CheckResponse> getAll();

    CheckResponse getById(Long id);

    SimpleResponse save(CheckRequest checkRequest);

    SimpleResponse update(Long id, CheckRequest checkRequest);

    SimpleResponse delete(Long id);
}
