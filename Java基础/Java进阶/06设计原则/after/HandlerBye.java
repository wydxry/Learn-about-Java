package ���ԭ��.after;

public class HandlerBye extends Handler{
	public HandlerBye(Game game){
		super(game);
	}

	@Override
	public boolean isBye() {
		return true;
	}
	
}
