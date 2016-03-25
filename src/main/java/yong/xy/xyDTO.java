package yong.xy;

public class xyDTO {
   
   private int idx;
   private int x;
   private int y;
   private int width;
   private int height;
   
   public xyDTO() {
      // TODO Auto-generated constructor stub
   }

   public xyDTO(int idx, int x, int y, int width, int height) {
      super();
      this.idx = idx;
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }

   public int getIdx() {
      return idx;
   }

   public void setIdx(int idx) {
      this.idx = idx;
   }

   public int getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }

   public int getWidth() {
      return width;
   }

   public void setWidth(int width) {
      this.width = width;
   }

   public int getHeight() {
      return height;
   }

   public void setHeight(int height) {
      this.height = height;
   }
   
}