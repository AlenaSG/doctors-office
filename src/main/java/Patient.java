import java.time.LocalDateTime;

public class Patient {
  private String mName;
  private LocalDateTime mBirthdate;

  public Patient(String name, LocalDateTime birthdate ) {
    mName = name;
    mBirthdate = birthdate;
  }

  public String getName() {
    return mName;
  }

  public LocalDateTime getBirthdate() {
    return mBirthdate;
  }
}
