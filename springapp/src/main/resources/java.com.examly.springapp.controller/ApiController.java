package com.examly.springapp.controller;
@RestController
public class ApiController {
   
    @Autowired
    private  CustomerRepo custRepo;

    @Autowired
    private  BillRepo billRepo;

    @GetMapping("/{id}")
    public Customer getCustomerById( @PathVariable(value = "id") int custId) 
    {
        Customer c = custRepo.findById(custId);
        return c;
    }   
}