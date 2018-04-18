package utilitiesForNumFormatter;

import java.time.LocalDateTime;

//import utilitiesForNumFormatter.NumFormatHelpers;

public class DateTime {
	
	/**
     * Takes the output from stripNonDigits(String) such as 20150623121500 and creates a String that can be parsed into
     * a LocalDateTime object or for storage such as 2015-09-29T11:07:25.
     */
    public static String createLDTStyleString(String dt){
        if(dt.length()>=12){
            dt = NumFormatHelpers.stripNonDigits(dt);
        }
        String secs = dt.substring(12,14);
        String min = dt.substring(10,12);
        String hour = dt.substring(8,10);
        String day = dt.substring(6,8);
        String month = dt.substring(4,6);
        String year = dt.substring(0,4);
        String daTi = (year + "-" + month + "-" + day + "T" + hour + ":" + min+ ":"+secs);
        return daTi;
    }
    
    
	/**
     * Takes any date/time String and creates a LocalDateTime object.
     */
    public static LocalDateTime createLDT(String daTi){
        LocalDateTime ldt = null;
        try{
        String dtString = NumFormatHelpers.stripNonDigits(daTi);
        String ldtStyleString = createLDTStyleString(dtString);
        ldt = LocalDateTime.parse(ldtStyleString);
        }
        catch(Exception ex){
            //Logger.getLogger(DateTimeUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ldt;
    }
    
    /**
     * Takes any String and returns a display style format String e.g. 2015-09-29 11:07:25
     */
    public static String createDisplayString(String in){
        String daTi;
        if(in.length()<12){
            daTi = "Unknown";
        } else{
        String dt = NumFormatHelpers.stripNonDigits(in);
        String secs = dt.substring(12,14);String min = dt.substring(10,12);
        String hour = dt.substring(8,10);String day = dt.substring(6,8);
        String month = dt.substring(4,6);String year = dt.substring(0,4);
        daTi = (year+ "-" + month +"-" + day +" " +hour+":"+min+":"+secs);
        }
        return daTi;
    }
    
    /**
     * Creates a LocalDateTime object representing NOW.
     */
    public static LocalDateTime dateTimeNow(){
        LocalDateTime t = LocalDateTime.now();
        return t;
    }
    
    /**
     * Creates date now and returns it as String that the DB can take.
     */
    public static String dateTimeNowAsString()
    {
        LocalDateTime t = LocalDateTime.now();
        String s = t.toString();
        return s;
    }
    
    

}

