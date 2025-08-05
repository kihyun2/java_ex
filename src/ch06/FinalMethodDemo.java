package ch06;

public class FinalMethodDemo {
	public static void main(String[] args) {

	}
}

class Chess {
	enum ChessPlayer {
		BLACK, WHITE
	}

	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}

	class WorldChess extends Chess {
//		@Override
//		ChessPlayer getFirstPlayer() {
//			return ChessPlayer.BLACK;
//		}
	}
}
