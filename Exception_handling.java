class Taxcalculator{
    public double calculateTax(String Empname, boolean isIndian, int EmpSalary ){
        double taxamount = 0;
        try{
            if (isIndian == false)  {
                throw new Exception("invalid country");
            }
            if(Empname==""){
                throw new  Exception("name shouldnot empty");
            }
            if(EmpSalary> 100000){
                return taxamount = EmpSalary*8/100;
            }
            if(EmpSalary>50000 && EmpSalary<100000){
            return taxamount = EmpSalary*6/100;
            }
            if(EmpSalary>30000 && EmpSalary < 50000){
                return taxamount = EmpSalary*5/100;
            }
            if(EmpSalary>10000 && EmpSalary< 30000){
                return taxamount = EmpSalary*4/100;
            }
            else
               throw new Exception("tax not elligiable");

        }
        catch(Exception e){
            System.out.println(e);
        }
        return taxamount;


    }
}
