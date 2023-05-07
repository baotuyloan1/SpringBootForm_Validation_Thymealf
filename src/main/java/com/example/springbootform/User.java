package com.example.springbootform;

import jakarta.validation.constraints.*;

public class User {
  private String name;
  private String email;
  private String password;
  private String gender;
  private String note;
  private boolean married;
  //  private Date birthday;
  private String profession;

  private long income;

  @Min(20_000)
  @Max(200_000)
  public long getIncome() {
    return income;
  }

  public void setIncome(long income) {
    this.income = income;
  }

  @Size(min = 3, max = 50)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //  @NotEmpty: kiểm tra xem 1 chuỗi có tồn tại và trống hay không. Nó sẽ báo lỗi nếu chuỗi trống
  // hoặc bằng null
  @Email(message = "Please enter a valid e-mail address")
  @NotBlank // kiểm tra 1 chuỗi  tồn tại và không trống. Nó sẽ báo lỗi nếu 1 chuỗi trống hoặc chỉ
  // chứa các khoản trắng
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @NotBlank
  @Size(min = 8, max = 15)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @NotBlank
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @NotBlank
  @Size(min = 0, max = 100)
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public boolean isMarried() {
    return married;
  }

  public void setMarried(boolean married) {
    this.married = married;
  }

  //  @DateTimeFormat(pattern = "yyyy-MM-dd")
  //  public Date getBirthday() {
  //    return birthday;
  //  }
  //
  //  public void setBirthday(Date birthday) {
  //    this.birthday = birthday;
  //  }

  @NotBlank
  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  @Override
  public String toString() {
    return "User{"
        + "name='"
        + name
        + '\''
        + ", email='"
        + email
        + '\''
        + ", password='"
        + password
        + '\''
        + ", gender='"
        + gender
        + '\''
        + ", note='"
        + note
        + '\''
        + ", married="
        + married
        //        + ", birthday="
        //        + birthday
        + ", profession='"
        + profession
        + '\''
        + '}';
  }
}
