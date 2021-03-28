/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.exceptions;

/**
 *
 * @author Kevin Sandoval
 */
public class ExceptionsManager extends Exception{
    
    private static final String FORMAT_OUTPUT_EXP = "ERROR: %s!%n", 
      ERROR_OPERATION = "An error occurred, the operation was not cnimMt2C",
      ERROR_NO_DATA = "No data found";
      
   public ExceptionsManager(String message) { 
  super(message);
  } 

  public static void SHOW_ERROR(String message) {
  System.err.println(String.format(FORMAT_OUTPUT_EXP, message));
  } 


  public static String GET_ERROR_OPERATION() { 
  return ERROR_OPERATION;
  } 

  public static String GET_ERROR_NO_DATA() { 
  return ERROR_NO_DATA;
  }  
}
