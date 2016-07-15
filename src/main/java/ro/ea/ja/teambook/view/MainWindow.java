package ro.ea.ja.teambook.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ro.ea.ja.teambook.domain.Player;
import ro.ea.ja.teambook.domain.PlayerEmployee;

public class MainWindow extends JFrame
{

	/**
	 * 
	 * @author altudor This class is a swing implementation of the GUI used for
	 *         this client
	 */
	private BufferedImage loginBackground;
	private BufferedImage mainWindowBackground;
	private JTextField fieldUser;
	private JTextField fieldPass;
	private JPanel panel;
	private JPanel container;
	private JPanel statsPanel;
	private JPanel menuContainer;
	private Dimension screenSize;
	private JPanel statsContainer;
	private JButton health;
	private JButton social;
	private JButton technic;
	private JButton softSkill;
	private JLabel healthLabel;
	private JLabel socialLabel;
	private JLabel technicLabel;
	private JLabel softSkillLabel;
	private JLabel star;

	public MainWindow()
	{
		initialize();
	}

	public static void main(String[] args)
	{
		MainWindow main = new MainWindow();
	}

	private void initialize()
	{
		try
		{
			loginBackground = ImageIO.read(getClass().getResource("/backgroundPics/reception.jpg"));
		}
		catch (IOException e)
		{

			e.printStackTrace();
		}
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLayout(null);
		this.setBounds(0, 0, screenSize.width / 2, screenSize.height / 2);
		// this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		panel = new JPanel()
		{
			@Override
			public void paintComponent(Graphics g)
			{
				if (loginBackground != null)
				{
					Graphics2D g2d = (Graphics2D) g.create();
					g2d.drawImage(loginBackground, 0, 0, this);
					g2d.dispose();
				}
			}
		};
		panel.setBounds(0, 0, screenSize.width / 2, screenSize.height / 2);
		panel.setVisible(true);

		container = new JPanel()
		{
			@Override
			protected void paintComponent(Graphics g)
			{
				Dimension arcs = new Dimension(15, 15);
				Graphics2D graphics = (Graphics2D) g;
				int width = getWidth();
				graphics.setColor(new Color(0, 0, 0, 190));
				graphics.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcs.width, arcs.height);
			}
		};
		container.setLayout(null);
		container.setBounds((getWidth() / 2 - 150), (getHeight() / 2 - 75), 300, 150);
		container.setOpaque(false);
		container.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(container);
		this.add(panel);

		JLabel signIn = new JLabel("TeamBook  SignIn");
		signIn.setBounds(90, 10, 150, 20);
		signIn.setFont(new Font("Serif", Font.PLAIN, 18));
		signIn.setForeground(Color.orange);
		container.add(signIn);

		JLabel lblUser = new JLabel("User : ");
		lblUser.setBounds(30, 60, 50, 20);
		lblUser.setForeground(Color.orange);
		container.add(lblUser);

		JLabel lblPass = new JLabel("Pass : ");
		lblPass.setBounds(30, 90, 50, 20);
		lblPass.setForeground(Color.orange);
		container.add(lblPass);

		fieldUser = new JTextField();
		fieldUser.setBounds(100, 60, 110, 20);
		container.add(fieldUser);

		fieldPass = new JTextField();
		fieldPass.setBounds(100, 90, 110, 20);
		container.add(fieldPass);

		repaint();
		addListenters();
	}

	private void playerStatsWindow(Player player)
	{
		menuContainer = new JPanel()
		{
			@Override
			protected void paintComponent(Graphics g)
			{
				Dimension arcs = new Dimension(15, 15);
				Graphics2D graphics = (Graphics2D) g;
				int width = getWidth();
				graphics.setColor(new Color(0, 0, 0, 190));
				graphics.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcs.width, arcs.height);
			}
		};
		menuContainer.setLayout(null);
		menuContainer.setBounds(120, 130, 780, 55);
		menuContainer.setOpaque(false);
		menuContainer.setVisible(true);

		statsContainer = new JPanel()
		{
			@Override
			protected void paintComponent(Graphics g)
			{
				Dimension arcs = new Dimension(15, 15);
				Graphics2D graphics = (Graphics2D) g;
				int width = getWidth();
				graphics.setColor(new Color(0, 0, 0, 190));
				graphics.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcs.width, arcs.height);
			}
		};
		statsContainer.setLayout(null);
		statsContainer.setBounds(350, 200, 550, 265);
		statsContainer.setOpaque(false);
		statsContainer.setVisible(true);
		this.remove(container);
		this.remove(panel);
		try
		{
			mainWindowBackground = ImageIO.read(getClass().getResource("/backgroundPics/playerStats.jpg"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("eroro");
		}
		statsPanel = new JPanel()
		{
			@Override
			public void paintComponent(Graphics g)
			{
				if (loginBackground != null)
				{
					Graphics2D g2d = (Graphics2D) g.create();
					g2d.drawImage(mainWindowBackground, 0, 0, this);
					g2d.dispose();
				}
			}
		};
		statsPanel.setBounds(0, 0, screenSize.width / 2, screenSize.height / 2);
		statsPanel.setVisible(true);
		this.add(statsContainer);
		this.add(menuContainer);
		this.add(statsPanel);
		repaint();
		JLabel userName = new JLabel("Hello, " + player.getFirstName());
		userName.setBounds(120, 80, 200, 40);
		userName.setFont(new Font("Serif", Font.PLAIN, 30));
		userName.setForeground(Color.orange);
		statsPanel.add(userName);

		ImageIcon addIcon = new ImageIcon(getClass().getResource("/backgroundPics/add.png"));
		JButton add = new JButton();
		add.setIcon(addIcon);
		add.setBounds(600, 30, addIcon.getIconWidth(), addIcon.getIconHeight());
		add.setVisible(true);
		add.setContentAreaFilled(false);
		add.setFocusPainted(false);
		statsPanel.add(add);

		ImageIcon settingsIcon = new ImageIcon(getClass().getResource("/backgroundPics/settings.png"));
		JButton settings = new JButton();
		settings.setIcon(settingsIcon);
		settings.setBounds(700, 30, settingsIcon.getIconWidth(), settingsIcon.getIconHeight());
		settings.setVisible(true);
		settings.setContentAreaFilled(false);
		settings.setFocusPainted(false);
		statsPanel.add(settings);

		ImageIcon logoutIcon = new ImageIcon(getClass().getResource("/backgroundPics/logout.png"));
		JButton logout = new JButton();
		logout.setIcon(logoutIcon);
		logout.setBounds(800, 30, logoutIcon.getIconWidth(), logoutIcon.getIconHeight());
		logout.setVisible(true);
		logout.setContentAreaFilled(false);
		logout.setFocusPainted(false);
		statsPanel.add(logout);

		ImageIcon picture = showPlayerPhoto();
		JLabel photo = new JLabel();
		photo.setIcon(picture);
		photo.setBounds(120, 200, picture.getIconWidth(), picture.getIconHeight());
		photo.setVisible(true);
		statsPanel.add(photo);

		health = new JButton("HEALTH");
		health.setFont(new Font("Serif", Font.PLAIN, 30));
		health.setBounds(20, 10, 160, 35);
		menuContainer.add(health);

		social = new JButton("SOCIAL");
		social.setFont(new Font("Serif", Font.PLAIN, 30));
		social.setBounds(190, 10, 160, 35);
		menuContainer.add(social);

		technic = new JButton("TECHNIC");
		technic.setFont(new Font("Serif", Font.PLAIN, 30));
		technic.setBounds(360, 10, 180, 35);
		menuContainer.add(technic);

		softSkill = new JButton("SOFT SKILL");
		softSkill.setFont(new Font("Serif", Font.PLAIN, 30));
		softSkill.setBounds(550, 10, 210, 35);
		menuContainer.add(softSkill);

		healthLabel = new JLabel("HEALTH");
		healthLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		healthLabel.setForeground(Color.orange);
		healthLabel.setBounds(10, 25, 100, 20);
		statsContainer.add(healthLabel);

		socialLabel = new JLabel("SOCIAL");
		socialLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		socialLabel.setForeground(Color.orange);
		socialLabel.setBounds(10, 85, 100, 20);
		statsContainer.add(socialLabel);

		technicLabel = new JLabel("TECHNIC");
		technicLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		technicLabel.setForeground(Color.orange);
		technicLabel.setBounds(10, 145, 100, 20);
		statsContainer.add(technicLabel);

		softSkillLabel = new JLabel("SOFT SKILL");
		softSkillLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		softSkillLabel.setForeground(Color.orange);
		softSkillLabel.setBounds(10, 205, 120, 20);
		statsContainer.add(softSkillLabel);
		// TODO stuff in controller to figure out how many stars would be shown

		int health = 0;
		int social = 0;
		int tech = 0;
		int selfDev = 0;

		for (int i = 0; i < player.getCategories().size(); i++)
		{
			switch (player.getCategories().get(i).getType())
			{
			case HEALTH:
				health = player.getCategories().get(i).getStars();
				break;
			case SOCIAL:
				social = player.getCategories().get(i).getStars();
				break;
			case TECH:
				tech = player.getCategories().get(i).getStars();
				break;
			case SELFDEV:
				selfDev = player.getCategories().get(i).getStars();
				break;
			default:
				System.out.println("No enum Type was found!");
			}
		}

		addStarStats(health, social, tech, selfDev);
		showBlackStars();

	}

	public void showBlackStars()
	{
		ImageIcon starPic = new ImageIcon(getClass().getResource("/backgroundPics/blackStar.png"));
		int pozX = 140;
		int pozY = 20;
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				star = new JLabel(starPic);
				star.setBounds(pozX, pozY, 30, 30);
				pozX += 40;
				statsContainer.add(star);
			}
			pozX = 140;
			pozY += 60;
		}
	}

	public void addStarStats(int healthStarsNo, int socialStarsNo, int technicStarsNo, int skillStarsNo)
	{

		ImageIcon starPic = new ImageIcon(getClass().getResource("/backgroundPics/smallStar.png"));

		int poz = 140;
		for (int i = 0; i < healthStarsNo; i++)
		{
			star = new JLabel(starPic);
			star.setBounds(poz, 20, 30, 30);
			poz += 40;
			statsContainer.add(star);
		}
		poz = 140;
		for (int i = 0; i < socialStarsNo; i++)
		{
			star = new JLabel(starPic);
			star.setBounds(poz, 80, 30, 30);
			poz += 40;
			statsContainer.add(star);
		}
		poz = 140;
		for (int i = 0; i < technicStarsNo; i++)
		{
			star = new JLabel(starPic);
			star.setBounds(poz, 140, 30, 30);
			poz += 40;
			statsContainer.add(star);
		}
		poz = 140;
		for (int i = 0; i < skillStarsNo; i++)
		{
			star = new JLabel(starPic);
			star.setBounds(poz, 200, 30, 30);
			poz += 40;
			statsContainer.add(star);
		}
	}

	public void addListenters()
	{
		fieldPass.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					PlayerEmployee employee = new PlayerEmployee();
					Player playerWithId = employee.getReaderRole().getPlayer(fieldUser.getText(), fieldPass.getText());

					if (playerWithId != null)
					{
						playerStatsWindow(playerWithId);
					}
				}
			}
		});
	}

	public ImageIcon showPlayerPhoto()
	{
		// TODO stuff in controller to get the players photo
		return new ImageIcon(getClass().getResource("/backgroundPics/picturePlaceholder.png"));
	}
}
