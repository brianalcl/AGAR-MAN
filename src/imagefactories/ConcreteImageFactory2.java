package imagefactories;

import javax.swing.Icon;

/**
 * Modela la fabrica de imagenes de dungeon.
 */
public class ConcreteImageFactory2 extends ImageFactory {

	/**
	 * Crea una nueva fabrica de imagenes de cell en blanco y negro.
	 */
	public ConcreteImageFactory2() {
		super();
	}

	@Override
	public Icon getLabyrinth1Image() {
		return getIcon("/res/img/cellBlack/maps/labyrinth1.png");
	}
	
	@Override
	public Icon getLabyrinth2Image() {
		return getIcon("/res/img/cellBlack/maps/labyrinth2.png");
	}
	
	@Override
	public Icon getLabyrinth3Image() {
		return getIcon("/res/img/cellBlack/maps/labyrinth3.png");
	}
	
	@Override
	public Icon getLabyrinth1bgImage() {
		return getIcon("/res/img/cellBlack/maps/labyrinthbg.png");
	}

	@Override
	public Icon getLabyrinth2bgImage() {
		return getIcon("/res/img/cellBlack/maps/labyrinthbg.png");
	}

	@Override
	public Icon getLabyrinth3bgImage() {
		return getIcon("/res/img/cellBlack/maps/labyrinthbg.png");
	}

	@Override
	public Icon getGameOverBgImage() {
		return getIcon("/res/img/cellBlack/gui/bg.png");
	}
	
	@Override
	public Icon getStartBgImage() {
		return getIcon("/res/img/cellBlack/gui/bg.png");
	}
	
	@Override
	public Icon getStatsBgImage() {
		return getIcon("/res/img/cellBlack/gui/bg.png");
	}
	
	@Override
	public Icon[] getPlayerImages() {
		Icon[] toReturn = new Icon[6];
		
		toReturn[0] = getIcon("/res/img/cellBlack/entity/character/player/playerU.png");
		toReturn[1] = getIcon("/res/img/cellBlack/entity/character/player/playerR.png");
		toReturn[2] = getIcon("/res/img/cellBlack/entity/character/player/playerD.png");
		toReturn[3] = getIcon("/res/img/cellBlack/entity/character/player/playerL.png");
		
		toReturn[4] = getSpeedEffectImage();
		
		toReturn[5] = getIcon("/res/img/cellBlack/entity/character/player/Effect.gif");
		
		return toReturn;
	}

	@Override
	public Icon[] getPinkEnemyImages() {
		Icon[] toReturn = new Icon[10];
		Icon[] fleeingIcons = getFleeingEnemyImages();
		
		toReturn[0] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1U.png");
		toReturn[1] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1R.png");
		toReturn[2] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1D.png");
		toReturn[3] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1L.png");
		
		toReturn[4] = getSpeedEffectImage();
		
		toReturn[5] = fleeingIcons[0];
		toReturn[6] = fleeingIcons[1];
		toReturn[7] = fleeingIcons[2];
		toReturn[8] = fleeingIcons[3];
		
		toReturn[9] = getStunEffectImage();
		
		return toReturn;
	}

	@Override
	public Icon[] getRedEnemyImages() {
		Icon[] toReturn = new Icon[10];
		Icon[] fleeingIcons = getFleeingEnemyImages();
		
		toReturn[0] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1U.png");
		toReturn[1] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1R.png");
		toReturn[2] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1D.png");
		toReturn[3] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1L.png");
		
		toReturn[4] = getSpeedEffectImage();
		
		toReturn[5] = fleeingIcons[0];
		toReturn[6] = fleeingIcons[1];
		toReturn[7] = fleeingIcons[2];
		toReturn[8] = fleeingIcons[3];
		
		toReturn[9] = getStunEffectImage();
		
		return toReturn;
	}

	@Override
	public Icon[] getOrangeEnemyImages() {
		Icon[] toReturn = new Icon[10];
		Icon[] fleeingIcons = getFleeingEnemyImages();
		
		toReturn[0] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1U.png");
		toReturn[1] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1R.png");
		toReturn[2] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1D.png");
		toReturn[3] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1L.png");
		
		toReturn[4] = getSpeedEffectImage();
		
		toReturn[5] = fleeingIcons[0];
		toReturn[6] = fleeingIcons[1];
		toReturn[7] = fleeingIcons[2];
		toReturn[8] = fleeingIcons[3];
		
		toReturn[9] = getStunEffectImage();
		
		return toReturn;
	}

	@Override
	public Icon[] getCyanEnemyImages() {
		Icon[] toReturn = new Icon[10];
		Icon[] fleeingIcons = getFleeingEnemyImages();
		
		toReturn[0] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1U.png");
		toReturn[1] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1R.png");
		toReturn[2] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1D.png");
		toReturn[3] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy1L.png");
		
		toReturn[4] = getSpeedEffectImage();
		
		toReturn[5] = fleeingIcons[0];
		toReturn[6] = fleeingIcons[1];
		toReturn[7] = fleeingIcons[2];
		toReturn[8] = fleeingIcons[3];
		
		toReturn[9] = getStunEffectImage();
		
		return toReturn;
	}
	
	@Override
	protected Icon getSpeedEffectImage() {
		return getIcon("/res/img/cellBlack/entity/character/player/Effect.gif");
	}
	
	@Override
	protected Icon getStunEffectImage() {
		return getIcon("/res/img/cellBlack/entity/character/enemy/stunEffect.png");
	}
	
	/**
	 * Retorna un arreglo de 4 componentes con los iconos del enemigo escapando.
	 * @return Un arreglo de 4 componentes con los iconos del enemigo escapando.
	 */
	protected Icon[] getFleeingEnemyImages() {
		Icon[] toReturn = new Icon[4];
		toReturn[0] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy2U.png");
		toReturn[1] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy2R.png");
		toReturn[2] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy2D.png");
		toReturn[3] = getIcon("/res/img/cellBlack/entity/character/enemy/enemy2L.png");
		return toReturn;
	}

	@Override
	public Icon getDotImage() {
		return getIcon("/res/img/cellBlack/entity/staticentity/dot.png");
	}

	@Override
	public Icon getPowerPelletImage() {
		return getIcon("/res/img/cellBlack/entity/staticentity/powerpellet.png");
	}

	@Override
	public Icon getFruit1Image() {
		return getIcon("/res/img/cellBlack/entity/staticentity/fruit1.png");
	}
	
	@Override
	public Icon getFruit2Image() {
		return getIcon("/res/img/cellBlack/entity/staticentity/fruit2.png");
	}
	
	@Override
	public Icon getFruit3Image() {
		return getIcon("/res/img/cellBlack/entity/staticentity/fruit3.png");
	}
	
	@Override
	public Icon getPotion1() {
		return getIcon("/res/img/cellBlack/entity/staticentity/potion1.png");
	}
	
	@Override
	public Icon getPotion2() {
		return getIcon("/res/img/cellBlack/entity/staticentity/potion2.png");
	}
	
	@Override
	public Icon getPotion3() {
		return getIcon("/res/img/cellBlack/entity/staticentity/potion3.png");
	}
	
	@Override
	public Icon getBombImage() {
		return getIcon("/res/img/cellBlack/entity/staticentity/bomb.png");
	}
	
	@Override
	public Icon getExplosionImage() {
		return getIcon("/res/img/cellBlack/entity/staticentity/explosion.png");
	}
}
