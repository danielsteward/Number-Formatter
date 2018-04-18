package utilitiesForNumFormatter;

public class CheckFormat {
	
    /**
    * Checks a String is ok from which to create a LDT.
    */
   public static boolean dtStringCheck(String  dt){
       boolean b=false;
       try{
       if(DateTime.createLDT(dt)!=null){
           b=true;
       }
       }
       catch(Exception ex){
           StackTraceElement[] ste = ex.getStackTrace();
           System.out.println("Exception thrown in dtStringCheck" + ex.getMessage());
       }
       return b;
   }
   


}
