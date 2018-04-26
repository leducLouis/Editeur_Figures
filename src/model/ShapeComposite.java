package model;

import java.util.ArrayList;

public class ShapeComposite implements ShapeComposant {
	
	private ShapeComposant state;
	private ArrayList<ShapeComposant> Shapes = new ArrayList<ShapeComposant>();
	
	public ShapeComposite() {
		state = this;
		createMemento();
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
		return new BoardMemento(state);
	}
	
	@Override
	public void translation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getXpos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setXpos(int xpos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getYpos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setYpos(int ypos) {
		// TODO Auto-generated method stub
		
	}

}
