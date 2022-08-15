package exo13.service;

import exo13.exception.BirthDayException;
import exo13.exception.EmailException;
import exo13.exception.FullNameException;
import exo13.exception.PhoneException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class ValidatorService {

    public static void birthdayCheck(LocalDate birthday) throws BirthDayException
    {
        try {

            //Create formatter
            DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy");

            //Local date instance
            LocalDate localDate = LocalDate.parse(birthday.toString());

            //Get formatted String
            String dateString = FOMATTER.format(localDate);

            System.out.println(dateString);
        } catch (DateTimeParseException e) {
            throw new BirthDayException("Error: Incorrect Date of birth");
        }

    }

    public static void phoneCheck(String phone) throws PhoneException {
        if (!phone.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")){
           throw new PhoneException("Error: Invalid phone number");
        }
    }

    public static void emailCheck(String email) throws EmailException {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if(!email.matches(regex)){
          throw  new EmailException("Error: Invalid email");
        }
    }

    public static void nameCheck(String name) throws FullNameException {
        String regex="^[a-zA-Z\\s]*$";
        if(!name.matches(regex)){
            throw new FullNameException("Error: Invalid full name");
        }
    }
}
