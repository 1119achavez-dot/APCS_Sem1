public class StepTracker {
    
    private int minSteps;
    private int totalSteps;
    private int numDays;
    private int numActiveDays;
  
    public class StepTracker(int msteps) {
        minSteps = msteps;
        totalSteps = 0;
        numDays = 0;
        numActiveDays = 0;
    }
   public void AddDailySteps(int steps) {
     // count up my days tracked 
     // take in usetrs steps and comapper to the minsteps 
     // if my dteps a day are bigger or ewual to stepsmon then it will inclerease my days active 
     totalSteps = totalSteps + 1;
     if( steps >= minSteps){
       numActiveDays + 1;
     }
   }
   public int activeDays(){
       return numActiveDays;
   }
   
   public double averageSteps(){
       if (numDays == 0){
           return 0.0;
       }
       else
       {
           return(double) totalSteps/numDays;
       }
       }
   }
    

  // active days method returns the num of active days and wpuld be an int 