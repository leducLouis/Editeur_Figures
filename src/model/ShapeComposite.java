package model;

import java.util.ArrayList;

public class ShapeComposite implements ShapeComposant {
	
	private ShapeComposant state;
	private ArrayList<ShapeComposant> Shapes = new ArrayList<ShapeComposant>();
	
	public ShapeComposite() {
		state = this;
	}

	@Override
	public void addEntity(ShapeComposant s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEntity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getChildren() {
		// TODO Auto-generated method stub
		
	}
	
	public void setMemento(BoardMemento m) {
		state = m.getState();
	}
	
	public BoardMemento createMemento() {
		return new BoardMemento(this);
	}

}
