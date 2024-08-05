package com.Aurionpro.Model;

public class Box {
   private int height;
   private int width;
   private int length;
   
   public Box()
   {   
   }
   
   public Box(int height ,int width,int length)
   {
	   this.height =height;
	   this.width = width;
	   this.length=length;
	   
   }
   
   public int getWidth()
   {
	   return this.width;
   }
   
   public int getHeight()
   {
	   return this.height;
   }
   
   public int getLength()
   {
	   return this.length;
   }
   
   public void setWidth(int w)
   {
	   this.width =w;
   }
   
   public void setHeight(int h)
   {
	   this.height =h;
   }
      
   public void setLength(int l)
   {
	   this.length =l;
   }
  
   
   public void area()
   {
	   System.out.println("Area is "+ (this.length * this.width * this.height));
   }
  
}
