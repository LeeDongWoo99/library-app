package com.group.libraryapp.controller.example;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequset;
import com.group.libraryapp.dto.calculator.request.CalculatorSumRequest;
import com.group.libraryapp.dto.calculator.response.CalculatorResponse;
import com.group.libraryapp.dto.example.DayOfTheWeekResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Calculator2Controller {

    @GetMapping("/api/v1/calc")
    public CalculatorResponse addTwoNumbers(CalculatorAddRequset request) {
        int add = request.getNum1() + request.getNum2();
        int minus = request.getNum1() - request.getNum2();
        int multiply = request.getNum1() * request.getNum2();
        return new CalculatorResponse(add, minus, multiply);

    }

    @GetMapping("/api/v1/day-of-the-week")
    public DayOfTheWeekResponse getDayOfTheWeek(@RequestParam(name = "date") String dateStr) {
        return new DayOfTheWeekResponse(dateStr);
    }

    @PostMapping("/api/v1/sum")
    public int addAllNumbers(@RequestBody CalculatorSumRequest request) {
        List<Integer> numbers = request.getNumbers();
        return numbers.stream()
                .mapToInt(Integer::intValue).sum();
    }
}
