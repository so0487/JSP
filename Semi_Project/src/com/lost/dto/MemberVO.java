package com.lost.dto;

import java.util.Date;

public class MemberVO {
   private String id;
   private String pwd;
   private String email;
   private int enabled;
   private Date regdate;
   private String phone;
   private String name;
   private String address;
   private String authority;
   private String zip;
   
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getPwd() {
      return pwd;
   }
   public void setPwd(String pwd) {
      this.pwd = pwd;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public int getEnabled() {
      return enabled;
   }
   public void setEnabled(int enabled) {
      this.enabled = enabled;
   }
   public Date getRegdate() {
      return regdate;
   }
   public void setRegdate(Date regdate) {
      this.regdate = regdate;
   }
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public String getAuthority() {
      return authority;
   }
   public void setAuthority(String authority) {
      this.authority = authority;
   }
   public String getZip() {
      return zip;
   }
   public void setZip(String zip) {
      this.zip = zip;
   }
   @Override
   public String toString() {
      return "MemberVO [id=" + id + ", pwd=" + pwd + ", email=" + email + ", enabled=" + enabled + ", regdate="
            + regdate + ", phone=" + phone + ", name=" + name + ", address=" + address + ", authority=" + authority
            + ", zip=" + zip + "]";
   }
   
   
}