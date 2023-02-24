package com.puppy.witchcraft.game.view.pages;

import static com.puppy.witchcraft.common.CommonConstants.changePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.puppy.witchcraft.common.MainFrame;
import com.puppy.witchcraft.game.controller.Forest1Controller;
import com.puppy.witchcraft.game.model.dto.ItemDTO;
import com.puppy.witchcraft.game.model.dto.PlayerDTO;
import com.puppy.witchcraft.game.view.ForestMenu;

public class Forestthird extends JPanel{


	private MainFrame mf;
	private Forestthird forestthird;

	public Forestthird(MainFrame mf) {

		PlayerDTO pp = new PlayerDTO();
		pp.setPlayerNo(1);
		
		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.forestthird = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/bg_forest03.png"));
		background.setBounds(0, -15, 800, 580);

		/* 라벨에 타이틀로고 삽입 */
		JLabel logo = new JLabel(new ImageIcon("images/ui/title_logo"));
		logo.setBounds(180, 90, 440, 160);

		/* 로그인 버튼 생성 */
		JButton forestgoBtn = new JButton(new ImageIcon("images/select/forest/forest3-touch1.png"));
		forestgoBtn.setBounds(190, 410, 115, 95);
		forestgoBtn.setContentAreaFilled(false);
		forestgoBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Forest1Controller foresttst1Controller = new Forest1Controller();
				ItemDTO item = foresttst1Controller.selectforestitem();
				JOptionPane.showMessageDialog(null,"재료가 채집되었습니다.");
				foresttst1Controller.insertforestitem(item, pp);
			}
		});

		JButton forestgoBtn1 = new JButton(new ImageIcon("images/select/forest/forest3-touch2.png"));
		forestgoBtn1.setBounds(500, 275, 115, 95);
		forestgoBtn1.setContentAreaFilled(false);
		forestgoBtn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Forest1Controller foresttst1Controller = new Forest1Controller();
				ItemDTO item = foresttst1Controller.selectforestitem();
				JOptionPane.showMessageDialog(null,"재료가 채집되었습니다.");
				foresttst1Controller.insertforestitem(item, pp);
			}
		});
		
		JButton forestgoBtn2 = new JButton(new ImageIcon("images/select/forest/forest3-touch3.png"));
		forestgoBtn2.setBounds(540, 60, 115, 95);
		forestgoBtn2.setContentAreaFilled(false);
		forestgoBtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Forest1Controller foresttst1Controller = new Forest1Controller();
				ItemDTO item = foresttst1Controller.selectforestitem();
				JOptionPane.showMessageDialog(null,"재료가 채집되었습니다.");
				foresttst1Controller.insertforestitem(item, pp);
			}
		});
		
		JButton invenBtn = new JButton(new ImageIcon("images/ui/ui_inventory.png"));
		invenBtn.setBounds(620, 460, 70, 70);
		invenBtn.setContentAreaFilled(false);

		JButton recipeBtn = new JButton(new ImageIcon("images/ui/ui_recipe.png"));
		recipeBtn.setBounds(710, 460, 70, 70);
		recipeBtn.setContentAreaFilled(false);


		JButton forestexit = new JButton(new ImageIcon("images/ui/button_quit.png"));
		forestexit.setBounds(0, 460, 170, 70);
		forestexit.setContentAreaFilled(false);

		/* 나가기 버튼 클릭 시 숲 선택화면으로 이동 */
		forestexit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, forestthird , new ForestMenu(mf));
			}
		});

		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 800, 580);

		/* 패널에 컴포넌트들 삽입 */
		this.add(logo);

		this.add(forestgoBtn);
		this.add(forestgoBtn1);
		this.add(forestgoBtn2);
		this.add(forestexit);
		this.add(invenBtn);
		this.add(recipeBtn);
		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
	}
}
