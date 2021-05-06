package concrete;

import Entities.Game;
import interfaces.GameService;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" oyunu eklendi");
		
	}

	@Override
	public void remove(Game game) {
		System.out.println(game.getGameName()+ " oyunu silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ "oyunu guncellendi");
		
	}

}
