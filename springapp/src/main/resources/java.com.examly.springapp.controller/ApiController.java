package com.examly.springapp.controller;

@RestController
@RequestMapping("/")
public class ApiController {
   
    @Autowired
    private  CustomerRepo custRepo;

    @Autowired
    private  BillRepo billRepo;

    @GetMapping("/")
    public List < Instructor > getInstructors() {
        return instructorRepository.findAll();
    }
    
}
