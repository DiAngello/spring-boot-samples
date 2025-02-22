package spring_boot_hibernate_joda_time.models;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class User {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  // Mapped as DATETIME (on MySQL)
  // For JSON binding use the format: "1970-01-01T00:00:00.000+0000"
  // @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
  private DateTime createTime;

  // Mapped as DATE (on MySQL)
  // For JSON binding use the format: "1970-01-01" (yyyy-MM-dd)
  // @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
  private LocalDate birthdayDate;

  public long getId() {
    return id;
  }

  public DateTime getCreateTime() {
    return createTime;
  }

  public LocalDate getBirthdayDate() {
    return birthdayDate;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setCreateTime(DateTime createTime) {
    this.createTime = createTime;
  }

  public void setBirthdayDate(LocalDate birthdayDate) {
    this.birthdayDate = birthdayDate;
  }

} 