package com.samson.fundamentals.service;

import com.samson.fundamentals.entity.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(int id);
}
