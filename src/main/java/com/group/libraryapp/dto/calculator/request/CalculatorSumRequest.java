package com.group.libraryapp.dto.calculator.request;

import java.util.List;

public class CalculatorSumRequest {

    private List<Integer> numbers;

    public CalculatorSumRequest(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
