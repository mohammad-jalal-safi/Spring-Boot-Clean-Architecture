package com.clean.application.employee.queries;

import com.clean.application.employee.models.EmployeeModel;
import com.clean.persistence.EmployeeRepository;
import com.dirkheijnen.mediator.interfaces.IRequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.awt.EmbeddedFrame;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SearchEmployeeQueryHandler implements IRequestHandler<SearchEmployeeQuery,List<EmployeeModel>> {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<EmployeeModel> handle(SearchEmployeeQuery request) {
        return repository.findAll().stream()
                .map(cur -> new EmployeeModel(cur.getID(),cur.getName())).collect(Collectors.toList());
    }
}
