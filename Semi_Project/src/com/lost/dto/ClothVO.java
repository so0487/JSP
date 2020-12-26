package com.lost.dto;

import java.util.Date;

public class ClothVO {
   private String ccode;   //옷 코드
   private String cscode;   //옷 분류 코드
   private String cname;   //옷 이름
   private Date regDate;   //등록일자
   private Date update_date;//수정일자
   private String cimage;   //상품이미지
   private int price;      //상품가격
   private String detail;   //상품설명
   
   public String getCcode() {
      return ccode;
   }

   public void setCcode(String ccode) {
      this.ccode = ccode;
   }

   public String getCscode() {
      return cscode;
   }

   public void setCscode(String cscode) {
      this.cscode = cscode;
   }

   public String getCname() {
      return cname;
   }

   public void setCname(String cname) {
      this.cname = cname;
   }

   public Date getRegDate() {
      return regDate;
   }

   public void setRegDate(Date regDate) {
      this.regDate = regDate;
   }

   public Date getUpdate_date() {
      return update_date;
   }

   public void setUpdate_date(Date update_date) {
      this.update_date = update_date;
   }

   public String getCimage() {
      return cimage;
   }

   public void setCimage(String cimage) {
      this.cimage = cimage;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public String getDetail() {
      return detail;
   }

   public void setDetail(String detail) {
      this.detail = detail;
   }

   @Override
   public String toString() {
      return "ClothVO [ccode=" + ccode + ", cscode=" + cscode + ", cname=" + cname + ", regDate=" + regDate
            + ", update_date=" + update_date + ", cimage=" + cimage + ", price=" + price + ", detail=" + detail
            + "]";
   }
   
   public ClothVO() {
   }
   
   public ClothVO(String ccode, String cscode, String cname, Date regDate, Date update_date, String cimage, int price,
         String detail) {
      super();
      this.ccode = ccode;
      this.cscode = cscode;
      this.cname = cname;
      this.regDate = regDate;
      this.update_date = update_date;
      this.cimage = cimage;
      this.price = price;
      this.detail = detail;
   }
   
   
   
   
   
   
   
   

}