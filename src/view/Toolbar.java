package view;


import model.Shape;

public interface Toolbar {
	//permet de resize les shape que l'on met dans la toolbar
	public void resize(Shape s);
	public void delete(Shape s);
}
