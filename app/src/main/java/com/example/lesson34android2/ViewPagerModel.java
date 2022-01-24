package com.example.lesson34android2;

public class ViewPagerModel {
   private String title;
   private String description;
   private int image;
   private String skip;

   public String getSkip() {
      return skip;
   }


   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getImage() {
      return image;
   }

   public void setImage(int image) {
      this.image = image;
   }

   public ViewPagerModel(String title, String description, int image,String skip) {
      this.title = title;
      this.description = description;
      this.image = image;
      this.skip = skip;
   }
}
