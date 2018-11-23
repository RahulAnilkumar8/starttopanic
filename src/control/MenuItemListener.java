package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenuItem;

import entity.EntityType;
import entity.Zombie;
import game.Game;
import game.GameState;
import level.Level;
import view.View;

public class MenuItemListener implements ActionListener{

	private View view;
	private Game model;
	
	/**
	 * constructor for the listener
	 * @param view the view that is being used by the game
	 * @param model is the model that is being used by the game
	 */
	public MenuItemListener(View view, Game model) {
		this.view = view;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		if (view.getRestartMenu() == (JMenuItem) object) {
			model.resetGame(view, model);
		} else if (view.getCheatMenu() == (JMenuItem) object) {
			String cheatCode = "";
			cheatCode = view.getCheatCode();
			model.addCheat(cheatCode);
		}
		
	}

}