package com20.rest1.service;

import com20.rest1.dto.SimpleResponse;
import com20.rest1.dto.menuDto.MenuRequest;
import com20.rest1.dto.menuDto.MenuResponse;

import java.util.List;

public interface MenuService {
    List<MenuResponse> getAll();

    MenuResponse getById(Long id);

    SimpleResponse save(MenuRequest menuRequest);

    SimpleResponse update(Long id, MenuRequest menuRequest);

    SimpleResponse delete(Long id);
}
