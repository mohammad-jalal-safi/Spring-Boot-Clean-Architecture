package com.clean.application.query;

import com.clean.persistence.employee.EmployeeRepository;
import com.dirkheijnen.mediator.interfaces.IRequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetPagesQueryHandler implements IRequestHandler<GetPagesQuery,String> {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public String handle(GetPagesQuery request) {

        return "home";
    }
}
