package model;

public class BoardMemento implements Memento {
	ShapeComposant state;
	public BoardMemento(ShapeComposant group) {
		state = group;
	}
	public ShapeComposant getState() {
		return state;
	}
	
	public void setState(ShapeComposant s) {
		state = s;
	}
}
