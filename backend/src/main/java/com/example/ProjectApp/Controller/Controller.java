package com.example.ProjectApp.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@CrossOrigin("*")
public class Controller {

    @GetMapping("/getData")
    public List<sample> example() {
        sample test = new sample();
        sample test2 = new sample();
        sample test3 = new sample();
        sample test4 = new sample();
        sample test5 = new sample();
        sample test6 = new sample();
        sample test7 = new sample();


        test.setMonth("January");
        test.setRandomnum(10);

        test2.setMonth("February");
        test2.setRandomnum(200);

        test3.setMonth("March");
        test3.setRandomnum(50);

        test4.setMonth("April");
        test4.setRandomnum(500);

        test5.setMonth("May");
        test5.setRandomnum(100);

        test6.setMonth("June");
        test6.setRandomnum(200);

        test7.setMonth("July");
        test7.setRandomnum(300);


        System.out.println("API CALLED");
        List<sample> list = new ArrayList<>();
        list.add(test);
        list.add(test2);
        list.add(test3);
        list.add(test4);
        list.add(test5);
        list.add(test6);
        list.add(test7);
        return list;
    }

    @GetMapping("/fetch-data")
    public ResponseEntity<?> fetchDataByYear(@RequestParam("year") int selectedYear) {
        try {
            // Call a service to fetch data based on the selected year
            // Replace this with your actual service method
            sample test = new sample();
            sample test2 = new sample();
            sample test3 = new sample();
            sample test4 = new sample();
            sample test5 = new sample();


            test.setMonth("January");
            test.setRandomnum(10);

            test2.setMonth("February");
            test2.setRandomnum(200);

            test3.setMonth("March");
            test3.setRandomnum(50);

            test4.setMonth("April");
            test4.setRandomnum(500);

            test5.setMonth("May");
            test5.setRandomnum(100);

            System.out.println("API CALLED 2");
            List<sample> list = new ArrayList<>();
            list.add(test);
            list.add(test2);
            list.add(test3);
            list.add(test4);
            list.add(test5);

            // You can perform any additional processing here

            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error fetching data: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
