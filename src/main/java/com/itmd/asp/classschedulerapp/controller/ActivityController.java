package com.itmd.asp.classschedulerapp.controller;

 import java.util.List;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;
 import com.itmd.asp.classschedulerapp.model.Activity;
 import com.itmd.asp.classschedulerapp.service.ActivityService;

@RestController
@RequestMapping ("/api")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping (value="/hello")
    public String getHello() {
        return "hello";
    }

    @GetMapping (value="/activity")
    public List<Activity> allActivities() {
        return activityService.findAll();
    }

    @PostMapping (value="/activity", consumes = "application/json")
    public Activity addActivity(@RequestBody Activity activity) {
        return activityService.addActivity(activity);
    }

}

