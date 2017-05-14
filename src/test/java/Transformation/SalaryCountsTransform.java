package Transformation;

import cucumber.api.Transformer;

public class SalaryCountsTransform extends Transformer<Integer> {

    @Override
    public Integer transform(String salary){
        return salary.length();
    }
}
