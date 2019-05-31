package com.bae.blackjack.mainapp;

import java.util.Random;

public class BlackJack {
	Random random;

	public static void main(String[] args) {
		new BlackJack();
	}

	public BlackJack() {
		random = new Random();
		
	}

	public int play(int player, int dealer) {
		if ((3<player&&player<=21)&& dealer!=21) {
			return player;			
	}
		else if(3<dealer && dealer<16) {
		return dealer + twist(dealer);
	}
		else if (player<=21 && dealer<=21 && player<dealer) {
			return dealer;
		}
		else if(player>30 | dealer>30) {
	        return -1;	
		}		
		else if (player<3 | dealer<3) {
			return -1;
		}
		else if (player<3 && dealer<3) {
			return -1;
		}
		else if(player>30 && dealer>30) {
			return -1;
		}
		else if (player>21 && dealer>21)
		{ return 0;
		}
	else {
		return dealer;
	}
	}
	
	public int twist(int dealer) {
		int card= random.nextInt(10)+1;
		if (dealer+card>21 && card==11) {
			card=1;
		}
		return card;
		
	}
}

