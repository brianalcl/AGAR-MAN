package imagefactories;

import javax.swing.Icon;

/**
 * Modela la fabrica de imagenes de cell.
 */
public class ConcreteImageFactory1 extends ImageFactory {
	
	/**
	 * Crea una nueva fabrica de imagenes de cell.
	 */
	public ConcreteImageFactory1() {
		super();
	}

	@Override
	public Icon getLabyrinth1Image() {
		return getIcon("/res/img/cell/maps/labyrinth1.png");
	}
	
	@Override
	public Icon getLabyrinth2Image() {
		return getIcon("/res/img/cell/maps/labyrinth2.png");
	}
	
	@Override
	public Icon getLabyrinth3Image() {
		return getIcon("/res/img/cell/maps/labyrinth3.png");
	}
	
	@Override
	public Icon getLabyrinth1bgImage() {
		return getIcon("/res/img/cell/maps/labyrinth1bg.png");
	}

	@Override
	public Icon getLabyrinth2bgImage() {
		return getIcon("/res/img/cell/maps/labyrinth2bg.png");
	}

	@Override
	public Icon getLabyrinth3bgImage() {
		return getIcon("/res/img/cell/maps/labyrinth3bg.png");
	}

	@Override
	public Icon getGameOverBgImage() {
		return getIcon("/res/img/cell/gui/gameOverBg.png");
	}
	
	@Override
	public Icon getStartBgImage() {
		return getIcon("/res/img/cell/gui/startBg.png");
	}
	
	@Override
	public Icon getStatsBgImage() {
		return getIcon("/res/img/cell/gui/statsBg.png");
	}
	
	@Override
	public Icon[] getPlayerImages() {
		Icon[] toReturn = new Icon[6];
		
		toReturn[0] = getIcon("/res/img/cell/entity/character/player/playerU.png");
		toReturn[1] = getIcon("/res/img/cell/entity/character/player/playerR.png");
		toReturn[2] = getIcon("/res/img/cell/entity/character/player/playerD.png");
		toReturn[3] = getIcon("/res/img/cell/entity/character/player/playerL.png");
		
		toReturn[4] = getSpeedEffectImage();
		
		toReturn[5] = getIcon("/res/img/cell/entity/character/player/shieldEffect.gif");
		
		return toReturn;
	}

	@Override
	public Icon[] getPinkEnemyImages() {
		Icon[] toReturn = new Icon[10];
		Icon[] fleeingIcons = getFleeingEnemyImages();
		
		toReturn[0] = getIcon("/res/img/cell/entity/character/enemy/pink/pinkU.png");
		toReturn[1] = getIcon("/res/img/cell/entity/character/enemy/pink/pinkR.png");
		toReturn[2] = getIcon("/res/img/cell/entity/character/enemy/pink/pinkD.png");
		toReturn[3] = getIcon("/res/img/cell/entity/character/enemy/pink/pinkL.png");
		
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
		
		toReturn[0] = getIcon("/res/img/cell/entity/character/enemy/red/redU.png");
		toReturn[1] = getIcon("/res/img/cell/entity/character/enemy/red/redR.png");
		toReturn[2] = getIcon("/res/img/cell/entity/character/enemy/red/redD.png");
		toReturn[3] = getIcon("/res/img/cell/entity/character/enemy/red/redL.png");
		
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
		
		toReturn[0] = getIcon("/res/img/cell/entity/character/enemy/orange/orangeU.png");
		toReturn[1] = getIcon("/res/img/cell/entity/character/enemy/orange/orangeR.png");
		toReturn[2] = getIcon("/res/img/cell/entity/character/enemy/orange/orangeD.png");
		toReturn[3] = getIcon("/res/img/cell/entity/character/enemy/orange/orangeL.png");
		
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
		
		toReturn[0] = getIcon("/res/img/cell/entity/character/enemy/cyan/cyanU.png");
		toReturn[1] = getIcon("/res/img/cell/entity/character/enemy/cyan/cyanR.png");
		toReturn[2] = getIcon("/res/img/cell/entity/character/enemy/cyan/cyanD.png");
		toReturn[3] = getIcon("/res/img/cell/entity/character/enemy/cyan/cyanL.png");
		
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
		return getIcon("/res/img/cell/entity/character/speedEffect.gif");
	}
	
	@Override
	protected Icon getStunEffectImage() {
		return getIcon("/res/img/cell/entity/character/enemy/stunEffect.png");
	}
	
	/**
	 * Retorna un arreglo de 4 componentes con los iconos del enemigo escapando.
	 * @return Un arreglo de 4 componentes con los iconos del enemigo escapando.
	 */
	protected Icon[] getFleeingEnemyImages() {
		Icon[] toReturn = new Icon[4];
		toReturn[0] = getIcon("/res/img/cell/entity/character/enemy/blue/blueU.png");
		toReturn[1] = getIcon("/res/img/cell/entity/character/enemy/blue/blueR.png");
		toReturn[2] = getIcon("/res/img/cell/entity/character/enemy/blue/blueD.png");
		toReturn[3] = getIcon("/res/img/cell/entity/character/enemy/blue/blueL.png");
		return toReturn;
	}

	@Override
	public Icon getDotImage() {
		return getIcon("/res/img/cell/entity/staticentity/dot.png");
	}

	@Override
	public Icon getPowerPelletImage() {
		return getIcon("/res/img/cell/entity/staticentity/powerpellet.png");
	}

	@Override
	public Icon getFruit1Image() {
		return getIcon("/res/img/cell/entity/staticentity/fruit1.png");
	}
	
	@Override
	public Icon getFruit2Image() {
		return getIcon("/res/img/cell/entity/staticentity/fruit2.png");
	}
	
	@Override
	public Icon getFruit3Image() {
		return getIcon("/res/img/cell/entity/staticentity/fruit3.png");
	}
	
	@Override
	public Icon getPotion1() {
		return getIcon("/res/img/cell/entity/staticentity/potion1.png");
	}
	
	@Override
	public Icon getPotion2() {
		return getIcon("/res/img/cell/entity/staticentity/potion2.png");
	}
	
	@Override
	public Icon getPotion3() {
		return getIcon("/res/img/cell/entity/staticentity/potion3.png");
	}
	
	@Override
	public Icon getBombImage() {
		return getIcon("/res/img/cell/entity/staticentity/bomb.png");
	}
	
	@Override
	public Icon getExplosionImage() {
		return getIcon("/res/img/cell/entity/staticentity/explosion.png");
	}

}
