package Structural_Patterns.AdapterPattern.AdapterPractice1;

public class Adapter implements AdapterInterface{
    @Override
    public  LegacyFunction convert(NewFunction newFunction){
        String amount = Integer.toString(newFunction.salary);
        String pincode = Integer.toString(newFunction.zipCode);
        return new LegacyFunction(amount, pincode);
    }

} 
    
