import org.junit.*;
import static org.junit.Assert.*;

public class PatientTest {

  @Test
  public void Patient_instantiatesCorrectly_true() {
    Patient myPatient = new Patient("John Doe", 2017-07-11);
    assertEquals(true, myPatient instanceof Patient);
  }

  @Test
  public void getName_instantiatesWithName_String() {
    Patient myPatient = new Patient("John Doe", 2017-07-11);
    assertEquals("John Doe", myPatient.getName());
  }

  @Test
  public void getBirthdate_instantiatesWithBirthday_birthday() {
    Patient myPatient = new Patient("John Doe", 2017-07-11);
    assertEquals(2017-07-11, myPatient.getBirthdate());
  }


}
