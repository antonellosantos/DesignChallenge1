package Challenge2; 
public class GraphicEditor extends Shape{
	
	public void drawShape(Shape s) {
      	if (s.m_type==1)
             	drawRectangle(s);
      	else if (s.m_type==2)
             	drawCircle(s);
      	else if (s.m_type==3)
      			drawTriangle(s);
      	else if (s.m_type==4)
      			drawStar(s);
	}
	public void drawCircle(Circle r) {} 
	public void drawRectangle(Rectangle r) {}
	public void drawTriangle(Triangle r) {}
	public void drawStar(Star r) {}
}


