package com.example.UpstreamService.Controller;


import com.example.UpstreamService.Domain.Education.Education;
import com.example.UpstreamService.Domain.Experience.Experience;
import com.example.UpstreamService.Domain.Location.Location;
import com.example.UpstreamService.Domain.Project.Project;
import com.example.UpstreamService.Domain.Skills.Skills;
import com.example.UpstreamService.Service.UpstreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import com.example.UpstreamService.Domain.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class UpstreamServiceController{
 private UpstreamService upstreamService;
@Autowired
private KafkaTemplate<String,Education> kafkaTemplateEducation;
private KafkaTemplate<String, Skills> kafkaTemplateSkills;
private KafkaTemplate<String, Location>kafkaTemplateLocation;
private KafkaTemplate<String,Project>kafkaTemplateProject;
private KafkaTemplate<String, Experience>kafkaTemplateExperience;
private static final  String  TOPIC ="education";
private static final String TOPIC1 = "skills";
private static final String TOPIC2 = "location";
private static final String TOPIC3 = "project";
private static final String TOPIC4 = "experience";

    @PostMapping("/education")
    public ResponseEntity<?> newEducation(@RequestBody Education education)
    {
        //String string = null;
        ResponseEntity responseEntity = new ResponseEntity(education,HttpStatus.OK);
        kafkaTemplateEducation.send(TOPIC,education);
        System.out.println(education);
        return responseEntity;

    }
    @PutMapping("/education")
    public ResponseEntity<?> updateEducation(@RequestBody Education education){
        ResponseEntity responseEntity = new ResponseEntity(education,HttpStatus.OK);
        kafkaTemplateEducation.send(TOPIC,education);
        System.out.println(education);
        return responseEntity;
    }
    @DeleteMapping("/education")
    public ResponseEntity<?> deleteEducation(@RequestBody Education education){
        ResponseEntity responseEntity = new ResponseEntity(education,HttpStatus.OK);
        kafkaTemplateEducation.send(TOPIC,education);
        System.out.println(education);
        return responseEntity;
    }
    @PostMapping("/location")
    public ResponseEntity<?> newLocation(@RequestBody Location location)
    {
        //String string = null;
        ResponseEntity responseEntity = new ResponseEntity(location,HttpStatus.OK);
        kafkaTemplateLocation.send(TOPIC2,location);
        return responseEntity;

    }
    @PutMapping("/location")
    public ResponseEntity<?> updateLocation(@RequestBody Location location){
        ResponseEntity responseEntity = new ResponseEntity(location,HttpStatus.OK);
        kafkaTemplateLocation.send(TOPIC2,location);
        return responseEntity;
    }
    @DeleteMapping("/location")
    public ResponseEntity<?> deleteEducation(@RequestBody Location location){
        ResponseEntity responseEntity = new ResponseEntity(location,HttpStatus.OK);
        kafkaTemplateLocation.send(TOPIC2,location);
        return responseEntity;
    }

    @PostMapping("/skills")
    public ResponseEntity<?> newSkills(@RequestBody Skills skills)
    {
        //String string = null;
        ResponseEntity responseEntity = new ResponseEntity(skills,HttpStatus.OK);
        kafkaTemplateSkills.send(TOPIC1,skills);
        return responseEntity;

    }
    @PutMapping("/skills")
    public ResponseEntity<?> updateSkills(@RequestBody Skills skills)
    {
        //String string = null;
        ResponseEntity responseEntity = new ResponseEntity(skills,HttpStatus.OK);
        kafkaTemplateSkills.send(TOPIC1,skills);
        return responseEntity;

    }
    @DeleteMapping("/skills")
    public ResponseEntity<?> deleteSkills(@RequestBody Skills skills)
    {
        //String string = null;
        ResponseEntity responseEntity = new ResponseEntity(skills,HttpStatus.OK);
        kafkaTemplateSkills.send(TOPIC1,skills);
        return responseEntity;

    }
    @PostMapping("/project")
    public ResponseEntity<?> newProject(@RequestBody Project project)
    {
        //String string = null;
        ResponseEntity responseEntity = new ResponseEntity(project,HttpStatus.OK);
        kafkaTemplateProject.send(TOPIC1,project);
        return responseEntity;

    }
    @PutMapping("/project")
    public ResponseEntity<?> updateProject(@RequestBody Project project)
    {
        //String string = null;
        ResponseEntity responseEntity = new ResponseEntity(project,HttpStatus.OK);
        kafkaTemplateProject.send(TOPIC1,project);
        return responseEntity;

    }
    @DeleteMapping("/project")
    public ResponseEntity<?> deleteProject(@RequestBody Project project)
    {
        //String string = null;
        ResponseEntity responseEntity = new ResponseEntity(project,HttpStatus.OK);
        kafkaTemplateProject.send(TOPIC1,project);
        return responseEntity;

    }
    @PostMapping("/experience")
    public ResponseEntity<?> newExperience(@RequestBody Experience experience)
    {
        //String string = null;
        ResponseEntity responseEntity = new ResponseEntity(experience,HttpStatus.OK);
        kafkaTemplateExperience.send(TOPIC1,experience);
        return responseEntity;

    }
    @PutMapping("/experience")
    public ResponseEntity<?> updateExperience(@RequestBody Experience experience)
    {
        //String string = null;
        ResponseEntity responseEntity = new ResponseEntity(experience,HttpStatus.OK);
        kafkaTemplateExperience.send(TOPIC1,experience);
        return responseEntity;

    }
    @DeleteMapping("/experience")
    public ResponseEntity<?> deleteExperience(@RequestBody Experience experience)
    {
        //String string = null;
        ResponseEntity responseEntity = new ResponseEntity(experience,HttpStatus.OK);
        kafkaTemplateExperience.send(TOPIC1,experience);
        return responseEntity;

    }
}
