public class User {
  private String name;
  private String email;
  private String address;
  private String phone;
  private boolean twoFactor;

  public User(String name, String email, String address, String phone, boolean twoFactor) {
      this.name = name;
      this.email = email;
      this.address = address;
      this.phone = phone;
      this.twoFactor = twoFactor;
  }

  // Getters
  public String getName() { return name; }
  public String getEmail() { return email; }
  public String getAddress() { return address; }
  public String getPhone() { return phone; }
  public boolean isTwoFactor() { return twoFactor; }
}
